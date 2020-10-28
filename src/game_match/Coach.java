package game_match;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coach {
	String name = "";
	int age = 0;
	double exper = 0; // 0 - 10
	Boolean isGood = true;
	List<Player> team = new ArrayList<>();
	Coach(String name, int age, double exper, int playerCtn) {
		this.name = name;
		this.age = age;
		this.exper = exper;
		if (exper < 5) {
			this.isGood = false;
		}
		System.out.println("coach: " + this.name + "\nAge: " + this.age + "\nexperience: " + this.exper);
		Random rnd = new Random();
		for (int i = 0; i < playerCtn; i++) {
			int rand = rnd.nextInt(5);
			this.team.add(new Player("player" + i, 18 + rand));
		}
		System.out.println("-------------");
	}
	
	public void train() {
		for (int i = 0; i < team.size(); i++) {
			double change = 0;
			if (this.isGood) {
				change = (10 - team.get(i).perform) * this.exper / 10;
				team.get(i).perform = team.get(i).perform + change;
			} else {
				change = team.get(i).perform * (5 - this.exper) / 10;
				team.get(i).perform = team.get(i).perform - change;
			}
		}
		prtPlyInfo();
	}
	
	private void prtPlyInfo() {
		for (int i = 0; i < team.size(); i++) {
			System.out.println(team.get(i).name + " now performs: " + team.get(i).perform);
		}
	}
}
