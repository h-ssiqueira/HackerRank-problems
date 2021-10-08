import java.util.HashMap;
import java.util.Scanner;

public class Anagrams{

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length() || a.equals("") || b.equals(""))
            return false;
        char index;
        int freq;
        HashMap<Character,Integer> letters = new HashMap<Character,Integer>();
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i = 0; i < a.length(); i++){
            index = a.charAt(i);
            if(letters.containsKey(index)){
                freq = letters.get(index);
                letters.replace(index, ++freq);
            }
            else
                letters.put(index,1);
        }
        for(int i = 0; i < b.length(); i++){
            index = b.charAt(i);
            if(letters.containsKey(index)){
                freq = letters.get(index);
                if(freq == 0)
                    return false;
                letters.replace(index, --freq);
            }
            else
                return false;
        }

        return true;
    }

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
