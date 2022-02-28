// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class PrintMapValues {
    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> missions = new LinkedHashMap<String, Integer>();
        missions.put("vinodh", 15);
        missions.put("dasari", 19);
        missions.entrySet().forEach(System.out::println);
        missions.entrySet().stream().forEach(System.out::println);
        // only keys
        missions.keySet().stream().forEach(System.out::println);
        // only values
        missions.values().stream().forEach(System.out::println);

    }
}
