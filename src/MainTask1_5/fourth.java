package MainTask1_5;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x >= 100 && x <= 999 && x % 5 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}