package com.yubo.string;

import org.apache.commons.codec.digest.DigestUtils;

public class TestASCLL {

	public static void main(String[] args) {
		System.out.println(DigestUtils.md5Hex(DigestUtils.md5Hex("fq18270895856")));
	}
	
	/**
	 * 字符串转ASCII码
	 * @param value
	 * @return
	 */
	public static String stringToAscii(String value){  
	    StringBuffer sbu = new StringBuffer();  
	    char[] chars = value.toCharArray();   
	    for (int i = 0; i < chars.length; i++) {  
	        if(i != chars.length - 1)  
	        {  
	            sbu.append((int)chars[i]).append(",");  
	        }  
	        else {  
	            sbu.append((int)chars[i]);  
	        }  
	    }  
	    return sbu.toString();  
	}
	
	/**
	 * ASCII码转字符串
	 * @param value
	 * @return
	 */
	public static String asciiToString(String value){  
	    StringBuffer sbu = new StringBuffer();  
	    String[] chars = value.split(",");  
	    for (int i = 0; i < chars.length; i++) {  
	        sbu.append((char) Integer.parseInt(chars[i]));  
	    }  
	    return sbu.toString();  
	}
}
