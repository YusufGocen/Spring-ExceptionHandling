package com.yusufgocen.Controller;

import com.yusufgocen.Dto.DtoEmployee;
import com.yusufgocen.Model.RootEntitity;

public interface RestEmployeeController {
	public RootEntitity<DtoEmployee> findEmployeeById(Long id);
}
