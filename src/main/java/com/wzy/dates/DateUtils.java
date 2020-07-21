package com.wzy.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	//将字符串类型的日期转换成date类型
	
	public static Date StringDate(String srt){
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date date = sdf.parse(srt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//根据日期算年龄
	//public static  int getAge(String rq){
		//创建Calendar 实例 代表当前时间
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
	//}
	
	/*public static  int getAge(Date rq){
		
	}*/
}
