package com.yusufgocen.Controller.Impl;

import com.yusufgocen.Model.RootEntitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class RestBaseController {

	public <T>RootEntitity<T>ok(T data){
		return RootEntitity.ok(data);
	}
	
	public <T>RootEntitity<T> error(String errormessage){
		return RootEntitity.error(errormessage);
	}
}
