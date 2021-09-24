import java.io.*;
import java.util.*;

public class Exception_handling_try_catch{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int x = 0,y = 0;
        boolean except = false;
        try{
            x = input.nextInt();
            y = input.nextInt();
            x /= y;
        }
        catch(Exception e){
            if(e instanceof InputMismatchException)
                System.out.println(new InputMismatchException());
            else
                System.out.println(e.toString());
            except = true;
        }
        if(!except)
            System.out.println(x);
    }
}
