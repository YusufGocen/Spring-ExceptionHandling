package com.yusufgocen.Handler;

import java.net.InetAddress;
import java.net.UnknownHostException;import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.yusufgocen.exception.BaseException;

@ControllerAdvice
public class GlobalExceptionHandler {
	//Fırlatılan Hataları Ekrana Göstermek için yazıyoruz.
	
	@ExceptionHandler(value = {BaseException.class})
	public ResponseEntity<ApiError> handleBaseException(BaseException exception ,WebRequest request) {
		
		return ResponseEntity.badRequest().body(createApiError(exception.getMessage(), request));
	}
	
	private String getHostname() {
		try {
		return InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			System.out.println("hata olustu"+e.getMessage());
		}
		return null;
	}
	
	public <E> ApiError<E> createApiError(E message, WebRequest request){
		
		ApiError<E> apiError=new ApiError<>();
		apiError.setStatus(HttpStatus.BAD_REQUEST.value());
		
		Exception<E> exception=new Exception<>();
		exception.setCreateTime(new Date(0));
		exception.setHostName(getHostname());
		exception.setPath(request.getDescription(false));
		exception.setMessage(message);
		
		apiError.setException(exception);

		return apiError;
	}
}