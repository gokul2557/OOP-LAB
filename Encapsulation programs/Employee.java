class Employee { private 
String name; private 
int id; 
private double salary; 
 
public Employee(String name, int id, double salary) { 
this.name = name; 
49 
 
 
this.id = id; 
setSalary(salary); 
} 
 
public void setSalary(double salary) { if 
(salary >= 0) { 
this.salary = salary; 
} else { 
System.out.println("Salary cannot be negative. Setting to 0."); 
this.salary = 0; 
} 
} 
 
public double getSalary() { 
return salary; 
} 
 
public void display() { 
System.out.println("Employee Name: " + name + ", ID: " + id + ", Salary: $" + 
salary); 
} 
 
public static void main(String[] args) { 
Employee emp = new Employee("John", 1001, 5000); 
emp.display(); 
} 
} 
 