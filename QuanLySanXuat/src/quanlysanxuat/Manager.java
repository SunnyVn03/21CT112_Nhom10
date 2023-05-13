package quanlysanxuat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public Manager() {        
    }
    public List<Employee> nv = new ArrayList<>();
    public List<Product> sp = new ArrayList<>();
    public List<OrderForm> ddh = new ArrayList<>();
    
    public void add(){
        int a = 1;
        while(a!=4){
            System.out.println("1. Add Employee");
            System.out.println("2. Add Product");
            System.out.println("3. Add OrderForm");
            System.out.println("4. Exit");
            a = Common.getInt("Enter choice: ");
            switch(a){
                case 1:
                    Employee emp = Employee.nhap();
                    nv.add(emp);
                    break;
                case 2:
                    Product pro = Product.nhap();
                    sp.add(pro);
                    break;
                case 3:
                    String tenkh = Common.getString("Nhap ten khach hang:");
                    String maddh = Common.getString("Nhap ma don dat hang:");
                    String masp = null;
                    String manv = null;
                    boolean i = false;
                    while(i != true){
                        String x = Common.getString("Nhap ma san pham:");
                        for(Product p : sp){
                            if (p.getId().equals(x)){
                                masp = x;
                                i = true;
                                break;
                            }   
                        }
                        if (i == true) break;
                        else System.out.println("khong ton tai san pham");
                    }
                    while(i != false){
                        String x = Common.getString("Nhap ma nhan vien phu trach:");
                        for(Employee e : nv){
                            if (e.getId().equals(x)){
                                manv = x;
                                i = false;
                                break;
                            }   
                        }
                        if (i == false) break;
                        else System.out.println("khong ton tai nhan vien");
                    }
                    OrderForm order = OrderForm.nhap(tenkh, maddh, masp, manv);
                    ddh.add(order);
                    break;

            }
        }
    }
    
    public void edit(){
        int a = 1;
        while(a!=4){
            System.out.println("1. Edit Employee");
            System.out.println("2. Edit Product");
            System.out.println("3. Eit OrderForm");
            System.out.println("4. Exit");
            a = Common.getInt("Enter choice: ");
            switch(a){
                case 1:
                    String manv = null;
                    boolean i = false;
                    while(i != true){
                        String x = Common.getString("Nhap ma nhan vien:");
                        for(Employee e : nv){
                            if (e.getId().equals(x)){
                                manv = x;
                                i = true;
                                break;
                            }   
                        }
                        if (i == true) break;
                        else System.out.println("khong ton tai nhan vien");
                    }
                    
                    int index1 = -1;
                    for (int t = 0; t < nv.size(); t++) {
                        if (nv.get(t).getId().equals(manv)) {
                            index1 = t;
                            break;
                        }
                    }

                    if (index1 >= 0) {
                        Employee emp = nv.get(index1);
                        emp.setName(Common.getString("Nhap ten: "));
                        emp.setGender(Common.getGender("Nhap gioi tinh: "));
                        emp.setAddress(Common.getString("Nhap dia chi: "));
                        nv.set(index1, emp);
                    }
                    break;
                case 2:
                    String masp = null;
                    boolean i2 = false;
                    while(i2 != true){
                        String x = Common.getString("Nhap ma san pham:");
                        for(Product p : sp){
                            if (p.getId().equals(x)){
                                masp = x;
                                i2 = true;
                                break;
                            }   
                        }
                        if (i2 == true) break;
                        else System.out.println("khong ton tai san pham");
                    }
                    
                    int index2 = -1;
                    for (int t = 0; t < sp.size(); t++) {
                        if (sp.get(t).getId().equals(masp)) {
                            index2 = t;
                            break;
                        }
                    }

                    if (index2 >= 0) {
                        Product pro = sp.get(index2);
                        pro.setName(Common.getString("Nhap ten san pham: "));
                        pro.setLoai(Common.getString("Nhap loai: "));
                        pro.setPrice(Common.getDouble("Nhap don gia: "));
                        pro.setMeasure(Common.getString("Nhap don vi tinh: "));
                        sp.set(index2, pro);
                    }
                    break;
                case 3:
                    String maddh = null;
                    boolean i3 = false;
                    while(i3 != true){
                        String x = Common.getString("Nhap ma don dat hang:");
                        for(OrderForm o : ddh){
                            if (o.getId().equals(x)){
                                maddh = x;
                                i3 = true;
                                break;
                            }   
                        }
                        if (i3 == true) break;
                        else System.out.println("khong ton tai don dat hang");
                    }
                    
                    int index3 = -1;
                    for (int t = 0; t < ddh.size(); t++) {
                        if (ddh.get(t).getId().equals(maddh)) {
                            index3 = t;
                            break;
                        }
                    }

                    if (index3 >= 0) {
                        OrderForm ord = ddh.get(index3);
                        ord.setName(Common.getString("Nhap ten khach hang: "));
                        ord.setQuantity(Common.getInt("Nhap so luong: "));
                        ord.setOrderDate(Common.getDate("Nhap ngay dat: "));
                        ddh.set(index3, ord);
                    }
                    break;
            }
        }
    }
    
    public void del(){
        int a = 1;
        while(a!=4){
            System.out.println("1. Delete Employee");
            System.out.println("2. Delete Product");
            System.out.println("3. Delete OrderForm");
            System.out.println("4. Exit");
            a = Common.getInt("Enter choice: ");
            switch(a){
                case 1:
                    String manv = Common.getString("Input employee id: ");
                    if(nv.isEmpty()){
                        System.out.println("No employee!");
                        return;
                    }
                    Iterator<Employee> nvi = nv.iterator();
                    while (nvi.hasNext()) {
                        Employee e = nvi.next();
                        if (e.getId().equals(manv)) {
                            nvi.remove();
                        }
                    }
                    break;
                case 2:
                    String masp = Common.getString("Input product id: ");
                    if(nv.isEmpty()){
                        System.out.println("No product!");
                        return;
                    }
                    Iterator<Product> spi = sp.iterator();
                    while (spi.hasNext()) {
                        Product e = spi.next();
                        if (e.getId().equals(masp)) {
                            spi.remove();
                        }
                    }
                    break;
                case 3:
                    String maddh = Common.getString("Input product id: ");
                    if(nv.isEmpty()){
                        System.out.println("No product!");
                        return;
                    }
                    Iterator<OrderForm> ddhi = ddh.iterator();
                    while (ddhi.hasNext()) {
                        OrderForm e = ddhi.next();
                        if (e.getId().equals(maddh)) {
                            ddhi.remove();
                        }
                    }
                    break;
            }
        }
    }
    
    public void show(){
        int a = 1;
        while(a!=5){
            System.out.println("1. Show Employee");
            System.out.println("2. Show Product");
            System.out.println("3. Show OrderForm");
            System.out.println("4. Show Revenue");
            System.out.println("5. Exit");
            a = Common.getInt("Enter choice: ");
            switch(a){
                case 1:
                    if(nv.isEmpty()){
                        System.out.println("No employee!");
                        return;
                    }else{
                        System.out.println("Ma nhan vien \tTen nhan vien \tGioi tinh \tDia chi");
                    }
                    for(Employee employee : nv){
                        System.out.println(employee.toString());
                    }
                    break;
                case 2:
                    if(sp.isEmpty()){
                        System.out.println("No product!");
                        return;
                    }else{
                        System.out.println("Ma san pham \tTen san pham \tLoai \tDon gia \tDon vi tinh");
                    }
                    for(Product p : sp){
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    if(ddh.isEmpty()){
                        System.out.println("No orderform!");
                        return;
                    }else{
                        System.out.println("Ma don dat hang \tTen khach hang \tMa san pham \tMa nhan vien phu trach \tSo luong dat \tNgay dat");
                    }
                    for(OrderForm o : ddh){
                        System.out.println(o.toString());
                    }
                    break;
                case 4:
                    double revenue = 0;
                    for(OrderForm o : ddh){
                        for (Product p : sp){
                            if (o.getProductID().equals(p.getId())) {
                                revenue = revenue + o.getQuantity()* p.getPrice();
                            }
                        }
                    }
                    System.out.println("Revenue: " + revenue);
                    break;
            }
        }
    }
    
    public void menu(){
        while(true){
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Show");
            System.out.println("5. Exit");
            int choice=Common.getInt("Enter choice: ");
            menu(choice);
        }
    }
    
    public void menu(int choice){
        switch(choice){
            case 1:
                add();
                break;
            case 2:
                edit();
                break;
            case 3:
                del();
                break;
            case 4:
                show();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}
