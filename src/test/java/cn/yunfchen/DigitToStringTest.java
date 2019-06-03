package cn.yunfchen;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class DigitToStringTest {

	@Test
	public void test() {
		DigitToString s = new DigitToString();
        List<String> actuals = s.letterCombinations("23");
        List<String> expects =new ArrayList<String>();
        expects.add("ad");
        expects.add("ae");
        expects.add("af");
        expects.add("bd");
        expects.add("be");
        expects.add("bf");
        expects.add("cd");
        expects.add("ce");
        expects.add("cf");
        assertEquals(expects,actuals);
	}

		

}
