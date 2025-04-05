Employee { 
abstract double calculateSalary(); 
} 
class FullTimeEmployee extends 
Employee { private double 
monthlySalary; 
public FullTimeEmployee(double 
salary) { this.monthlySalary = 
salary; 
} 
 
public double 
calculateSalary() { return 
monthlySalary; 
} 
} 
 
class PartTimeEmployee extends 
Employee { private int 
hoursWorked; 
private double hourlyRate; 
 
public PartTimeEmployee(int hoursWorked, double 
hourlyRate) { this.hoursWorked = hoursWorked; 
44 
 
 
this.hourlyRate = hourlyRate; 
} 
public double 
calculateSalary() { return 
hoursWorked * hourlyRate; 
} 
} 
 
public class EmployeeTest { 
public static void main(String[] args) { 
Employee fullTime = new 
FullTimeEmployee(5000); Employee partTime = 
new PartTimeEmployee(20, 15); 
 
System.out.println("Full-time Salary: $" + 
fullTime.calculateSalary()); 
System.out.println("Part-time Salary: $" + 
partTime.calculateSalary()); 
} 
} 