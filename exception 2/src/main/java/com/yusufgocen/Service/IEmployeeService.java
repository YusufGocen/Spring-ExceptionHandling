package com.yusufgocen.Service;

import com.yusufgocen.Dto.DtoEmployee;

public interface IEmployeeService {
	public DtoEmployee findEmployeeById(Long id);
}
