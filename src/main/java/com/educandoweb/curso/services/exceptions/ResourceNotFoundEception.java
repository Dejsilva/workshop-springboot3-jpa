package com.educandoweb.curso.services.exceptions;

public class ResourceNotFoundEception extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public ResourceNotFoundEception(Object id) {
		super("Resource not found. Id "  + id);
	}
}
