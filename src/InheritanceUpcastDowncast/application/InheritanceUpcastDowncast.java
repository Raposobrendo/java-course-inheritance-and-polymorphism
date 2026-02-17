package InheritanceUpcastDowncast.application;

import InheritanceUpcastDowncast.entities.Account;
import InheritanceUpcastDowncast.entities.BusinessAccount;
import InheritanceUpcastDowncast.entities.SavingsAccount;

public class InheritanceUpcastDowncast {
    public static void main(String[] Args) {


        // Account acc = new Account(1001, "Brendo", 2000.0);
        // With Account class being "abstract", it cannot be directly used.
        BusinessAccount bacc = new BusinessAccount(1002, "Nicolas", 10000.0, 2000.0 );

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount (1003, "Luna", 10000.0, 2000.0);
        Account acc3 = new SavingsAccount(1004, "Juau", 10.0, 0.01 );

        // DOWNCASTING

        // BusinessAccount acc4 = acc2;
        // This operation is not possible because we are trying to create a subclass, recieving the data from a superclass, in this
        // case: creating a Business Account from an already created Account. We can cast the acc2, and will be possible.
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // Compiler don't understand it as an error, only in execution the error will happen.
        // both are subclasses from a superclass, but not the same subclass, even casting the error will persist.

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }



    }
}
