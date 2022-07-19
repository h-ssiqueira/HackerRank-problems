import java.io.*;
import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n,m,x,y;
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> l1 = new ArrayList<>();
            m = in.nextInt();
            for(int j = 0; j < m; j++)
                l1.add(in.nextInt());
            l.add(l1);
        }
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            x = in.nextInt();
            y = in.nextInt();
            try{
                System.out.println(l.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}