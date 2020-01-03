package com.ydh.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {
	//方法一
	@Test
	public void testRandom() {
		for (int i = 0; i <50; i++) {
			RandomUtil.random(1, 3);
		}
		
	}
	//方法二
	@Test
	public void testSubRandom() {
		RandomUtil.subRandom(1,10,3);
	}
	//方法三
	@Test
	public void testRandomCharacter() {
		
	}
	//方法四
	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
