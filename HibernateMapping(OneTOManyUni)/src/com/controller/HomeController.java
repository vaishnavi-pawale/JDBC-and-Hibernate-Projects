package com.controller;

import com.Service.ServiceIMPL;

public class HomeController {

	public static void main(String[] args) {
		
		ServiceIMPL s = new ServiceIMPL();
		
		s.registerStudentWithSubject();
		
	}
	
}
