import java.io.*;
import java.util.*;

public class Strings_introduction{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        /*
        A.replace(A.charAt(0), A.charAt(0).toUpperCase());
        B.replace(B.charAt(0), B.charAt(0).toUpperCase());
        */
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}



