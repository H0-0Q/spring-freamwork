package com.test.dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class UserDao {
	public void pringInfo(){
		System.out.println("User dao");
	}
}
