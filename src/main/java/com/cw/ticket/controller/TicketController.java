package com.cw.ticket.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cw.base.controller.BaseController;
import com.cw.model.Customer;
import com.cw.model.Ticket;
import com.cw.model.TicketResult;

@Controller
public class TicketController extends BaseController {
	
	@RequestMapping(value = "/ticket", produces = "application/json;charset=UTF-8")
	public void ticket(@RequestParam String tid, HttpServletResponse response) throws IOException {
		Ticket ticketInfo = getTicketInfo(tid);
		if (ticketInfo != null) {
			response.sendRedirect(TICKET_SUCCESS + "?tid=" + tid);
		} else {
			response.sendRedirect(TICKET_FAIL + "?tid=" + tid);
		}
	}
	
	@RequestMapping("/ticket/success")
	public ModelAndView success(@RequestParam String tid, HttpServletRequest request, HttpServletResponse response) throws IOException {
		logger.info("TicketController success");
		ModelAndView m = new ModelAndView();
		
		TicketResult result = new TicketResult();
		Ticket ticketInfo = getTicketInfo(tid);
		result.setTicket(ticketInfo);
		result.setDateTime(new Date());

		m.addObject("ticketResult", result);
		
		return m;
		//response.sendRedirect("../" + TICKET_RESULT);
		
		//return result;
	}
	
	@RequestMapping("/ticket/fail")
	public ModelAndView fail(@RequestParam String tid, HttpServletRequest request, HttpServletResponse response) throws IOException {
		logger.info("TicketController fail");
		ModelAndView m = new ModelAndView();
		
		TicketResult result = new TicketResult();
		Ticket ticketInfo = getTicketInfo(tid);
		result.setTicket(ticketInfo);
		result.setDateTime(new Date());

		m.addObject("ticketResult", result);
		
		return m;
	}
	
	private Ticket getTicketInfo(String tid) {
		//from ticket number to get ticket status
		//ticket to sessionid/orderid
		//get ticket info (who ? when??)
		if (StringUtils.isNotEmpty(tid) && tid.equals("AA1234567789")){
			Ticket ticket = new Ticket();
			Customer customer = new Customer();
			customer.setName("翁X芳");
			ticket.setCustomer(customer);
			return ticket;
		} else {
			return null;
		}
	}
}
