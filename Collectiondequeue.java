import java.util.Deque;
import java.util.LinkedList;

public class Collectiondequeue {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<>();
        dq.offerFirst("10");
        dq.offerFirst("TEN");
        System.out.println(dq);
        dq.offerLast("20");
        dq.offerLast("TWENTY");
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);


        

    }
    
}
