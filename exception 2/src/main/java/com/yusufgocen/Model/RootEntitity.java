package com.yusufgocen.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootEntitity <T>{

	private boolean results;
	
	private String errorMesage;
	
	private T data;
	
	
	public static <T> RootEntitity<T> ok (T data){
		RootEntitity<T> rootEntitity=new RootEntitity<>();
		rootEntitity.setData(data);
		rootEntitity.setErrorMesage(null);
		rootEntitity.setResults(true);
		return rootEntitity;
	}
	
	public static <T> RootEntitity<T>error(String errormessage){
		RootEntitity<T> rootEntitity=new RootEntitity<>();
		rootEntitity.setData(null);
		rootEntitity.setErrorMesage(errormessage);
		rootEntitity.setResults(false);
		return rootEntitity;
	}
}
