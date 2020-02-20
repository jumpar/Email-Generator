package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        System.out.println("Registering a new user: \nEnter first name: ");
        String firstname = names.nextLine();
        System.out.println("Enter last name: ");
        String lastName = names.nextLine();

        Email em1 = new Email(firstname, lastName);

        System.out.println(em1.showInfo());

    }
}
