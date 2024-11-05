import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        Set<Integer> set = new HashSet<>();
        int unique = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.offer(num);
            set.add(num);
            if(deque.size() == m) {
                unique = Math.max(unique, set.size());
                if(unique == m) {
                    break;
                }
                int removed = deque.poll();
                if(!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }
        System.out.println(unique);
    }
}