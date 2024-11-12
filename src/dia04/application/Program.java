package dia04.application;

import dia04.entities.Account;
import dia04.entities.BusinessAccount;

import java.awt.image.BufferStrategy;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "alex", 0.0);
        BusinessAccount bcc = new BusinessAccount();

        // UPCASTING

        Account acc1 = new BusinessAccount();
        Account acc2 = bcc;

        // DOWNCATING

        BusinessAccount acc03 = (BusinessAccount) acc;
        acc03.loan(100);
    }
}
