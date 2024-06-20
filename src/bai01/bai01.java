package bai01;
import java.util.Scanner;

public class bai01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.next();

        if (input.length() < 2) {
            System.out.println("Cần nhập thêm ký tự vào chuỗi");
            return;
        }

        for (int i = 0; i < input.length() - 1; i++) {
            Character c1 = input.charAt(i);
            int j = i + 1;
            for (; j < input.length(); j++) {
                Character c2 = input.charAt(j);
                if (c1 == c2) {
                    break;
                }
            }
            if (j == input.length()) {
                System.out.println(c1);
                break;
            }
        }


    }
}
