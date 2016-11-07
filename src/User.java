import java.util.Scanner;

public class User extends Player {
	static Scanner scan = new Scanner(System.in);
	static String name;
	static String opponent;

	public static String setName() {
		boolean isValid = false;
		while (isValid == false) {
			System.out.print("Please enter your name: ");
			name = scan.nextLine();
			if (name.length() == 0 || name.charAt(0) == ' ') {
				System.out.println("\nOops! You didn't enter a name.\n");
			} else {
				isValid = true;
			}
		}
		return name;
	}

	public static char setOpponent() {
		char firstLetter = 'a';
		boolean isValid = false;
		while (isValid == false) {
			System.out.print("\nWould you like to play against The Rock or Bob?: ");
			opponent = scan.nextLine();
			opponent = opponent.toLowerCase();
			firstLetter = opponent.charAt(0);
			if (firstLetter != 'r' && firstLetter != 'b' && firstLetter != 't') {
				System.out.println("\n**Please enter The Rock or Bob.**");
			} else {
				isValid = true;
			}
		}
		return firstLetter;
	}

	public String getName() {
		return name;
	}

	@Override
	public Roshambo generateRoshambo() {
		boolean isValid = false;
		while (isValid == false) {
			System.out.print("\nRock, Paper, Scissors? (r/p/s): ");
			String input = scan.nextLine();
			input = input.toUpperCase();
			char firstLetter = input.charAt(0);
			if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
				switch (firstLetter) {
				case 'R':
					return Roshambo.ROCK;
				case 'P':
					return Roshambo.PAPER;
				case 'S':
					return Roshambo.SCISSORS;
				}
			} else if (firstLetter != 'R' || firstLetter != 'P' || firstLetter != 'S') {
				System.out.println("\n**Please enter rock, paper, or scissors.**");
			} else
				isValid = true;
		}
		return generateRoshambo();
	}

}
