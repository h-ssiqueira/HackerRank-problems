import java.util.Scanner;

class MyCalculator{
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int x, int y) throws Exception{
        long r = x;
        if(x < 0 || y < 0)
            throw new Exception("n or p should not be negative.");
        else if(x == 0 && y == 0)
            throw new Exception("n and p should not be zero.");
        if(y == 0)
            return 1;
        while(--y != 0)
            r *= x;
        return r;
    }

}

public class Exception_handling{
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}