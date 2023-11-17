package quanlithuvien;

import java.util.Scanner;

public class VoGhi extends HangHoa {

    String thuongHieu;
    String soTrang;
    String loaiVo;
    String mauSacBia;
    String chatLieuGiay;
    String kichThuoc;

    VoGhi() {
        thuongHieu = "chua co";
        soTrang = "chua co";
        loaiVo = "chua co";
        mauSacBia = "chua co";
        chatLieuGiay = "chua co";
        kichThuoc = "chua co";
    }

    void nhapVoGhi() {
        Scanner input = new Scanner(System.in);
        nhapHangHoa();
        System.out.printf("Thuong hieu: ");
        thuongHieu = input.nextLine();
        System.out.printf("So trang: ");
        soTrang = input.nextLine();
        System.out.printf("Loai vo: ");
        loaiVo = input.nextLine();
        System.out.printf("Mau sac bia: ");
        mauSacBia = input.nextLine();
        System.out.printf("Chat lieu giay: ");
        chatLieuGiay = input.nextLine();
        System.out.printf("Kich thuoc: ");
        kichThuoc = input.nextLine();
    }

    String toStringVoGhi() {
        return "voghi - " + toStringHangHoa() + " - " + thuongHieu + " - " + soTrang + " - " + loaiVo + " - " + mauSacBia + " - " + chatLieuGiay + " - " + kichThuoc;
    }

    static void xuatVoGhi(String line) {
        String[] txt = line.split(" - ");
        System.out.printf("Ten san pham: %s\nGia ban: %s\nThương hieu: %s\nSo trang: %s\nLoai vo: %s\nMau sac bia: %s\nChat lieu giay: %s\nKich thuoc: %s\n", txt[1], txt[2], txt[3], txt[4], txt[5], txt[6], txt[7], txt[8]);
        System.out.println("------");
    }

    static void xuatVoGhiBang(String line) {
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
