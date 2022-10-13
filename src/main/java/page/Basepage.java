package page;

import java.util.Random;

public class Basepage {
	
	public int genarateRandomNum(int boundaryNum) {
		Random rnd  = new Random();
		int generatenum = rnd.nextInt(boundaryNum);
		return generatenum;
	}

}
