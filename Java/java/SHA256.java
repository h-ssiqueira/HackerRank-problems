import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class SHA256 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            String input = in.nextLine();
            System.out.println(DatatypeConverter.printHexBinary(sha256.digest(input.getBytes())).toLowerCase());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Invalid hashing algorithm");
        }
        in.close();
    }
}
