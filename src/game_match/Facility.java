package game_match;

import java.util.Random;

public class Facility {
	double obs = 0.5; // percentage of audience 0 - 100%
//	Boolean tool_isGood = true;
//	Facility(double obs, Boolean flg) {
//		this.obs = obs;
//		this.tool_isGood = flg;
//	}
//	
	public double getAudi(Coach coach) {
		int team_size = coach.team.size();
		double full_perform = team_size * 10;
		double real_perform = 0;
		for (int i = 0; i < team_size; i++) {
			real_perform = real_perform + coach.team.get(i).perform;
		}
		Random rnd = new Random();
		double rand_chg = (double) rnd.nextInt(50) / 100;
		double real_obs = 0;
		if (real_perform / full_perform > 0.5) {
			real_obs = this.obs + rand_chg;
		} else {
			real_obs = this.obs - rand_chg;
		}
		return real_obs;
	}
}
