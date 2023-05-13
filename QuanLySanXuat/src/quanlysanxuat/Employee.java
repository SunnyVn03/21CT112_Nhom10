package quanlysanxuat;

public class Employee extends Entity {

    private char gender;
    private String address;
    
    public Employee(String name,String id,char gender, String address) {
        super(name,id);
        this.gender = gender;
        this.address = address;
    }

    public Employee() {
    }
    
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static Employee nhap() {
        String a = Common.getString("Nhap ten nhan vien:");
        String b = Common.getString("Nhap ma nhan vien:");
        char c = Common.getGender("Nhap gioi tinh:");
        String d = Common.getString("Nhap dia chi:");
        return new Employee(a,b,c,d);
    }

    @Override
    public String toString() {
        String gt = "";
        if (gender == 'M') gt = "Nam";
        else gt = "Nu";
        return super.toString() + "\t" + gt + "\t" + address;
    }

}
