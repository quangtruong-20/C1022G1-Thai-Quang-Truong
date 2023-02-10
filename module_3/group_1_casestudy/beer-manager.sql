create database beer_manager ;
use beer_manager;


create table loai_san_pham(
		ma_loai_sp int,
        ten_loai_sp varchar(50),
        bieu_tuong varchar(191),
       hinh_dai_dien varchar(191),
       tong_so_sp int,
       tieu_de_sp varchar(50),
		mo_ta_sp varchar(50),
        noi_bat int
);


create table san_pham(
	ma_sp int primary key ,
    ten_sp varchar(50),
    ma_nguoi_tao int,
    ma_loai_sp int,
    don_gia_sp int,
    giam_gia_sp int,
    -- hoat dong
    -- sphot
    mo_ta varchar(191),
    hinh_dai_dien varchar(191),
    -- tu khoa
    ngay_tao datetime,
    ngay_cap_nhat datetime,
    tieu_de varchar(191),
    noi_dung_sp varchar(21000),
    sp_da_ban varchar(50),
    so_luong varchar(50),
    tong_danh_gia int,
    tong_so_diem_danh_gia int
  
);

create table don_hang(
ma_don_hang int primary key,
ma_khach_hang int,
tong_tien int,
dia_chi varchar(45),
ghi_chu varchar(45),
sdt varchar(45),
trang_thai_don_hang varchar(45));

create table chi_tiet_don_hang(
ma_chi_tiet_don_hang int primary key,
ma_don_hang int,
ma_san_pham int,
so_luong int,
gia_tien int,
giam_gia int);

create table binh_luan(
id_binh_luan int primary key,
ma_khach_hang int,
ma_san_pham int,
so_danh_gia int,
noi_dung varchar(45)
);


create table bai_viet(
ma_phieu_nhap int primary key,
ten_bai_viet varchar(45),
id_nguoi_viet int,
mo_ta_bai_viet varchar(45),
noi_dung varchar(45),
tieu_de varchar(45),
hinh_dai_dien varchar(45),
so_luot_xem int,
noi_bat int
);

create table lien_he(
ma_lien_he int primary key,
ten_lien_he varchar(45),
email varchar(45),
tieu_de varchar(45),
noi_dung varchar(45),
trang_thai varchar(45) );

create table quan_tri_vien(
ma_quan_tri_vien int primary key,
ten_quan_tri_vien varchar(45),
email varchar(45),
hinh_dai_dien varchar(45),
sdt varchar(45),
dia_chi varchar(45) 
);

create table khach_hang(
ma_kh int primary key,
ten_kh varchar(45),
email varchar(45),
mat_khau varchar(45),
sdt varchar(45),
dia_chi varchar(45) );