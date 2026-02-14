package InheritanceUpcastDowncast.application;

import InheritanceUpcastDowncast.entities.Account;
import InheritanceUpcastDowncast.entities.BusinessAccount;
import InheritanceUpcastDowncast.entities.SavingsAccount;

public class OverrideSuper {
    public static void main (String[] Args){

        Account acc1 = new Account(1001, "Brendo", 2000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Nicolas", 2000.0, 0.1);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "MEI", 2000.0, 1000.0);
        acc3.withdraw(500.0);
        System.out.println(acc3.getBalance());

    }


}
