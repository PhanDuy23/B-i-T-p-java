package quanlithuvien;

import java.util.Scanner;

public class Sach extends HangHoa {

    String theLoai;
    String tacGia;
    String thuongHieu;
    String nhaXuatBan;
    String namXuatBan;
    String ngonNgu;

    Sach() {
        nhaXuatBan = "chua co";
        tacGia = "chua co";
        theLoai = "chua co";
        namXuatBan = "chua co";
        ngonNgu = "chua co";
        thuongHieu = "chua co";
    }

    public void nhapsach() {
        Scanner input = new Scanner(System.in);
        nhapHangHoa();
        System.out.printf("Thuong hieu: ");
        thuongHieu = input.nextLine();
        System.out.printf("The loai: ");
        theLoai = input.nextLine();
        System.out.printf("Tac gia: ");
        tacGia = input.nextLine();
        System.out.printf("Nha xuat ban: ");
        nhaXuatBan = input.nextLine();
        System.out.printf("Nam xuat ban: ");
        namXuatBan = input.nextLine();
        System.out.printf("Ngon ngu: ");
        ngonNgu = input.nextLine();
    }

    String toStringSach() {
        return "sach - " + toStringHangHoa() + " - " + thuongHieu + " - " + theLoai + " - " + tacGia + " - " + nhaXuatBan + " - " + namXuatBan + " - " + ngonNgu;
    }

    static void xuatSach(String line) {
        String[] txt = line.split(" - ");
        System.out.printf("Ten san pham: %s\nGia ban: %s\nThương hieu: %s\nThe loai: %s\nTac gia: %s\nNha xuat ban: %s\nNam xuat ban: %s\nNgon ngu: %s\n", txt[1], txt[2], txt[3], txt[4], txt[5], txt[6], txt[7], txt[8]);
        System.out.println("------");
    }

    static void xuatSachBang(String line) {
        String[] txt = line.split(" - ");
        System.out.printf("|                 |          |                      ");
        System.out.printf("| %s", txt[4]);
        for (int i = 1; i <= 30 - 2 - txt[4].length(); i++) {
            System.out.printf(" ");
        }
        System.out.println("|");

        System.out.printf("|                 |          |                      ");
        System.out.printf("| %s", txt[5]);
        for (int i = 1; i <= 30 - 2 - txt[5].length(); i++) {
            System.out.printf(" ");
        }
        System.out.println("|");

        System.out.printf("| %s", txt[1]);
        for (int i = 1; i <= 16 - txt[1].length(); i++) {
            System.out.printf(" ");
        }

        System.out.printf("| %s", txt[2]);
        for (int i = 1; i <= 11 - 2 - txt[2].length(); i++) {
            System.out.printf(" ");
        }

        System.out.printf("| %s", txt[3]);
        for (int i = 1; i <= 23 - 2 - txt[3].length(); i++) {
            System.out.printf(" ");
        }

        System.out.printf("| %s", txt[6]);
        for (int i = 1; i <= 30 - 2 - txt[6].length(); i++) {
            System.out.printf(" ");
        }
        System.out.println("|");

        System.out.printf("|                 |          |                      ");
        System.out.printf("| %s", txt[7]);
        for (int i = 1; i <= 30 - 2 - txt[7].length(); i++) {
            System.out.printf(" ");
        }
        System.out.println("|");

        System.out.printf("|                 |          |                      ");
        System.out.printf("| %s", txt[8]);
        for (int i = 1; i <= 30 - 2 - txt[8].length(); i++) {
            System.out.printf(" ");
        }
        System.out.println("|");
        System.out.println("-----------------------------------------------------------------------------------");

    }
}
