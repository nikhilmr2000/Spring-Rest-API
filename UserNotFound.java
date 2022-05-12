package com.spring.BrandMobile;

public class UserNotFound extends RuntimeException{
	private String message;
	public UserNotFound() {
		this.message="No Such Brand";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "UserNotFound [message=" + message + "]";
	}
	
}
