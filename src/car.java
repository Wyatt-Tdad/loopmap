import java.util.*;
import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        HashMap<String, String> cars = new HashMap<>();
        Scanner in = new Scanner(System.in);

        cars.put("Civic", "Honda");
        cars.put("Tundra", "Toyota");
        cars.put("Mustang", "Ford");
        cars.put("Ram", "Dodge");
        cars.put("Model T", "Tesla");

        System.out.println("What model car are you looking for?");
        String lookingFor = in.nextLine();
        if(cars.get(lookingFor).length()>0){
            System.out.println("Oh, you're looking for a " + lookingFor + "? Our " + cars.get(lookingFor) + " selection is right over here...");
        }
        in.close();
    }
}
