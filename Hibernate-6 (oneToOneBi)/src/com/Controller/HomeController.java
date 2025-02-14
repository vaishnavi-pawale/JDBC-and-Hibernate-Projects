package com.Controller;

import com.Service.Service;
import com.Service.ServiceIMPL;

public class HomeController {

	public static void main(String[] args) {

		Service s = new ServiceIMPL();

//		s.registerPersonWithAdhar();

//		s.displayPersonDetailsOnly();

//		s.updatePersonDetailsOnly();

//		s.deletePersonOnly();

		s.displayPersonDetailsUsingAID();

//		s.updatePersonDetailsOnlyUsingAID();
		
//		s.deletePersonOnlyUsingAID();

	}
}
