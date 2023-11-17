package quanlithuvien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XuLiFile {

    public static void them(int number) throws IOException {
        String s = "  ";
        switch (number) {
            case 1 -> {
                Sach sach = new Sach();
                sach.nhapsach();
                s = sach.toStringSach();
//                break;
            }
            case 2 -> {
                VoGhi voghi = new VoGhi();
                voghi.nhapVoGhi();
                s = voghi.toStringVoGhi();
                //               break;
            }
            case 3 -> {
                ButMuc butmuc = new ButMuc();
                butmuc.nhapButMuc();
                s = butmuc.toStringButMuc();
//                break;
            }
            case 4 -> {
                ButChi butchi = new ButChi();
                butchi.nhapButChi();
                s = butchi.toStringButChi();
                //               break;
            }
            default -> {
                System.out.println("Nhap Sai roi");
            }
        }
        FileWriter fw = new FileWriter("ds_sach.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        bw.newLine();
        bw.close();
        fw.close();
    }

    public static void hienThiDanhSach(int number) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("ds_sach.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int ok = 1;
        List<String> list = new ArrayList<>();
        String hanghoa = HangHoa.chonHangHoaChu(number);
//        System.out.printf("\nDanh sach %s trong thu vien:",hanghoa );
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.contains(hanghoa) == true) {
                list.add(line);
                ok = 0;
            }
        }

        if (ok == 1) {
            System.out.println("\n       khong co ");
        } else {
            System.out.printf("""                           
                           \nChon che do xem:
                           1 - bang
                           2 - danh sach
                           
                           Che do: """);
            Scanner input = new Scanner(System.in);
            int dangXem = input.nextInt();
            HangHoa.hienThiDangDanhSach(dangXem, list, number);
        }
        System.out.println();

    }

    public static void find(String tenSanPham, int number) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("ds_sach.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String hanghoa = HangHoa.chonHangHoaChu(number);
        int ok = 0;
        List<String> list = new ArrayList<>();
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.contains(tenSanPham) == true && line.contains(hanghoa) == true) {
                ok = 1;
                list.add(line);
            }
        }
        if (ok == 0) {
            System.out.println("\nKhong co trong thu vien\n");
        } else {
            System.out.printf("""                           
                           \nChon che do xem:
                           1 - bang
                           2 - danh sach
                           Che do: """);
            Scanner input = new Scanner(System.in);
            int dangXem = input.nextInt();
            HangHoa.hienThiDangDanhSach(dangXem, list, number);
        }
    }

    public static void delete(String tenSanPham, String hanghoa) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("ds_sach.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        List<String> list = new ArrayList<>();
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.contains(tenSanPham) != true || line.contains(hanghoa) != true) {
                list.add(line);
            }
        }
        try (FileWriter fw = new FileWriter("ds_sach.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
        }
    }
}
