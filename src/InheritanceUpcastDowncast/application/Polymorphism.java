package InheritanceUpcastDowncast.application;

import InheritanceUpcastDowncast.entities.Account;
import InheritanceUpcastDowncast.entities.SavingsAccount;

public class Polymorphism {
    public static void main(String[] Args){

        Account x = new Account(1001, "João", 1000.0);
        Account y = new SavingsAccount(1002, "Brendo", 1000.0, 0.5);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
