package com.yubo.play;

public class TestConstroct {

	private String name;
	private String nickname;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public TestConstroct(){}
	
	public TestConstroct(String name){
		this.name = name;
	}
	
	public TestConstroct(String name, String nickname, Integer age){
		this(name);
		this.nickname = nickname;
		this.age = age;
	}
	
}
