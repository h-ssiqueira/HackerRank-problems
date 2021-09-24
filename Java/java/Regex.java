import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    public String pattern = "^(\\d|\\d\\d|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5]).(\\d|\\d\\d|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5]).(\\d|\\d\\d|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5]).(\\d|\\d\\d|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])$";
}
