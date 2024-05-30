import java.util.LinkedList;

public class llist {
    public static void main(String[] args) {
         LinkedList <Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        System.out.println(ll);
        ll.addFirst(9);
        ll.addLast(21);
        System.out.println(ll);
        ll.add(4, 22);
        System.out.println(ll);
        // ll.remove(22);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);

        LinkedList <Integer> List2 = new LinkedList<>();
        
        List2.add(100);
        List2.add(200);
        List2.add(300);
        System.out.println(List2);
        List2.addAll(ll);
        System.out.println(List2);
    }
    
}
