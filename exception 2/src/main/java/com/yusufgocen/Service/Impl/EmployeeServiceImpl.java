package com.yusufgocen.Service.Impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yusufgocen.Dto.DtoDepartment;
import com.yusufgocen.Dto.DtoEmployee;
import com.yusufgocen.Model.Department;
import com.yusufgocen.Model.Employee;
import com.yusufgocen.Repository.EmployeeRepository;
import com.yusufgocen.Service.IEmployeeService;
import com.yusufgocen.exception.BaseException;
import com.yusufgocen.exception.ErrorMessage;
import com.yusufgocen.exception.MessageType;



@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
		Optional<Employee> optional = employeeRepository.findById(id);
		if(optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.No_Record_Exıst, id.toString()));
		}
		
		Employee employee = optional.get();
		Department department = employee.getDepartment();
		
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDepartment(dtoDepartment);
		
		return dtoEmployee;
	}

}
