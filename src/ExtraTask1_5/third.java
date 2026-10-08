package ExtraTask1_5;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());
        double y = Double.parseDouble(in.next());

        boolean left = x <= 0 && y >= x && y <= 2 - x * x;
        boolean right = x >= 0 && y >= 0 && y <= 2 - x * x;

        if (left || right) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}