
package Model;

public class TacGia {
    private String maTacGia;
    private String name;
    private String coQuan;
    private String address;
    private String phone;
    
    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoQuan() {
        return coQuan;
    }

    public void setCoQuan(String coQuan) {
        this.coQuan = coQuan;
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
    public TacGia(String maTacGia, String name, String coQuan, String address, String phone) {
        this.maTacGia = maTacGia;
        this.name = name;
        this.coQuan = coQuan;
        this.address = address;
        this.phone = phone;
    }
}
