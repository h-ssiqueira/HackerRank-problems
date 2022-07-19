import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt();
        Integer[] array = new Integer[n];
        for(int i = n-1; i >= 0; i--)
            array[i] = input.nextInt();
        Integer negatives = 0;
        for(int i = 0; i < n; i++){
            int total = 0;
            for(int j = i; j < n; j++){
                total = array[j] + total;
                if(total < 0)
                    negatives++;
            }
        }
        System.out.println(negatives);
    }
}
