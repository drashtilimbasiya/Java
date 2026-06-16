import java.util.Set;
import java.util.TreeSet;

public class Main { 
  public static void main(String[] args) { 
    Set<String> cars = new TreeSet<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  } 
}
