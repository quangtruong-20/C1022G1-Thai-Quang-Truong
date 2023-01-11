create database controller;
use furama_resort;

select * from vi_tri; 
select * from trinh_do;
select * from bo_phan;
select * from nhan_vien;
select * from loai_khach;
select * from khach_hang;
select * from loai_dich_vu;
select * from kieu_thue;
select * from dich_vu;
select * from dich_vu_di_kem;
select * from hop_dong;
select * from hop_dong_chi_tiet;

-- 2 
select * from nhan_vien  where ho_va_ten like'H%' or ho_va_ten like  'T%' or ho_va_ten like'K%' and ho_va_ten  limit 0,15;
-- 3
select * from nhan_vien  where ngay_sinh between 18 and 50;
-- 4

-- 5 
select ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien from khach_hang 