package quanlysanxuat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Common {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Vui long nhap mot so nguyen: ");
            scanner.next();
        }
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static String getString(String message) {
        System.out.print(message);
        String result = scanner.nextLine();
        return result;
    }
    
    public static String getStrings(String message) {
        System.out.print(message);
        scanner.nextLine();
        String result = scanner.nextLine();
        return result;
    }

    public static double getDouble(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print("Vui long nhap mot so thuc: ");
            scanner.next();
        }
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }

    public static boolean getBoolean(String message) {
        System.out.print(message);
        while (!scanner.hasNextBoolean()) {
            System.out.print("Vui long nhap mot gia tri dung/sai: ");
            scanner.next();
        }
        boolean result = scanner.nextBoolean();
        scanner.nextLine();
        return result;
    }

    public static char getChar(String message) {
        char result = scanner.next().charAt(0);
        scanner.nextLine();
        return result;
    }

    public static char getGender(String mesage) {
        char gender='A';
        while (gender != 'M' && gender != 'F') {
            System.out.println("Nhap gioi tinh(M/F): ");
            gender = getChar("");
        }
        return gender;
    }

    public static Date getDate(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormat.parse(input);
            return date;
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le, vui long thu lai!.");
            return getDate(message);
        }
    }

}
