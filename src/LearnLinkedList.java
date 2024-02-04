import java.util.ArrayList;
import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();

        ll.add("a");
        ll.add("c");
        ll.addFirst("h");
        ll.addLast("i");
        ll.add("f");
        ll.add("d");
        ll.addFirst("b");
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
    }
}
