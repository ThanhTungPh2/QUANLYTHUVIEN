/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

public class Sach {
    private String maSach;
    private String name;
    private int soLuong;
    private String tinhTrang;
    private Date namXB;
    private String maNXB;
    private String maTacGia;
    private String maPhieu;
    
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Date getNamXB() {
        return namXB;
    }

    public void setNamXB(Date namXB) {
        this.namXB = namXB;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    // Thêm các phương thức getter và setter cho các thuộc tính
    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    // Constructor
    public Sach(String maSach, String name, int soLuong, String tinhTrang, Date namXB, String maNXB, String maTacGia, String maPhieu) {
        this.maSach = maSach;
        this.name = name;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
        this.namXB = namXB;
        this.maNXB = maNXB;
        this.maTacGia = maTacGia;
        this.maPhieu = maPhieu;
    }
}

