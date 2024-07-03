import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class MD5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            String input = in.nextLine();
            System.out.println(DatatypeConverter.printHexBinary(md5.digest(input.getBytes())).toLowerCase());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Invalid hashing algorithm");
        }
        in.close();
    }
}
