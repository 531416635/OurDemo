package com.yao.utils;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RSAUtilsTest {

	private static final Logger logger=LoggerFactory.getLogger(RSAUtilsTest.class);
	
	public static void main(String[] args) throws Exception {
		String source = "1223342321324";
		
		Map<String, Object> sr=RSAUtils.genKeyPair();
		/*System.out.println(RSAUtils.getPublicKey(sr).length()+":"+RSAUtils.getPublicKey(sr));
		System.out.println("----------------");
		System.out.println(RSAUtils.getPrivateKey(sr).length()+":"+RSAUtils.getPrivateKey(sr));
		System.out.println("----------------");*/
		
		//公钥加密  私钥解密
		byte[] encodedData = RSAUtils.encryptPublic(source);
		logger.info(new String(encodedData.length+":"+encodedData));
		logger.info(""+RSAUtils.publicKeyTOprivateKey(source, encodedData));
		
		//私钥加密  公钥解密
		byte[] encodedData1 = RSAUtils.encryptPrivate(source);
		logger.info(new String(encodedData1));
		logger.info(""+RSAUtils.privateKeyTOpublicKey(source, encodedData1));
		
		//私钥签名  公钥验签
		String encoded = RSAUtils.privateSign(encodedData1);
		logger.info(encoded);
		logger.info(""+RSAUtils.privatesignTOpublicsign(encoded,encodedData1));
	}

}
