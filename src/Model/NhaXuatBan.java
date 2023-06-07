/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class NhaXuatBan {
    private String maNXB;
    private String name;
    private String address;
    private String phone;
    
    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    // Thêm các phương thức getter và setter cho các thuộc tính
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Constructor
    public NhaXuatBan(String maNXB, String name, String address, String phone) {
        this.maNXB = maNXB;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
