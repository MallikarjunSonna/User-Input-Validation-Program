package User;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<UserInputsAndValidation> userList = new ArrayList<>();

		while (true) {
			System.out.println("Enter user details:");
			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Phone number: ");
			String phoneNumber = scanner.nextLine();

			System.out.print("Gender: ");
			String gender = scanner.nextLine();

			System.out.print("Age: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character left by nextInt()

			System.out.print("Password: ");
			String password = scanner.nextLine();

			// Validate user input
			if (name.isEmpty() || phoneNumber.isEmpty() || gender.isEmpty() || password.isEmpty()) {
				System.out.println("Please enter all the details.");
				continue;
			}

			if (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
				System.out.println("Invalid phone number.");
				continue;
			}

			if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other")) {
				System.out.println("Invalid gender.");
				continue;
			}

			if (age < 18 || age > 120) {
				System.out.println("Invalid age.");
				continue;
			}

			if (password.length() < 8) {
				System.out.println("Password must be at least 8 characters long.");
				continue;
			}

			UserInputsAndValidation user = new UserInputsAndValidation(name, phoneNumber, gender, age, password);
			userList.add(user);

			System.out.println("User added successfully.");

			System.out.print("Do you want to add another user? (Y/N): ");
			String choice = scanner.nextLine();

			if (choice.equalsIgnoreCase("N")) {
				break;
			}
		}

		// Print the list of users
		System.out.println("List of users:");
		for (UserInputsAndValidation user : userList) {
			System.out.println(user.toString());
		}

	}

}
