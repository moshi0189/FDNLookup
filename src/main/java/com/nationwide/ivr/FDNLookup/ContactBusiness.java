package com.nationwide.ivr.FDNLookup;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
	
	public List<Contacts> getContactList()
	{
		
		List<Contacts> listContact = new ArrayList<>();
		
		listContact.add(new Contacts("Mary John", "marry.john@gmail.com", "USA"));
		listContact.add(new Contacts("John Smith", "john.smith@gmail.com", "Australia"));
		listContact.add(new Contacts("Maryan Himansu", "marian.himansu@gmail.com", "India"));
		listContact.add(new Contacts("Rahman Moshiur", "rahman.moshiur@gmail.com", "World"));
		
		return listContact;
		
	}

}
