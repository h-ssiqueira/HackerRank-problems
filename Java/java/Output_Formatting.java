import java.util.Scanner;

public class Output_Formatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-10s",s1);
                System.out.printf("     %03d\n",x);
            }
            System.out.println("================================");

    }
}



