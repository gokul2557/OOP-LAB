 
abstract class Vehicle { 
abstract void start(); 
} 
 
 
45 
 
 
class Car extends Vehicle { 
public void start() { 
System.out.println("Car is starting with a key..."); 
} 
} 
 
class Bike extends Vehicle { 
public void start() { 
System.out.println("Bike is starting with a self-start button..."); 
} 
} 
 
public class VehicleTest { 
public static void main(String[] args) { 
Vehicle car = new Car(); 
Vehicle bike = new Bike(); 
 
car.start(); 
bike.start(); 
} 
}