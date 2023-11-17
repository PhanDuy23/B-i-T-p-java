package quanlithuvien;

import java.util.Scanner;

public class ButMuc extends But {

    String loaiMuc;
    String doMin;

    public ButMuc() {
        loaiMuc = "chua co";
        doMin = "chua co";
    }

    void nhapButMuc() {
        Scanner input = new Scanner(System.in);
        nhapHangHoa();
        nhapBut();
        System.out.printf("Loai muc: ");
        loaiMuc = input.nextLine();
        System.out.printf("Do min: ");
        doMin = input.nextLine();
    }

    String toStringButMuc() {
        return "butmuc - " + toStringBut() + " - " + loaiMuc + " - " + doMin;
    }

    static void xuatButMuc(String line) {
        String[] txt = line.split(" - ");
        System.out.printf("Ten san pham: %s\nGia ban: %s\nThương hieu: %s\nMau sac: %s\nChat lieu: %s\nLoai muc: %s\nDo min: %s\n", txt[1], txt[2], txt[3], txt[4], txt[5], txt[6], txt[7]);
        System.out.println("------");
    }

    static void xuatButMucBang(String line) {
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

        System.out.printf("| ");
        for (int i = 1; i <= 30 - 2; i++) {
            System.out.printf(" ");
        }
        System.out.println("|");

        System.out.printf("|                 |          |                      ");
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
        System.out.println("-----------------------------------------------------------------------------------");

    }
}
