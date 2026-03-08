package Session01.bt;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập năm sinh của bạn: ");
            String namSinhStr = scanner.nextLine();
            int namSinh = Integer.parseInt(namSinhStr);
            int namHienTai = 2026;
            int tuoi = namHienTai - namSinh;
            System.out.println("Tuổi của bạn là: " + tuoi);
        } catch (NumberFormatException e) {
            System.out.println("Phải nhập số cho năm sinh");
        } finally {
            scanner.close();
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }
    }
}