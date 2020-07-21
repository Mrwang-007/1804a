package com.wzy.utils;

import java.util.regex.Pattern;

public class StringUtil {
		
	//判断全为数字
	public static boolean isInteger(String str){
		Pattern patt = Pattern.compile("[0-9]*");
		return  patt.matcher(str).matches();
	}
	public static void main(String[] args) {
		
		String str = "23456789765";
		System.out.println(isInteger(str));
	}
}
