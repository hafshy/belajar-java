import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapLanjutan {
    public static void main(String[] args) {
        mapIntString();
        mapDayToString();
    }

    public static void mapIntString() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Tiga");
        map.put(1, "Satu");
        map.put(2, "Dua");
        System.out.println(map);
    }

    public static void mapDayToString() {
        HashMap<DayOfWeek, String> map = new HashMap<>();
        map.put(DayOfWeek.MONDAY, "Senin");
        map.put(DayOfWeek.TUESDAY, "Selasa");
        map.put(DayOfWeek.WEDNESDAY, "Rabu");
        System.out.println(map.get(DayOfWeek.THURSDAY));
    }

    public static void mapStringToString() {
        System.out.println("TEST GIT");
    }

    public static void mapIntegerToDouble() {

    }
}