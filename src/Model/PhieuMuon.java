/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

public class PhieuMuon {
    private String maPhieu;
    private Date dateStart;
    private Date dateEnd;
    private String maNV;
    private String maSach;
    private String maDocGia;
    
    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    // Thêm các phương thức getter và setter cho các thuộc tính
    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    // Constructor
    public PhieuMuon(String maPhieu, Date dateStart, Date dateEnd, String maNV, String maSach, String maDocGia) {
        this.maPhieu = maPhieu;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.maNV = maNV;
        this.maSach = maSach;
        this.maDocGia = maDocGia;
    }
}
