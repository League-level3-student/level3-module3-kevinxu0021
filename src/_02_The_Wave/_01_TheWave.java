package _02_The_Wave;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_TheWave {
	/*
	 * Background: https://en.wikipedia.org/wiki/Wave_%28audience%29
	 * 
	 * Task: Your task is to create a function that turns a string into a Wave. You
	 * will be passed a string and you must return that string in an ArrayList where
	 * an uppercase letter is a person standing up. Example: wave("hello") =>
	 * "Hello", "hEllo", "heLlo", "helLo", "hellO"
	 * 
	 * 1. The input string will always be lower case but maybe empty. 2. If the
	 * character in the string is whitespace then pass over it as if it was an empty
	 * seat.
	 */

	public static ArrayList<String> wave(String str) {
		ArrayList<String> output = new ArrayList<String>();
		String up;
		StringBuilder builder;
		for (int i = 0; i < str.length(); i++) {
			builder = new StringBuilder(str);
			if (str.charAt(i) != " ".charAt(0)) {
				up = String.valueOf(str.toUpperCase().charAt(i));
				builder.replace(i, i + 1, up);
				output.add(builder.toString());
			}
		}
		return output;
	}

}
