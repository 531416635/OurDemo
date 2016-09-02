package com.yao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassTest {

	public static void main(String[] args) {
		for(int i=0;i<1000;i++){
		Date date=new Date();
		System.out.println(new SimpleDateFormat("yyyyMMdd-HHmmss-SSS") .format(date));
		}
	}
}
