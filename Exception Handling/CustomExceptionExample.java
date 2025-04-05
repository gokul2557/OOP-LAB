class AgeException extends Exception { 
public AgeException(String message) { 
super(message); 
} 
} 
 
public class CustomExceptionExample { 
static void checkAge(int age) throws AgeException 
{ if (age < 18) { 
throw new AgeException("Not eligible to vote!"); 
} else { 
System.out.println("Eligible to vote."); 
} 
} 
 
public static void main(String[] args) 
{ try { 
checkAge(16); // This will throw an exception 
} catch (AgeException e) { 
System.out.println("Exception: " + e.getMessage()); 
} 
} 
}