package com.yubo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayClient {

	public static void main(String[] args) {
		int[] ints = {1,2,3,4,8,0};
		@SuppressWarnings("unused")
		List<String> list = new ArrayList<>();
		System.out.println(Arrays.asList(ints).contains(2));
	}
}
