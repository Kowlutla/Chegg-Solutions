import java.util.*;

public class TeamGoals {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of games: ");
		int noOfGames = sc.nextInt();
		int team1Goals = 0, team2Goals = 0;
		for (int i = 1; i <= noOfGames; i++) {
			System.out.print("Game" + i + ",Enter the number of goals for T1 and T2: ");
			int team1 = sc.nextInt();
			int team2 = sc.nextInt();
			if (team1 < 0) {
				team1 = 0;
			}
			if (team2 < 0) {
				team2 = 0;
			}
			team1Goals += team1;
			team2Goals += team2;
		}
		if (team1Goals > team2Goals) {
			System.out.println("Team1 is the Winner. He has " + team1Goals + " Goals");
		} else if (team1Goals < team2Goals) {
			System.out.println("Team2 is the Winner. He has " + team2Goals + " Goals");
		} else {
			System.out.println("No Winner");
		}

	}

}
