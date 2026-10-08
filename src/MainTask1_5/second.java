package MainTask1_5;
import java.util.Scanner;
public class second {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double x = Double.parseDouble(in.next());

            if ((x >= -3 && x <= 5) || (x >= 9 && x <= 15)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
}
