import java.io.*;
import java.util.*;

public class String_tokens{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        try{
            s = scan.nextLine();
        }
        catch(Exception e){
            s = "";
        }
        // Write your code here.
        s = s.trim();
        if(s.equals("") || s == null || s.length() == 0)
            System.out.println(0);
        else{
            String[] words = s.split("['.,?!@\\s_']+");
            System.out.println(words.length);
            for(String string : words)
                System.out.println(string);
        }
        scan.close();
    }
}

