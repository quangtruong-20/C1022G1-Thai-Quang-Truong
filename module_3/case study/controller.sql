create database controller;
use furama_resort;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select ho_va_ten from nhan_vien 
where 
substring_index(ho_va_ten, ' ', -1) like 'H%'
or substring_index(ho_va_ten, ' ', -1) like 'K%'
or substring_index(ho_va_ten, ' ', -1) like 'T%'
and char_length(ho_va_ten) <= 15;
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
where (year(curdate()) - year(ngay_sinh)) between 18 and 50
and dia_chi like '%Đà Nẵng' or dia_chi like '%quảng Trị';
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select khach_hang.ma_khach_hang, khach_hang.ho_va_ten, count(hop_dong.ma_hop_dong) as so_lan_dat_phong
from khach_hang
left join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
left join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
where loai_khach.ten_loai_khach = 'Diamond'
group by khach_hang.ma_khach_hang
order by so_lan_dat_phong asc;

-- 5. 
select khach_hang.ma_khach_hang, khach_hang.ho_va_ten, loai_khach.ten_loai_khach, hop_dong.ma_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, (dich_vu.chi_phi_thue + SUM(hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia)) as tong_tien
from khach_hang 
left join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
left join hop_dong on  khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
left join dich_vu  on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
left join  hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem  on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
group by  khach_hang.ma_khach_hang, hop_dong.ma_hop_dong;
-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt
-- từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
where dv.ma_dich_vu not in ( 
select hd.ma_dich_vu  
from hop_dong hd
where( year(hd.ngay_lam_hop_dong) = 2021 and month(hd.ngay_lam_hop_dong) between 1 and 3)
)
group by dv.ma_dich_vu,dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, ldv.ten_loai_dich_vu
order by dv.dien_tich desc;

-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020
-- nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
where dv.ma_dich_vu in ( select hop_dong.ma_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong) =2020)
and dv.ma_dich_vu  not in ( select hop_dong.ma_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong) =2021)
group by  dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue, ldv.ten_loai_dich_vu
;

-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- c1
select kh.ho_va_ten from khach_hang kh
group by kh.ho_va_ten;
-- c2
select distinct kh.ho_va_ten from khach_hang kh;
-- c3
select kh.ho_va_ten  
from khach_hang kh
group by kh.ho_va_ten
having count(kh.ho_va_ten) < 3 ;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hd.ngay_lam_hop_dong) as thang , count(hd.ma_khach_hang) as so_luong_khach_hang
from hop_dong hd 
where year(hd.ngay_lam_hop_dong) = 2021
group by thang
order by thang
;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm.
 -- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, 
 -- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
 select hd.ma_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, hd.tien_dat_coc, sum(ifnull(hdct.so_luong,0)) as so_luong_dich_vu_di_kem
 from hop_dong hd 
 left join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
 group by hd.ma_hop_dong
 order by hd.ma_hop_dong ;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dvdk.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem 
from dich_vu_di_kem dvdk 
join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
join hop_dong hd on hd.ma_hop_dong = hdct.ma_hop_dong
join khach_hang kh on kh.ma_khach_hang = hd.ma_khach_hang
join loai_khach lk on lk.ma_loai_khach= kh.ma_loai_khach
where ten_loai_khach = 'Diamond' and dia_chi like '%Vinh' or dia_chi like '%Quảng Ngãi';

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc
--  của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

select hd.ma_hop_dong, nv.ho_va_ten,kh.ho_va_ten,kh.so_dien_thoai,dv.ten_dich_vu,sum(ifnull(hdct.so_luong,0)) as so_luong_dich_vu_di_kem, hd.tien_dat_coc
from dich_vu dv 
left join hop_dong hd on dv.ma_dich_vu = hd.ma_dich_vu
left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
left join khach_hang kh on kh.ma_khach_hang = hd.ma_khach_hang
left join nhan_vien nv on nv.ma_nhan_vien = hd.ma_nhan_vien
where dv.ma_dich_vu in (select hop_dong.ma_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong) =2020 and month(hop_dong.ngay_lam_hop_dong) between 10 and 12 )
and dv.ma_dich_vu not in (select hop_dong.ma_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong) =2021 and month(hop_dong.ngay_lam_hop_dong) between 1 and 6 )
group by hd.ma_hop_dong, nv.ho_va_ten,kh.ho_va_ten,kh.so_dien_thoai,dv.ten_dich_vu,hd.tien_dat_coc;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dvdk.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem, sum(hdct.so_luong) as so_luong_dich_vu_di_kem 
from dich_vu_di_kem dvdk 
join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by dvdk.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem
having 
  so_luong_dich_vu_di_kem >= (
    select 
      max(hop_dong_chi_tiet.so_luong) 
    from 
      hop_dong_chi_tiet
  );

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
set sql_mode=(select replace(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
select hd.ma_hop_dong, ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(dvdk.ma_dich_vu_di_kem) as so_lan_su_dung
from dich_vu dv 
join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
join hop_dong hd on dv.ma_dich_vu = hd.ma_dich_vu
join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by dvdk.ten_dich_vu_di_kem
having so_lan_su_dung = 1 
order by hd.ma_hop_dong;


-- 15. Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới 
-- chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
-- so_lan_lap_hd < 4 and 
select nv.ma_nhan_vien, nv.ho_va_ten, td.ten_trinh_do, bp.ten_bo_phan, nv.so_dien_thoai, nv.dia_chi ,count(hd.ma_hop_dong) as so_lan_lap_hd
from nhan_vien nv 
join trinh_do  td on nv.ma_trinh_do = td.ma_trinh_do
join bo_phan bp on nv.ma_bo_phan = bp.ma_bo_phan
join hop_dong hd on hd.ma_nhan_vien = nv.ma_nhan_vien
where year(hd.ngay_lam_hop_dong) between 2020 and 2021
group by nv.ma_nhan_vien, nv.ho_va_ten, td.ten_trinh_do, bp.ten_bo_phan, nv.so_dien_thoai, nv.dia_chi 
having so_lan_lap_hd < 4
order by nv.ma_nhan_vien;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
delete from nhan_vien nv
where nv.ma_nhan_vien not in 
(select ma_nhan_vien from hop_dong hd
where year(hd.ngay_lam_hop_dong) between 2019 and 2021);

select * from nhan_vien

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
-- update loai_khach lk
-- set ten_loai_khach = 'Diamond'
-- where ten_loai_khach = 'Platinum' and 
--  lk.ma_loai_khach= (select sum(chi_phi_thue) from dich_vu dv join hop_dong hd on dv.ma_dich_vu = hd.ma_dich_vu where year(hd.ngay_lam_hop_dong)=2021) > 10000000 ;



select * from khach_hang kh join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
set 
foreign_key_checks = 0;
delete from khach_hang kh 
where kh.ma_khach_hang 
in (select hd.ma_khach_hang from hop_dong hd where year(hd.ngay_lam_hop_dong) < 2021 );

select * from khach_hang;
-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
update dich_vu_di_kem dvdk
set dvdk.gia = dvdk.gia * 2
where dvdk.ma_dich_vu_di_kem = (
select hdct.ma_dich_vu_di_kem 
from hop_dong_chi_tiet hdct 
join hop_dong hd on hdct.ma_hop_dong = hd.ma_hop_dong 
where hdct.so_luong >10  and year(hd.ngay_lam_hop_dong) = 2020);

select * from dich_vu_di_kem ;
select * from hop_dong_chi_tiet ;

-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select ma_nhan_vien,ho_va_ten,email,so_dien_thoai,ngay_sinh,dia_chi from nhan_vien 
union 
select ma_khach_hang,ho_va_ten,email,so_dien_thoai,ngay_sinh,dia_chi from Khach_hang;

