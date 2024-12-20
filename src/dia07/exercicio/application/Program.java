package dia07.exercicio.application;

import dia07.exercicio.model.entities.Account;
import dia07.exercicio.model.exception.Limitexception;

import javax.management.RuntimeMBeanException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = leitura.nextInt();
            leitura.nextLine();
            System.out.print("Holder: ");
            String holder = leitura.nextLine();
            System.out.printf("Initial balance: ");
            double initialBalance = leitura.nextDouble();
            System.out.printf("Withdraw Limit: ");
            double withdrawLimit = leitura.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);


            System.out.print("Enter amount for withdraw: ");
            double amountWithdraw = leitura.nextDouble();
            account.withdraw(amountWithdraw);

            System.out.println(account.getBalance());
        }
        catch (InputMismatchException e){
            System.out.println("erro letra");
        }
        catch (RuntimeMBeanException e){
            System.out.println("erro");
        } catch (Limitexception e) {
            System.out.println(e.getMessage());
        }
    }
}
