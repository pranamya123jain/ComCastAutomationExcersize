package com.comcast.AE.webdriverUtility;

import java.util.Random;

public class JavaUtility {

	public int getRandomNumber() {
		Random random = new Random();
		int ran = random.nextInt(5000);
		return ran;
	}
}
