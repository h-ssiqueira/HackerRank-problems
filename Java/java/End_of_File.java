import java.io.*;
import java.util.*;

public class End_of_File{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String x;
		int i = 1;
		while(in.hasNext()){
			x = in.nextLine();
			System.out.println(i + " " + x);
			i++;
		}
    }
}