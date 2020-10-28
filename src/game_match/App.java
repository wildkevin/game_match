package game_match;

public class App {
	public static void main(String[] args) throws Exception {
		int playerCtn = 2;
		System.out.println("================");
		System.out.println("SETUP:");
		Coach coach_a = new Coach("Calvin", 20, 8.5, playerCtn);
		Coach coach_b = new Coach("Klein", 22, 1.5, playerCtn);
		System.out.println("================");
		
		System.out.println("AFTER TRAINING:");
		int train_rnd = 1;
		for (int i = 0; i < train_rnd; i++) {
			System.out.println("Training: " + i);
			System.out.println(coach_a.name + " team's performance:");
			coach_a.train();
			System.out.println("---------");
			System.out.println(coach_b.name + " team's performance:");
			coach_b.train();
			System.out.println("================");
		}
		
		System.out.println("LIVE MATCH");
		Facility fac = new Facility();
		double obs_a = fac.getAudi(coach_a);
		double obs_b = fac.getAudi(coach_b);
		double total_obs = (obs_a + obs_b) / 2;
		System.out.println("The total percentage of audience is " + total_obs);
	}

}
