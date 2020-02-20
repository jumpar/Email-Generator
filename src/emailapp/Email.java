package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 15;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String company = "company.com";

    //Constructor needs 1st and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //Calling method asking for the department and returning it
        this.department = setDepartment();

        //Method for getting a password
        this.password = genPasswrod(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Generate the Email
        if (department == "sales" || department == "dev" || department == "acc") {
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
        } else {
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + company;
        }
    }

    //Ask for department
    private String setDepartment() {
        System.out.print("Enter the department\n1.Sales\n2.Development\n3.Accounting \n0.none\n");
        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();
        if (choice == 1) {
            return "sales";
        } else if (choice == 2) {
            return "dev";
        } else if (choice == 3) {
            return "acc";
        } else {
            return "";
        }
    }

    //Generate a password
    private String genPasswrod(int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    //Mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Change password
    public void changePassword(String password) {
        this.password = password;

    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Dsiplay Name " + firstName + " " + lastName +
                "\nDepartment: " + department +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "GB";

    }

}
