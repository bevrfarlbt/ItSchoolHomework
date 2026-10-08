package MainTask1_5;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int count = 0;
        if (a % 2 == 0) count++;
        if (b % 2 == 0) count++;
        if (c % 2 == 0) count++;

        System.out.println(count >= 2);
    }
}