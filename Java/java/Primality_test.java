import java.io.*;
import java.math.*;
import java.util.*;

public class Primality_test{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        try{
            BigInteger n = in.nextBigInteger();
            System.out.println(n.isProbablePrime(32) ? "prime" : "not prime"); // 1 - 1/2^32
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
