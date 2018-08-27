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
//		userRepository.save(new User("Suleyman Bedirhanoglu", "her yer kazikci dolu"));
//		userRepository.save(new User("Tugrul Ocak", "Bu bir test mesajidir"));
//		userRepository.save(new User("Ugur Yazici", "aciklamalar.. aciklamalar.. aciklamalar"));
//		userRepository.save(new User("Sihab Demir", "tt net cok kazikci bir firmadir"));
		
	}

	private void employeeTableRefill() {
//		employeeRepository.save(new Employee("Sihab", "5000"));
//		employeeRepository.save(new Employee("Ugur", "6000"));
//		employeeRepository.save(new Employee("Suleyman", "7000"));
//		employeeRepository.save(new Employee("Tugrul", "8000"));
	}

}
