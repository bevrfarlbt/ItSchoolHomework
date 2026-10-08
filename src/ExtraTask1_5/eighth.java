package ExtraTask1_5;

import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());
        double y = Double.parseDouble(in.next());

        if (x >= 0 && y <= 1 && (x * x + y * y <= 1 || y >= x - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}