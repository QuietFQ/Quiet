package com.yubo.math;

import java.util.Arrays;

/**
 * 实现一个数组的增删改查
 * @author Quiet
 * 2017年10月18日 下午3:20:16
 */
public class MathTest {

	public static void main(String[] args) {
		String[] strs = {"quiet","kim","www"};
		strs = ArrayUtils.delete(2, strs);
		System.out.println(Arrays.toString(strs));
	}
}

class ArrayUtils{
	
	private static final int ADD_ARGUEMENT = 2;
	
	/**
	 * 往数组中新增数据
	 * @param strs
	 * @param str
	 * @return
	 */
	public static String[] add(String[] strs, String str){
		//先判断数组需不需要扩容
		if(null == strs[strs.length - 1]){
			//不需要扩容
			int nullIndex = getNullIndex(strs);
			strs[nullIndex] = str;
			return strs;
		}
		//需要扩容
		int addIndex = strs.length;
		strs = addLength(strs);
		strs[addIndex] = str;
		return strs;
	}
	
	/**
	 * 删除数组中的数据
	 */
	public static String[] delete(int index,String[] strs){
		String[] latterArray = new String[strs.length];
		for(int i = 0; i < strs.length - 1; i++){
			if(i >= index){
				latterArray[i] = strs[i+1];
			}
			latterArray[i] = strs[i];
		}
		return latterArray;
	}
	
	/**
	 * 数组扩容
	 */
	public static String[] addLength(String[] strs){
		String[] returnStr = new String[strs.length*ADD_ARGUEMENT];
		copyArray(returnStr, strs);
		return returnStr;
	}
	
	/**
	 * copyArray
	 */
	public static void copyArray(String[] returnArray, String[] begingArray){
		for(int i = 0; i < begingArray.length; i++){
			returnArray[i] = begingArray[i];
		}
	}
	
	/**
	 * 得到最后一个下标是0的index
	 */
	public static int getNullIndex(String[] strs){
		for(int i = 0; i < strs.length; i++){
			if(null == strs[i]){
				return i;
			}
		}
		return -1;
	}

}