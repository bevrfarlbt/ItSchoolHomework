package ExtraTask1_5;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());
        double y = Double.parseDouble(in.next());

        if (x * x + y * y <= 1 && x >= -Math.abs(y)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}