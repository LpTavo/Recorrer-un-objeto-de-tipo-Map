import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear un mapa de nombres y edades
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 35);
        
        // Recorrer el mapa usando for tradicional
        System.out.println("Recorrer el mapa usando for tradicional:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }
        
        // Recorrer el mapa usando foreach
        System.out.println("\nRecorrer el mapa usando foreach:");
        for (String name : ageMap.keySet()) {
            System.out.println("Nombre: " + name + ", Edad: " + ageMap.get(name));
        }
        
        // Recorrer el mapa usando while
        System.out.println("\nRecorrer el mapa usando while:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }
        
        // Recorrer el mapa usando do-while (no muy común pero se puede hacer)
        System.out.println("\nRecorrer el mapa usando do-while:");
        Iterator<Map.Entry<String, Integer>> iterator = ageMap.entrySet().iterator();
        do {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        } while (iterator.hasNext());
    }
}
