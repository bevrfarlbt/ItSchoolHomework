package ExtraTask1_5;

import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());
        double y = Double.parseDouble(in.next());

        boolean circle = x * x + y * y <= 1;
        boolean square = x >= 0 && x <= 1 && y >= 0 && y <= 1;

        if (circle || square) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}