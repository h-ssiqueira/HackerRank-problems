import java.io.*;
import java.util.*;
import java.math.*;

public class Big_Integer{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger (in.next()),b = new BigInteger (in.next()),s,m;
        s = a.add(b);
        m = a.multiply(b);
        System.out.println(s);
        System.out.println(m);
    }
}
