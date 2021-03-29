import java.util.*;
import java.io.*;

class Loops_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(),a,b,n,s;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            s = a;
            for(int j = 0; j < n; j++){
                s += (int)Math.pow(2,j) * b;
                System.out.print(s + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
