package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.LegalPerson;
import Entities.Person;
import Entities.PhysicalPerson;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String individual = "i";
        String company = "c";

        List<Person> people = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        Integer n = sc.nextInt();
        for (Integer i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c): ");
            String type = sc.next();

            sc.nextLine();

            System.out.print("Name:");
            String name = sc.nextLine();

            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();

            if (type.toLowerCase().equals(individual)) {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Person person = new PhysicalPerson(name, anualIncome, healthExpenditures);
                people.add(person);
            } else if (type.toLowerCase().equals(company)) {
                System.out.print("Number of employees: ");
                Integer numberOfEmployee = sc.nextInt();
                Person person = new LegalPerson(name, anualIncome, numberOfEmployee);
                people.add(person);
            }

            System.out.println("TAXES PAID");
            for (Person person : people) {
                System.out.println(person.toString());
            }

        }

        sc.close();
    }
}
