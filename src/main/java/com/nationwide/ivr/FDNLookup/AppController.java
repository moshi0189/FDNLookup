package com.nationwide.ivr.FDNLookup;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/test")
	public String test() {

		System.out.println("AppController->test");
		return "test";
	}

	@RequestMapping("/list_contact")
	public String listContacts(Model model) {

		ContactBusiness business = new ContactBusiness();
		List<Contacts> contactList = business.getContactList();
		
		model.addAttribute("contacts", contactList);
		return "contact";
	}

}
