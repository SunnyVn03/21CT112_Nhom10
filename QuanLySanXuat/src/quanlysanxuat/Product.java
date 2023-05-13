package quanlysanxuat;

public class Product extends Entity {

    private String loai;
    private double price;
    private String measure;

    public Product(String name, String id, String loai, double price, String measure) {
        super(name, id);
        this.loai = loai;
        this.price = price;
        this.measure = measure;
    }

    
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static Product nhap() {
        String a = Common.getString("Nhap ten san pham:");
        String b = Common.getString("Nhap ma san pham:");
        String c = Common.getString("Nhap loai san pham:");
        Double d = Common.getDouble("Nhap don gia:");
        String e = Common.getString("Nhap don vi tinh:");
        return new Product(a,b,c,d,e);
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + loai + "\t" + price + "\t" + measure;
    }

    
}
