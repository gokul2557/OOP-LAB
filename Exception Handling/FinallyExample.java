public class FinallyExample { 
public static void main(String[] args) { try { 
int num = 10 / 2; System.out.println("Result: " + 
num); 
} catch (ArithmeticException e) { System.out.println("Error: Division 
by zero!"); 
} finally { 
System.out.println("This will always execute."); 
} 
 
System.out.println("Program continues..."); 
} 
}