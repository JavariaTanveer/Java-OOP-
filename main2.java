package lAB4;

import java.util.Scanner;

class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("--------------Entered data is------------");
        System.out.println("     First Name is : "+ firstName );
        System.out.println("     Last Name is : " + lastName );
        System.out.println("-----------------------------------------");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        User user = new User(firstName, lastName);

        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Do you want to continue? (yes/no): ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.print("Enter first name: ");
                firstName = scanner.nextLine();

                System.out.print("Enter last name: ");
                lastName = scanner.nextLine();

                user = new User(firstName, lastName);
            }
        }
    }
}