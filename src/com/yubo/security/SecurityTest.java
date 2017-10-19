package com.yubo.security;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 有关加密方面的测试类
 * @author Quiet
 * 2017年10月11日 下午1:52:55
 */
public class SecurityTest {

	private static int id;
	private static String privateKey = "yubo@card";
	private static long time;
	
	public static void main(String[] args) {
		time = System.currentTimeMillis();
		System.out.println(time);
		id = 2;
		//return sign.equals(DigestUtils.md5Hex("time:"+time+"id:"+id+"key:"+privateKey));
		System.out.println(DigestUtils.md5Hex("time:"+time+"id:"+id+"key:"+privateKey));
		//?sign=15d9b836cddbe85da77abffec1ce8471&time=1508228995749&id=2
	}
}
