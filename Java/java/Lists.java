import java.io.*;
import java.util.*;

public class Lists {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < len; i++)
            list.add(in.nextInt());
        int j = in.nextInt();
        for(int i = 0; i < j; i++){
            switch(in.next()){
                case "Insert":
                    list.add(in.nextInt(), in.nextInt());
                    break;
                case "Delete":
                    list.remove(in.nextInt());
                    break;
            }
        }
        for(Integer i:list)
            System.out.print(i+" ");
    }
}