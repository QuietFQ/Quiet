package com.yubo.enums;

public enum Colors {

	RED(1,"red"),
	BLACK(2,"black"),
	WHITE(3,"white"),
	YELLOW(4,"yellow");
	
	private final int index;
	private final String name;
	
	public int getIndex(){
		return index;
	}
	
	public String getName(){
		return name;
	}
	
	private Colors(int index, String name){
		this.index = index;
		this.name = name;
	}
}

class Test{
	public static void main(String[] args) {
		System.out.println(Colors.RED.getIndex());
		Colors[] values = Colors.values();
		for(Colors color : values){
			System.out.println(color.getIndex()+":"+color.getName());
		}
	}
}