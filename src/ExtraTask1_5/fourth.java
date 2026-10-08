package ExtraTask1_5;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());
        double y = Double.parseDouble(in.next());

        if (y >= x * x - 2 && y <= Math.abs(x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
