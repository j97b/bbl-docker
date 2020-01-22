package com.bae.tests.domain;

import com.bae.persistence.domain.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

	private User testUser = new User("testName");

	@Test
	public void getUsernameTest() {
		Assert.assertEquals("testName", testUser.getName());
	}

}
