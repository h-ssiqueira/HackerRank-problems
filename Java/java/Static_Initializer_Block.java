import java.util.*;

public class Static_Initializer_Block{

//Write your code here
    static int B, H;
    static boolean flag = true;
    static Scanner in = new Scanner(System.in);
    static{
        B = in.nextInt();
        H = in.nextInt();
        if(H <= 0 || B <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class

