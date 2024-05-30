import java.util.ArrayList;

import java.util.Iterator;

public class collection {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();  // Integer declaration
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(100);
        list.add(3,400);
        for(int i=1;i<=5;i++)
        {
            list.add(i);
        }
        System.out.println("Before :       "+list);
        list.remove(4);
        System.out.println("After Removal: "+list);
        ArrayList<String> list1 = new ArrayList<>();//String Declaration
        list1.add("Hello");
        list1.add("World");
        System.out.println(list1);
        ArrayList list2 = new ArrayList<>();
        list2.add(1);
        list2.add("visu");
        System.out.println(list2);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
                System.out.println(itr.next());            
        }

    }
    
}
