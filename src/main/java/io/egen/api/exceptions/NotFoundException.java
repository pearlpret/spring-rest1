package io.egen.api.exceptions;

import javax.xml.ws.soap.AddressingFeature.Responses;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code =HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(String msg){
		
		super(msg);
		
	}
	
	public NotFoundException(String msg,Throwable cause){
		super(msg,cause);
	}

}
