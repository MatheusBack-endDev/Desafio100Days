package dia01.application;

import dia01.entities.Order;
import dia01.entities_enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.DEVILERED);
        System.out.println(order);


    }
}
