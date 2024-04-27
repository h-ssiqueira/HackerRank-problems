import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Input = new Scanner(System.in);
        String total = Input.nextLine();
        Pattern ipv4 = Pattern.compile("^((2[0-5]{2}|1[0-9]{2}|[0-9]{1,2})\\.){3}(2[0-5]{2}|1[0-9]{2}|[0-9]{1,2}){1}$");
        Pattern ipv6 = Pattern.compile("^([0-9abcdef]{1,4}:){7}[0-9abcdef]{1,4}$");
        String line = "";
        Matcher ipv4Result;
        Matcher ipv6Result;
        for(int i = 0; i < Integer.valueOf(total); i++){
            line = Input.nextLine();
            ipv4Result = ipv4.matcher(line);
            ipv6Result = ipv6.matcher(line);
            if(ipv4Result.find())
                System.out.println("IPv4");
            else if(ipv6Result.find())
                System.out.println("IPv6");
            else
                System.out.println("Neither");
        }
    }
}
