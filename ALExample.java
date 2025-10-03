import java.util.*;

public class ALExample {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("Hello, world!");
        l.add("Hello, Java!");
        l.add("Hello, Python!");
        l.add("Hello, C++!");
        l.add("Hello, C#!");
        l.add("Hello ArrayList");
        System.out.println("List of strings: "+l);
        l.remove(2);
        System.out.println("List of strings after removing the third element: "+l);
    }
}
