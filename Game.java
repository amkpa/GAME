import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Code {
	Scanner s = new Scanner(System.in);
	static List<String> list = Arrays.asList("ROCK", "PAPER", "SCISSOR");

	public static void play(String player) {
		String system = select();
		if ((player.equals("ROCK")&& system.equals("SCISSOR"))
				||(player.equals("SCISSOR")&& system.equals("PAPER"))
				||(player.equals("PAPER")&& system.equals("ROCK"))) {
			System.out.println("You: "+ player + " " + "Computer: "+system);
			System.out.println("Winner..Winner Chicken Dinner...");
		}
		else {
			System.out.println("You: "+ player + " " + "Computer: "+system);
			System.out.println("Better luck Next time...");
		}
		System.out.println("\n");

	}

	public static String select() {
		Collections.shuffle(list);
		return list.get(0);
	}

	public static void showMenu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item..");
		System.out.println("1.ROCK");
		System.out.println("2.PAPER");
		System.out.println("3.SCISSOR");
		int x=sc.nextInt();
		
		if(x==1)play("ROCK");
		else if(x==2)play("PAPER");
		else if(x==3)play("SCISSOR");
	}
}

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Welcome to The Game*******");
		int opt = 0;
		while (true) {
			System.out.println("Game Menu");
			System.out.println("---------");
			System.out.println("1.Play");
			System.out.println("2.End Game");
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				Code.showMenu();
				break;
			case 2:
				System.out.println("Game Ended..");
				System.exit(0);
			default:
				System.out.println("Enter Valid option..");
			}
		}

	}
}
