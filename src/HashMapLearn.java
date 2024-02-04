import java.util.ArrayList;
import java.util.HashMap;

public class HashMapLearn {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
//        HashMap<>

//        Value: ["London"]  ["Kuala Lumpur"]  []  []  []  []  []
//        Key:    "England"    "Malaysia"      "Indonesia"
//            0              1               2
//        Key and Value ->  Kalo kita punya key, kita bisa akses value
//                          Kalo kita punya value, kita ga bisa akses key
        HashMap<String, String> hmss = new HashMap<>();
        hmss.put("England", "London");
        hmss.put("Malaysia", "Kuala Lumpur");
        hmss.put("Malaysia", "London");
        System.out.println(hmss.get("England"));
        System.out.println(hmss.get("Malaysia"));

        ArrayList<String> als = new ArrayList<>();
        als.add("b");
        als.add("a");
        als.add("c");
        als.add("a");
        als.add("b");
        als.add("a");
        als.add("a");
        als.add("b");
        als.add("a");

        als.add("z");
        als.add("z");
        als.add("z");

        // Menghitung berapa banyak huruf di dalam als
        HashMap<String, Integer> hmsi = new HashMap<>();
        System.out.println(hmsi.get("a"));
//        hmsi.put("d", 10);
        System.out.println(hmsi);

        // Iterasi arraylist satu per satu
        for (int i = 0; i < als.size(); i++) {
            // Evaluasi: apabila di HashMap belum ada als[i],
            // contoh: a belum ada di hashmap
            if (hmsi.get(als.get(i)) == null) {
                hmsi.put(als.get(i), 1);
            }

            // Kalo di dalamnya udah ada, kita tambahin 1
            else {
                String element = als.get(i);                // "a"
                Integer countElement = hmsi.get(element);   // 2
                // Yang asalnya n -> n + 1
                // Contoh asalanya 2 -> 2 + 1 = 3
                // Hashmap["a"] = 2     -> Hashmap["a"] = 3
                hmsi.put(element, countElement + 1);        // hashmap["a"] = 3
            }
        }
        System.out.println(hmsi);

    }
}
