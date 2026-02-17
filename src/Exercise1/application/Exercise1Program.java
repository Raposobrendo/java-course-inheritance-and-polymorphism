package Exercise1.application;

import Exercise1.entities.Employee;
import Exercise1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1Program {
    public static void main(String[] Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int quantity = sc.nextInt();
        List<Employee> employees = new ArrayList<>();
        for(int i = 1; i <= quantity; i++){
            sc.nextLine();
            System.out.printf("Employee #%d data:\n", i);
            System.out.print("Outsourced (yes/no)?: ");
            String outsourced = sc.nextLine().trim().toLowerCase();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if(outsourced.equals("yes")){
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else{
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
