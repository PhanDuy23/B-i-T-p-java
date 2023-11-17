package quanlithuvien;

import java.util.Scanner;

public class ButChi extends But {

    String doCung;

    public ButChi() {
        doCung = "chua co";
    }

    void nhapButChi() {
        Scanner input = new Scanner(System.in);
        nhapHangHoa();
        nhapBut();
        System.out.printf("Do cung: ");
        doCung = input.nextLine();
    }

    String toStringButChi() {
        return "butchi - " + toStringBut() + " - " + doCung;
    }

    static void xuatButMuc(String line) {
        String[] txt = line.split(" - ");
        System.out.printf("Ten san pham: %s\nGia ban: %s\nThương hieu: %s\nMau sac: %s\nChat lieu: %s\nDo cung: %s\n", txt[1], txt[2], txt[3], txt[4], txt[5], txt[6]);
        System.out.println("------");
    }

    static void xuatButChiBang(String line) {
        String[] txt = line.split(" - ");
        System.out.printf("|                 |          |                      ");
        System.out.printf("| %s", txt[4]);
        for (int i = 1; i <= 30 - 2 - txt[4].length(); i++) {
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

        System.out.printf("| %s", txt[5]);
        for (int i = 1; i <= 30 - 2 - txt[5].length(); i++) {
            System.out.printf(" ");
        }
        System.out.println("|");

        System.out.printf("|                 |          |                      ");
        System.out.printf("| %s", txt[6]);
        for (int i = 1; i <= 30 - 2 - txt[6].length(); i++) {
            System.out.printf(" ");
        }
        System.out.println("|");

        System.out.println("-----------------------------------------------------------------------------------");
    }

    String chonDoCung() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap do cung: ");
        int numBer;
        numBer = input.nextInt();
        if (numBer == 1) {
            return "HB";
        }
        if (numBer == 2) {
            return "2B";
        }
        if (numBer == 3) {
            return "3B";
        }
        if (numBer == 4) {
            return "4B";
        }
        if (numBer == 5) {
            return "5B";
        }
        if (numBer == 6) {
            return "6B";
        }
        if (numBer == 7) {
            return "7B";
        }
        if (numBer == 8) {
            return "8B";
        }
        if (numBer == 9) {
            return "9B";
        }
        if (numBer == 10) {
            return "10B";
        }
        System.out.println("Khong ton tai");
        return chonDoCung();
    }

}
