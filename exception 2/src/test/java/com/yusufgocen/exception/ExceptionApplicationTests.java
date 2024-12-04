package com.yusufgocen.exception;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yusufgocen.Dto.DtoEmployee;
import com.yusufgocen.Service.IEmployeeService;
import com.yusufgocen.Starter.ExceptionStarter;

@SpringBootTest(classes = {ExceptionStarter.class})
class ExceptionApplicationTests {

	@Autowired
	private IEmployeeService employeeService;
	
	@Test
	public void testfindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(1L);
	}
	

}
//JUnit:
//En çok kullanılan test framework üdür.
//

