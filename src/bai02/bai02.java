package bai02;

import java.util.Arrays;

public class bai02 {
    public static void main(String[] args) {
        String[] arr = { "Red", "Green", "Orange", "White", "Black" };

        String s = "List before sort: ";
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (String string : arr) {
            sb.append(string + " ");
        }
        sb.append("\n");
        sb.append("List after sort: ");
        Arrays.sort(arr);
        for (String string : arr) {
            sb.append(string + ", ");
        }
        System.out.println(sb);
    }
}
