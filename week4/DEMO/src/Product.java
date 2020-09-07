import java.io.Serializable;

public class Product implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String nhaSanXuat;
    private String gia;
    private String moTa;

    public Product() {
    }

    public Product(String maSanPham, String tenSanPham, String nhaSanXuat, String gia, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
        this.moTa = moTa;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham = " + maSanPham +
                ", tenSanPham = " + tenSanPham +
                ", nhaSanXuat = " + nhaSanXuat +
                ", gia = " + gia +
                ", moTa = " + moTa +
                "}";
    }
}
