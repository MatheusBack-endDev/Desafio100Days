package dia06.application;

import dia06.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner leitura = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Rom number: ");
        int romNumber = leitura.nextInt();
        leitura.nextLine();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkinDate = sdf.parse(leitura.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkoutDate = sdf.parse(leitura.next());
        if (checkinDate.after(checkoutDate)){
            System.out.println("erro");
        }else {
            Reservation reservation = new Reservation(romNumber, checkoutDate, checkinDate );
            System.out.println(reservation);

            System.out.println("enter data to update the reservation");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkinDate = sdf.parse(leitura.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkoutDate = sdf.parse(leitura.next());

               String error = reservation.updateDates(checkinDate, checkoutDate);
               if (error != null){
                   System.out.println(error);
               }else {
                System.out.println(reservation);
               }
        }


    }
}
