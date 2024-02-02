package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //INSTANCIANDO UMA LISTA DE EMPLOYEE
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int numberOfEmployee = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=numberOfEmployee; i++) {
            System.out.printf("Employee #%d data", i);
            System.out.println("Outsourced (y/n)?");
            String outsourced = sc.nextLine();

            while (!outsourced.equalsIgnoreCase("y") && !outsourced.equalsIgnoreCase("n")) {
                System.out.println("Invalid answer. Use 'y' ou 'n'.");
                System.out.println("Outsourced (y/n)?");
                outsourced = sc.nextLine();
            }

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if (outsourced.equalsIgnoreCase("y")) {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();
                //INSTANCIANDO UM OBJETO FUNCIONARIO
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                //ADICIONANDO O OBJETO NA LISTA
                list.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }



        sc.close();
    }
}
