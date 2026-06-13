import java.util.HashSet;

public class Main { 
  public static void main(String[] args) {
    // Using var instead of 
    // HashSet<String> cars = new HashSet<String>();
    var cars = new HashSet<String>(); // using var
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  } 
}
