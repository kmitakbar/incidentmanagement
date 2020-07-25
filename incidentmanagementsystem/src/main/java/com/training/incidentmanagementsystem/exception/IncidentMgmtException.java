package com.training.incidentmanagementsystem.exception;

import org.springframework.http.HttpStatus;

public class IncidentMgmtException extends Exception{

	private HttpStatus status;
	private String message;
	
	
	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public IncidentMgmtException() {
		
	}
	
	public IncidentMgmtException(HttpStatus status, String msg) {
		this.status=status;
		this.message=msg;
	}

	@Override
	public String toString() {
		return "IncidentMgmtException [status=" + status + ", message=" + message + "]";
	}
	
	
}
