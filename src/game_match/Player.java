package game_match;

import java.util.Random;

public class Player {
	String name = "";
	int age = 0;
	double perform = 0; // 0 - 10
	Player(String name, int age) {
		this.name = name;
		this.age = age;
		Random rnd = new Random();
		this.perform = (double)rnd.nextInt(10);
		System.out.println("player: " + this.name + "\nAge: " + this.age + "\nperform: " + this.perform);
	}
	
//	public void practice(Coach coach) {
//		double change = 0;
//		if (coach.isGood) {
//			change = (10 - perform) * coach.exper / 10;
//			perform = perform + change;
//		} else {
//			change = perform * (5 - coach.exper) / 10;
//			perform = perform - change;
//		}
//	}
	
//	public void livePerform(Facility fac) {
//		double change = 0;
//		if (fac.tool_isGood) {
//			change = (10 - perform) * 0.5;
//			perform = perform + change;
//		} else {
//			change = perform * 0.5;
//			perform = perform - change;
//		}
//	}
}
