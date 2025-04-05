class BankAccount { 
private String accountNumber; 
private double balance; 
 
public BankAccount(String accountNumber, double balance) { 
this.accountNumber = accountNumber; 
if (balance >= 0) { 
this.balance = balance; 
} else { 
this.balance = 0; 
System.out.println("Balance cannot be negative. Setting to 0."); 
} 
} 
 
public void deposit(double amount) { if 
(amount > 0) { 
balance += amount; 
System.out.println("Deposited: $" + amount); 
} else { 
System.out.println("Invalid deposit amount."); 
} 
} 
 
public void withdraw(double amount) { 
if (amount > 0 && amount <= balance) { 
balance -= amount; 
System.out.println("Withdrawn: $" + amount); 
} else { 
System.out.println("Invalid withdrawal amount or insufficient balance."); 
} 
} 
 
47 
 
 
public double getBalance() { 
return balance; 
} 
public String getAccountNumber() { 
return accountNumber; 
} 
public static void main(String[] args) { 
BankAccount account = new BankAccount("123456789", 500); 
account.deposit(200); 
account.withdraw(100); 
System.out.println("Final Balance: $" + account.getBalance()); 
} 
} 
O