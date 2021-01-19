package myPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee[] emps = new Employee[1];

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin cua 3 nhan vien :");

        for (int i = 0; i < emps.length; i++) {
            System.out.println("Nhap ten duong :");
            String nameStreet = sc.nextLine();

            System.out.println("Nhap ten :");
            String name = sc.nextLine();

            System.out.println("Nhap luong :");
            double rice = sc.nextDouble();

            Add add = new Add(nameStreet);

            Employee emp = new Employee(name, rice);
            emp.setAdd(add);

            emps[i] = emp;

            // Xoa bo nho dem cua ban phim;
            sc.nextLine();
        }
        System.out.println("Thong tin cua cac nhan vien la :");
        for (Employee emp : emps) {
            System.out.println("Name :" + emp.getName() + "\n"
            + "Address :" + emp.getAdd().getStreet() + "\n"
            + "Rice :" + emp.getRice());
        }
    }
}
