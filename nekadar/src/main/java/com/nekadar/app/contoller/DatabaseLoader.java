package com.nekadar.app.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nekadar.app.entities.Employee;
import com.nekadar.app.entities.User;
import com.nekadar.app.repositories.EmployeeRepository;
import com.nekadar.app.repositories.UserRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		userTableRefill();
		employeeTableRefill();
	}

	private void userTableRefill() {
		//
	}

	private void employeeTableRefill() {
		//
	}

}
