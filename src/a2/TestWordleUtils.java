package a2;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TestWordleUtils {

	@Test
	public void test01a_replace() {
		// method args
		String s = "A";
		int index = 0;
		char c = 'B';
		
		// expected answer
		String exp = "B";
		
		// run test
		assertEquals(exp, WordleUtils.replace(s, index, c));
	}

	@Test
	public void test01b_replace() {
		// method args
		String s = "GUMBO";
		int index = 0;
		char c = 'J';
		
		// expected answer
		String exp = "JUMBO";
		
		// run test
		assertEquals(exp, WordleUtils.replace(s, index, c));
	}
	
	@Test
	public void test01c_replace() {
		// method args
		String s = "JIMBO";
		int index = 1;
		char c = 'U';
		
		// expected answer
		String exp = "JUMBO";
		
		// run test
		assertEquals(exp, WordleUtils.replace(s, index, c));
	}
	
	
	@Test
	public void test02_isGreen() {
		//method args
		String guess = "YELL";
		String answer = "BLUES";
		
		try {
			WordleUtils.isGreen(guess, answer);
			fail("IllegalArgumentException expected for guess " + guess);
		} catch (IllegalArgumentException x){
			// expected result
		}
	}
	
	@Test
	public void test03_isYellow() {
		//method args
		String guess = "KAYAK";
		String answer = "WHACK";
		
		//expected result
		ArrayList<Boolean> exp = new ArrayList<>();
		exp.add(false);
		exp.add(true);
		for (int i = 0; i < 3; i++) {
			exp.add(false);
		}
		
		//run test
		assertEquals(exp, WordleUtils.isYellow(guess, answer));
	}
	
	@Test
	public void test04_getColors() {
		//method args
		String guess = "MALLS";
		String answer = "MAILS";
		
		//expected result
		ArrayList<WordleColor> exp = new ArrayList<>();
		exp.add(WordleColor.GREEN);
		exp.add(WordleColor.GREEN);
		exp.add(WordleColor.GRAY);
		exp.add(WordleColor.GREEN);
		exp.add(WordleColor.GREEN);
		
		//run test
		assertEquals(exp, WordleUtils.getColors(guess, answer));
		
	}
	
}
