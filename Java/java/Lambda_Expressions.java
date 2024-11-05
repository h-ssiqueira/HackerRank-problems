import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

   // Write your code here
    public PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    public PerformOperation isPalindrome() {
        return num -> {
            StringBuilder x = new StringBuilder();
            x.append(String.valueOf(num));
            return String.valueOf(num).equals(x.reverse().toString());
        };
    }

    public PerformOperation isPrime() {
        return num -> {
            int c = 0;
            for(int i = 2; i < Math.sqrt(num); i++){
                if(num % i == 0){
                    c++;
                    break;
                }
            }
            return c == 0;
        };
    }
}

public class Lambda_Expressions {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
