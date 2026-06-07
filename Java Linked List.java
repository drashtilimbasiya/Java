import java.util.LinkedList;

public class Main { 
  public static void main(String[] args) {
    // Using var instead of 
    // LinkedList<String> cars = new LinkedList<String>();
    var cars = new LinkedList<String>(); // using var
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  } 
}
