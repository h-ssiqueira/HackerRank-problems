import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Matching_Whitespace_Non_Whitespace_Character {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("([0-9A-Za-z]{2}\\s){2}[0-9A-Za-z]{2}"); // Use \\ instead of using \

    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}