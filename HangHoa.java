package quanlithuvien;

import java.util.List;
import java.util.Scanner;

public class HangHoa {

    String tenSanPham;
    String giaBan;

    public HangHoa() {
        tenSanPham = "chua co";
        giaBan = "chua co";
    }

    void nhapHangHoa() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Ten San Pham: ");
        tenSanPham = input.nextLine();
        System.out.printf("Gia ban: ");
        giaBan = input.nextLine();
    }

    String toStringHangHoa() {
        return tenSanPham + " - " + giaBan;
    }

    static void displayMenuHangHoa() {
        System.out.println("""
                           \nBan muon thao tac voi Hang Hoa gi:
                           1 - Sach
                           2 - Vo ghi
                           3 - But muc
                           4 - But chi
                           """);
    }

    static int chonHangHoaSo() {
        Scanner input = new Scanner(System.in);
        HangHoa.displayMenuHangHoa();
        System.out.printf("Hang hoa so: ");
        int number = input.nextInt();
        while (number > 4 || number < 1) {
            System.out.printf("Nhap sai roi, nhap lai: ");
            number = input.nextInt();
        }
        return number;
    }

    static String chonHangHoaChu(int x) {
        if (x == 1) {
            return "sach";
        }
        if (x == 2) {
            return "voghi";
        }
        if (x == 3) {
            return "butmuc";
        }
        if (x == 4) {
            return "butchi";
        }
        return " ";
    }

    static void inDanhSach() {
        System.out.println("""
                           Danh sách sản phẩm tìm kiếm được:
                           ------""");
    }

    static void inBang() {
        System.out.println("""
            -----------------------------------------------------------------------------------
            |  Ten san pham   | Gia ban  |     Thuong hieu      |       Thong tin them        |             
            -----------------------------------------------------------------------------------""");
        //   17 - 1 - 10 - 1 - 23 -  30
    }

    static void hienThiDangDanhSach(int dangXem, List<String> list, int number) {
        if (dangXem == 1) {
            HangHoa.inBang();
            for (String x : list) {
                if (number == 1) {
                    Sach.xuatSachBang(x);
                }
                if (number == 2) {
                    VoGhi.xuatVoGhiBang(x);
                }
                if (number == 3) {
                    ButMuc.xuatButMucBang(x);
                }
                if (number == 4) {
                    ButChi.xuatButChiBang(x);
                }
                // System.out.println(x);
            }
        } else {
            HangHoa.inDanhSach();
            for (String x : list) {
                if (number == 1) {
                    Sach.xuatSach(x);
                }
                if (number == 2) {
                    VoGhi.xuatVoGhi(x);
                }
                if (number == 3) {
                    ButMuc.xuatButMuc(x);
                }
                if (number == 4) {
                    ButChi.xuatButMuc(x);
                }
                // System.out.println(x);
            }
        }
    }
}
