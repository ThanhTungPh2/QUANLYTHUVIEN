/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class DocGia {
    private String maDocGia;
    private String name;
    private String sdt;
    private String address;
    private String nganhNghe;
    private String donViCongTac;
    
    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }

    public String getDonViCongTac() {
        return donViCongTac;
    }

    // Thêm các phương thức getter và setter cho các thuộc tính
    public void setDonViCongTac(String donViCongTac) {
        this.donViCongTac = donViCongTac;
    }

    // Constructor
    public DocGia(String maDocGia, String name, String sdt, String address, String nganhNghe, String donViCongTac) {
        this.maDocGia = maDocGia;
        this.name = name;
        this.sdt = sdt;
        this.address = address;
        this.nganhNghe = nganhNghe;
        this.donViCongTac = donViCongTac;
    }
}
