Constructors
    
1.   Use static factory methods where ever possible.
     It hides the complications of creating an object of a class. 
     For ex.The getInstance does a lot of intilisation but is hiden from the user.  
     > Ex. GregorianCalendar.getInstance() <br>
     

2. Chaining to avoid repetition.
```
public class BankAccount {

    double balance;
    double interest;

    BankAccount() {
        this(0);
    }


    public BankAccount(double balance) {
        this(balance, 0.4);
    }

    public BankAccount(double balance, double interest) {
        if (interest < 0 || balance < 0) {
            //throw exception -> only at a single place rather than in each constructor. 
        }
        this.balance = balance;
        this.interest = interest;
    }
}
```

3.  If there appears to be a lot of loose variables for ex. cheese,variety of toppings in a pizza
    use the Builder Design Type.
    
    -> Study this further in the Design Patterns in Java:Creational course. 
    
