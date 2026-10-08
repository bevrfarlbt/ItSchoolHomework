package ExtraTask1_5;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());
        double y = Double.parseDouble(in.next());

        if (x <= 1 && y >= 1 - x && (x >= 0 || y >= 2 * x * x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}