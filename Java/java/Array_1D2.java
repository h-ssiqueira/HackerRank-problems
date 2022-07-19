import java.util.*;

public class Array_1D2 {

    public static boolean canWin(int pos, int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        if(pos < 0 || game[pos] == 1) return false;
        if(pos + leap > game.length-1 || pos == game.length-1) return true;
        game[pos] = 1;
        return canWin(pos-1,leap,game) || canWin(pos+1,leap,game) || canWin(pos+leap,leap,game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(0, leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}