package quanlithuvien;

import java.io.IOException;
import java.util.Scanner;

public class Khach {

    public static void hienThiMenuKhach() {
        System.out.println("""                           
                           \nXin chao quy khach:
                           1 - tim kiem san pham
                           2 - xem danh sach san pham
                           """);
    }

    public static void nhapChiThiKhach() throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhap chuc nang cua khach: ");
            int chi_thi_k = input.nextInt();
            if (chi_thi_k < 1 || chi_thi_k > 2) {
                break;
            }
            khach_hang_run(chi_thi_k);
        }
    }

    public static void khach_hang_run(int chi_thi) throws IOException {
        if (chi_thi == 1) {
            Admin.ad_run(4);
        } else if (chi_thi == 2) {
            Admin.ad_run(5);
        }
    }
}
