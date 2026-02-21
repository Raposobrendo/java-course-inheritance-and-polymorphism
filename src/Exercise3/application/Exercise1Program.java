package Exercise3.application;

import Exercise3.entities.IndividualPerson;
import Exercise3.entities.JuridicalPerson;
import Exercise3.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1Program {
    public static void main(String[] Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();
        List<Person> persons = new ArrayList<>();

        for (int i = 1; i <= quantity; i++){
            System.out.printf("Tax payer #%d data: \n", i);
            System.out.print("Individual or company (i/c): ");
            char personType = sc.next().toLowerCase().charAt(0);

            while (personType != 'i' && personType != 'c'){
                System.out.print("Incorrect input. Individual or company (i/c): ");
                personType = sc.next().toLowerCase().charAt(0);
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual Income: ");
            Double annualIncome = sc.nextDouble();

            if(personType == 'i'){
                System.out.print("Health expenditures: ");
                Double healthSpending = sc.nextDouble();
                persons.add(new IndividualPerson(name, annualIncome, healthSpending));
            } else{
                System.out.print("Number of employees: ");
                Double quantityEmployees = sc.nextDouble();
                persons.add(new JuridicalPerson(name, annualIncome, quantityEmployees));
            }
        }

        System.out.println("Taxes paid: ");
        Double totalTax = 0.0;
        for(Person p : persons){
            System.out.println(p.getName() + " $ " + String.format("%.2f", p.tax()));
            totalTax += p.tax();
        }

        System.out.println();
        System.out.print("TOTAL TAXES: " + String.format("%.2f", totalTax));

        sc.close();
    }
}
