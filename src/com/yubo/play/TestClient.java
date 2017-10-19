package com.yubo.play;

import org.apache.commons.beanutils.BeanUtils;

public class TestClient {
	
	public static void main(String[] args) throws Exception {
		Person person = new Person();
		person.setAge(18);
		person.setUsername("quiet");
		person.setWrife("sfa");
		Student student = new Student();
		BeanUtils.copyProperties(student, person);
		System.out.println(student.getAge()+":"+student.getUsername());
	}

}
