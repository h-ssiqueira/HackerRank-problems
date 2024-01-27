import java.io.*;
import java.util.*;

public class BitSets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BitSet b1 = new BitSet(n), b2 = new BitSet(n);
        n = scan.nextInt();
        String op;
        int firstArg, secondArg;
        for(int i = 0; i < n; i++) {
            op = scan.next();
            firstArg = scan.nextInt();
            secondArg = scan.nextInt();
            switch (op) {
                case "AND":
                    if(firstArg == 1){
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if(firstArg == 1){
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if(firstArg == 1){
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    if(firstArg == 1){
                        b1.flip(secondArg);
                    } else {
                        b2.flip(secondArg);
                    }
                    break;
                case "SET":
                    if(firstArg == 1){
                        b1.set(secondArg);
                    } else {
                        b2.set(secondArg);
                    }
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}