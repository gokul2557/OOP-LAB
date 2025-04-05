
class Calculator {  
    public int add(int a, int b) {  
        return a + b;  
    }  
  
    public double add(double a, double b, double c) {  
        return a + b + c;  
    }  
  
    public static void main(String[] args) {  
        Calculator calc = new Calculator();  
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));  
        System.out.println("Sum of 2.5, 3.5, and 4.0: " + calc.add(2.5, 3.5, 4.0));  
    }  
} 