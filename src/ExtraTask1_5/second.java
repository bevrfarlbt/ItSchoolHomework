package ExtraTask1_5;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());
        double y = Double.parseDouble(in.next());

        if (x >= 0 && x <= Math.PI && y >= 0 && y <= 0.5 && y <= Math.sin(x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}