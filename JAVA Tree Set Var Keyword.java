import java.util.TreeSet;

public class Main { 
  public static void main(String[] args) {
    // Using var instead of 
    // TreeSet<String> cars = new TreeSet<String>();
    var cars = new TreeSet<String>(); // using var
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  } 
}
