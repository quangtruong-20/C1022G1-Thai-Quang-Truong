create database convert_erd;

CREATE TABLE phieu_xuat (
    so_px INT PRIMARY KEY,
    ngay_xuat DATE
);
-- 1
CREATE TABLE chi_tiet_phieu_xuat (
    so_px INT,
    ma_vat_tu INT,
    PRIMARY KEY (so_px , ma_vat_tu),
    FOREIGN KEY (so_px)
        REFERENCES phieu_xuat (so_px),
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    dg_xuat DOUBLE,
    sl_xuat INT
);

CREATE TABLE vat_tu (
    ma_vat_tu INT PRIMARY KEY,
    ten_vat_tu VARCHAR(50)
);
-- 2
CREATE TABLE chi_tiet_pn (
    ma_vat_tu INT,
    so_pn INT,
    PRIMARY KEY (ma_vat_tu , so_pn),
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    FOREIGN KEY (so_pn)
        REFERENCES phieu_nhap (so_pn),
    dg_nhap DOUBLE,
    sl_nhap INT
);


CREATE TABLE phieu_nhap (
    so_pn INT PRIMARY KEY,
    ngay_nhap DATE
);
-- 3
CREATE TABLE chi_tiet_don_dh (
    ma_vat_tu INT,
    so_dh INT,
    PRIMARY KEY (ma_vat_tu , so_dh),
    FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    FOREIGN KEY (so_dh)
        REFERENCES don_dh (so_dh)
);

CREATE TABLE don_dh (
    so_dh INT PRIMARY KEY,
    ngay_dh DATE,
    ma_ncc INT,
    FOREIGN KEY (ma_ncc)
        REFERENCES nha_cc (ma_ncc)
);
CREATE TABLE nha_cc (
    ma_ncc INT PRIMARY KEY,
    ten_ncc VARCHAR(50),
    dia_chi VARCHAR(50)
);

CREATE TABLE sdt (
    stt INT PRIMARY KEY,
    sdt_ncc VARCHAR(50),
    ma_ncc INT,
    FOREIGN KEY (ma_ncc)
        REFERENCES nha_cc (ma_ncc)
);



