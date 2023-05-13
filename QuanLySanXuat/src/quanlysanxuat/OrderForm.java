package quanlysanxuat;

import java.util.Date;

public class OrderForm extends Entity {

    private String productID;
    private String employeeID;
    private int quantity;
    private Date orderDate;

    public OrderForm(String name,String id, String productID, String employeeID, int quantity, Date oderDate) {
        super(name, id);
        this.productID = productID;
        this.employeeID = employeeID;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }
    
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public static OrderForm nhap(String a, String b, String c, String d) {
        int e = Common.getInt("Nhap so luong dat:");
        Date f = Common.getDate("Nhap ngay dat:");
        return new OrderForm(a,b,c,d,e,f);
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + productID + "\t" + employeeID + "\t" + quantity + "\t" + orderDate;
    }
}
