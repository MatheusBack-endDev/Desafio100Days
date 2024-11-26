package dia06.application;

import dia06.model.entities.Reservation;
import dia06.model.exceptions.DomainException;

import javax.management.RuntimeMBeanException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Rom number: ");
            int romNumber = leitura.nextInt();
            leitura.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkinDate = sdf.parse(leitura.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkoutDate = sdf.parse(leitura.next());


            Reservation reservation = new Reservation(romNumber, checkoutDate, checkinDate );
            System.out.println(reservation);

            System.out.println("enter data to update the reservation");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkinDate = sdf.parse(leitura.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkoutDate = sdf.parse(leitura.next());

            reservation.updateDates(checkinDate, checkoutDate);
            System.out.println(reservation);

        }
        catch (ParseException e ){
            System.out.println("data invalida");
        }
        catch (DomainException e ){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("unexpected error");
        }

    }
}
