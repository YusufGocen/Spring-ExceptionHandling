package com.yusufgocen.exception;

import lombok.Getter;

@Getter
public enum MessageType {
	
	No_Record_Exıst("1001","Kayıt Bulunamadı"),
	General_Exception("999","Genel Bir hata");
	
	private String code;
	
	private String message;

	MessageType(String code, String message) {
		this.code=code;
		this.message=message;
	}

	}
