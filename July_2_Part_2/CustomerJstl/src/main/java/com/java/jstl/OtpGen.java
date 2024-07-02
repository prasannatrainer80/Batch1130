package com.java.jstl;

import java.util.SplittableRandom;

public class OtpGen {

	public static String genrateOtp() {

		StringBuilder generatedOTP = new StringBuilder();
		SplittableRandom splittableRandom = new SplittableRandom();

		for (int i = 0; i < 6; i++) {
				
			int randomNumber = splittableRandom.nextInt(0, 9);
			generatedOTP.append(randomNumber);
		}
		return generatedOTP.toString();
	}
}
