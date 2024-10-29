package dia02.application;

import dia02.entities.Department;
import dia02.entities.HourContract;
import dia02.entities.Worker;
import dia02.entities_enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class application {
    public static void main(String[] args) throws ParseException {
        Scanner leitura = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Enter department name: ");
        String departamentoName = leitura.nextLine();
        System.out.println("Enter worker date: ");
        System.out.print("Name: ");
        String name = leitura.nextLine();
        System.out.print("Level: ");
        String level = leitura.nextLine();
        System.out.print("Base Salary: ");
        double salarioBase = leitura.nextDouble();
        Worker trabalhador = new Worker(name, salarioBase, WorkerLevel.valueOf(level), new Department(departamentoName));
        System.out.print("How many contracts to this worker? ");
        int numeroDeContratos = leitura.nextInt();
        for (int i = 0; i < numeroDeContratos; i++) {
            System.out.print("Enter contract "+ "#" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date dateinform = sdf.parse(leitura.next());
            System.out.print("Value per hour: ");
            double valueHour = leitura.nextDouble();
            System.out.print("Duration: ");
            int valuesDuration = leitura.nextInt();
            HourContract contract = new HourContract(dateinform, valueHour, valuesDuration);
            trabalhador.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dataCalculate = leitura.nextLine();
        int month = Integer.parseInt(dataCalculate.substring(0,2));
        int year = Integer.parseInt(dataCalculate.substring(3));

        System.out.println("Name: " + trabalhador.getName());
        System.out.println("Department " + trabalhador.getDepartment());
        System.out.print("Income for " + dataCalculate + ": " + String.format("%.2f", trabalhador.income(month, year)));
    }
}
