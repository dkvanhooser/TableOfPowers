import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Learn your squares and cubes\n");
		char c;
		int maxNum = 0;
		do {

			System.out.print("Please enter an integer to count up to: ");
			//takes user input and catches the exception if they put anything other than an int
			try {
				maxNum = s.nextInt();
			} catch (Exception e) {
				System.out.println("That was not a number!");
				break;
			}

			System.out.println();
			System.out.println(" ___________________________________");
			System.out.println("|  Number   | Squared   | Cubed     |");
			System.out.println(" ===================================");
			//loops from 1 to the number the user enters.
			for (int i = 1; i <= maxNum; i++) {
				//creates a table with the format part of system.out to equal 10 spaces aligned to the left
				System.out.format("| %-10d| " + "%-10d| " + "%-10d| \n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
				System.out.println(" -----------------------------------");
			}
			//asks user if they want to continue. will continue if they start the string with anything other than 'n'
			System.out.println();
			System.out.println("Continue? y/n");
			//collects garbage enter because java things
			s.nextLine();
			//takes the first char the user enters and checks if they want to keep using the program
			c = s.nextLine().toLowerCase().charAt(0);

		} while (c != 'n');
		System.out.println("Thanks for using my table of powers!");
		s.close();
	}

}
