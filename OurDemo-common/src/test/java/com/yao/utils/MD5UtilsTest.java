package com.yao.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MD5UtilsTest {
	private static final Logger logger = LoggerFactory.getLogger(MD5UtilsTest.class);
	public static void main(String[] args) {
		String result = MD5Utils.getMD5("123");
		logger.info(result);
	}

}
