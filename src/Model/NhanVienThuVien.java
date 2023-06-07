/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class NhanVienThuVien {
    private String maNV;
    private String name;
    private String phone;
    private String address;
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    // Thêm các phương thức getter và setter cho các thuộc tính
    public void setAddress(String address) {
        this.address = address;
    }

    // Constructor
    public NhanVienThuVien(String maNV, String name, String phone, String address) {
        this.maNV = maNV;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
