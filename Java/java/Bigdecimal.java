import java.math.BigDecimal;
import java.util.*;

public class Bigdecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s,0,n, new Comparator<String>(){
            @Override
            public int compare(String x, String y){
                if(x == null || y == null)
                    return 0x0;
                BigDecimal first = new BigDecimal(x), second = new BigDecimal(y);
                return second.compareTo(first);
            }
        });

        //Output
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}