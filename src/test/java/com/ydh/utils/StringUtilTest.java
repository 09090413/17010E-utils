package com.ydh.utils;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: 一米七的熊大
 * @date: 2020年1月3日 下午3:00:52
 */
public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b =StringUtil.hasLength(" ");
		System.out.println(b);
	}
	@Test
	public void testHasText() {
		boolean b =StringUtil.hasText(" . ");
		System.out.println(b);
	}
	@Test
	public void testRandomChineseString2() {
		String name = StringUtil.randomChineseString();
		System.out.println(name);
	}
	@Test
	public void testRandomChineseString() {
		String name = StringUtil.randomChineseString(1000);
		System.out.println(name);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	
	@Test
	public void testIsPhoneNumber() {
		
		boolean b = StringUtil.isPhoneNumber("138123456789");
		System.out.println(b);
		
	}
	@Test
	public void testIsEMail() {
		
	//	boolean b = StringUtil.isEMail("number2000@163.com");
			boolean b = StringUtil.isEMail("2345678@qq.com");
		System.out.println(b);
		
	}

}
