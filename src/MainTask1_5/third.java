package MainTask1_5;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = Double.parseDouble(in.next());

        if ((x >= -2 && x <= 3) || (x >= 6 && x <= 9)) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
