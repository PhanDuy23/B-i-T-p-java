package quanlithuvien;

import java.io.IOException;
import java.util.Scanner;

public class Admin {

    private static final String matKhau = "phanduy";

    public static void hienThiMenuAd() {
        System.out.println("""
                           \nCac chuc nang cua Admin 
                           1 - Them
                           2 - Xoa
                           3 - Sua
                           4 - Tim kiem
                           5 - Xem danh
                           6 - Dang xuat
                           """);
    }

    public static void checkMatKhau() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhap mat khau: ");
            String matkhau = input.nextLine();
            if (matkhau.compareTo(matKhau) == 0) {
                break;
            }
        }
    }

    public static void nhapChiThiAd() throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhap chuc nang cua Admin: ");
            int chi_thi_ad = input.nextInt();
            if (chi_thi_ad < 1 || chi_thi_ad > 5) {
                break;
            }
            ad_run(chi_thi_ad);
        }
    }

    public static void ad_run(int chi_thi) throws IOException {
        Scanner input = new Scanner(System.in);
        switch (chi_thi) {
            case 1 -> {
                //them
                int chiThi = HangHoa.chonHangHoaSo();
                System.out.printf("Ban muon them bao nhieu San pham: ");
                int soLuong = input.nextInt();

                while (soLuong > 0) {
                    XuLiFile.them(chiThi);
                    soLuong--;
                }

            }
            case 2 -> {
                // xóa               
                String hanghoa = HangHoa.chonHangHoaChu(HangHoa.chonHangHoaSo());
                System.out.printf("Nhap ten san pham can xoa: ");
                String tenSanPham = input.nextLine();
                XuLiFile.delete(tenSanPham, hanghoa);
            }
            case 3 -> {
                // sửa                                              
                int number = HangHoa.chonHangHoaSo();
                System.out.printf("Nhap ten san pham can sua: ");
                String tenSanPham = input.nextLine();
                XuLiFile.delete(tenSanPham, HangHoa.chonHangHoaChu(number));
                System.out.println("Nhap thong tin san pham mơi: ");
                XuLiFile.them(number);
            }
            case 4 -> {
                // tìm kiếm
                int number = HangHoa.chonHangHoaSo();
                System.out.printf("Nhap Du Lieu Tim Kiem: ");
                String tenSanPham = input.nextLine();
                XuLiFile.find(tenSanPham, number);
            }
            case 5 -> {
                XuLiFile.hienThiDanhSach(HangHoa.chonHangHoaSo());
            }
        }
    }
}
