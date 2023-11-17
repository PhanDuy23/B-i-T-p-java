package quanlithuvien;

import java.io.IOException;
import java.util.Scanner;

public class QuanLiThuVien {

    public static void main(String[] args) throws IOException {
        hienThiMenu();
        nhapChiThi1();
    }

    public static void hienThiMenu() {
        System.out.println("""                           
                           \nXin chao quy khach:
                           1 - nếu bạn là Admin
                           2 - nếu bạn là Khách Hàng
                           """);
    }

    public static void nhapChiThi1() throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.printf("Ban la Admin hay Khach Hang: ");
            int chi_thi = input.nextInt();
            switch (chi_thi) {
                case 1 -> {
                    Admin.checkMatKhau();
                    Admin.hienThiMenuAd();
                    Admin.nhapChiThiAd();
                    break;
                }
                case 2 -> {
                    Khach.hienThiMenuKhach();
                    Khach.nhapChiThiKhach();
                    break;

                }
                default -> {
                    System.out.println("Nhap Sai roi");
                }
            }
        }
    }

}
