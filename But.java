package quanlithuvien;

import java.util.Scanner;

public class But extends HangHoa {

    String thuongHieu;
    String mauSac;
    String chatLieu;

    But() {
        thuongHieu = "chua co";
        mauSac = "chua co";
        chatLieu = "chua co";
    }

    void nhapBut() {
        Scanner input = new Scanner(System.in);
        nhapHangHoa();
        System.out.printf("Thuong hieu: ");
        thuongHieu = input.nextLine();
        System.out.printf("Mau sac: ");
        mauSac = input.nextLine();
        System.out.printf("Chat lieu: ");
        chatLieu = input.nextLine();
    }

    String toStringBut() {
        return toStringHangHoa() + " - " + thuongHieu + " - " + mauSac + " - " + chatLieu;
    }
}
