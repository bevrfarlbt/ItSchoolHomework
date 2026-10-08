package ExtraTask1_5;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());
        double y = Double.parseDouble(in.next());

        if (x * x + y * y >= 4 && y <= x && x <= 2 && y >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}