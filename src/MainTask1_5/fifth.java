package MainTask1_5;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        boolean result = a == -b || a == -c || a == -d
                || b == -c || b == -d
                || c == -d;

        System.out.println(result);
    }
}