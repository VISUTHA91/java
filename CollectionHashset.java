import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionHashset {
    public static void main(String[] args) {
        // HashSet<Integer> set  = new HashSet<>();
        LinkedHashSet<Integer> set  = new LinkedHashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(200);
        set.add(500);
        System.out.println(set);
        // set.remove(500);
        // System.out.println(set);
        // HashSet<String> str  = new HashSet<>();
        LinkedHashSet<String> str  = new LinkedHashSet<>();
        str.add("Abi");
        str.add("Nivetha");
        str.add("Visutha");
        str.add("Vinotha");
        str.add("Vinitha");
        str.add("Vinoth");
        System.out.println(str);
        if(str.contains("Abi"))
        {
            System.out.println("Contains");
        }
        else
        {
            System.out.println("Not Contain");
        }
        // Iterator<String> itr = str.iterator();
        // while ((itr.)) {
            
        // }

    }
    
}
