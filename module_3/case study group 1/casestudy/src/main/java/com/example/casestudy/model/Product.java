package com.example.casestudy.model;

public class Product {
    private int id_sp;
    private String ten_sp;
    private String don_gia;

    public Product(int id_sp, String ten_sp, String don_gia) {
        this.id_sp = id_sp;
        this.ten_sp = ten_sp;
        this.don_gia = don_gia;
    }

    public Product() {
    }

    public Product(String ten_sp, String don_gia) {
        this.ten_sp = ten_sp;
        this.don_gia = don_gia;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public String getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(String don_gia) {
        this.don_gia = don_gia;
    }
}
