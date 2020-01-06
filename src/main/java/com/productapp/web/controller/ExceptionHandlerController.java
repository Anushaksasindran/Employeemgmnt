package com.productapp.web.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.productapp.model.exceptions.EmployeeNotFoundException;
import com.productapp.web.form.CustomErrorResponse;


@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler{
	
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	 public ResponseEntity<CustomErrorResponse> handleAccountNotFoundEx(Exception ex) {

        CustomErrorResponse errors = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage());

        return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);

    }

   }
	
	

