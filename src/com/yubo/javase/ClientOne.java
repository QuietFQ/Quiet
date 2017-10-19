package com.yubo.javase;

import java.io.IOException;

/**
 * Runtime ec;
 * ec=Runtime.getRuntime();
	ec.exec("这里是应用程序的路径或者命令");
	比如：ec.exec("c:\\123.exe");
 * @author Quiet
 * 2017年9月19日 上午11:48:48
 */
public class ClientOne {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		String exeName = "D:\\install\\Google\\Chrome\\Application\\chrome.exe";
		try {
			runtime.exec(exeName);
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("打开"+exeName+"软件异常");
		}
	}
}
