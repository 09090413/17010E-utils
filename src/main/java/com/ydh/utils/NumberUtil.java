package com.ydh.utils;

public class NumberUtil {
	public static boolean isNumber(String src) {
		String reg ="^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}
}
