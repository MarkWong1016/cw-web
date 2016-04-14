package com.cw.base.controller;

import org.apache.log4j.Logger;

public class BaseController {
	protected Logger logger = Logger.getLogger(this.getClass());

	public static final String PAGE_ERROR = "error";
	
	public static final String TICKET_SUCCESS = "ticket/success";
	
	public static final String TICKET_FAIL = "ticket/fail";

}
