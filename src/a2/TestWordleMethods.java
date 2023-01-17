package a2;

import java.util.ArrayList;

public class TestWordleMethods {

	public static void main(String[] args) {
		//String s = WordleUtils.replace("why", 4, 'k');
		ArrayList<Boolean> t = WordleUtils.isYellow("uhioi", "hello");
		System.out.println(t);
	}
}