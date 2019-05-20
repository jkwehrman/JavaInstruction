package ui;
// p 307
import java.util.ArrayList;
import java.util.List;

import business.Contact;

public class LambdaDemoApp {

	public static void main(String[] args) {
List<Contact> contacts = new ArrayList<>();

System.out.println("Hello");
contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
contacts.add(new Contact("Anne Boehm", null, null));
contacts.add(new Contact("Joel Murach", "joes@murach.com", null));


	
	//which contacts have no email address? - no Lambda
	List<Contact> contactsWithoutEmail = new ArrayList<>();
	for (Contact c: contacts) {
		//does this contact match the criteria?
		if (c.getEmail()==null) {
		contactsWithoutEmail.add(c);
		System.out.println("Contacts with no email:  ");
		for (Contact c: contactsWithoutEmail) {
		System.out.println(c);
}
		}
		}
	// contacts with no phone - no Lambda
	List<Contact> contactsWithoutPhone = new ArrayList<>();
	for (Contact c: contacts) {
		//does this contact match the criteria?
		if (c.getPhone()==null) {
		contactsWithoutPhone.add(c);
	
	System.out.println("Contacts with no phone:  ");
			for (Contact c: contactsWithoutPhone) {
			System.out.println(c);
	}
				}
		System.out.println("Lambdas");
		System.out.println("Contacts w /no phone");
		contactsWithoutPhone = filterContacts(contacts, c-> c.getPhone()==null); //can infer
				}
			
private List<Ccontact> filterContacts(List<Contact> contacts,
		TestsContact condition) {
	List<Contact> filteredContacts = new ArrayList<>();
	for (Contact c: contacts)
		if (condition.test(c)) {
			filteredContacts.add(c);
		}
		}
	
return filteredContacts.add(c);

System.out.println("Lambdas");
System.out.println("Contacts w /no email");
contactsWithoutPhone = filterContacts(contacts, c-> c.getEmail()==null); //can infer
		}
	
private List<Ccontact> filterContacts(List<Contact> contacts,
TestsContact condition) {
List<Contact> filteredContacts = new ArrayList<>();
for (Contact c: contacts)
if (condition.test(c)) {
	filteredContacts.add(c);
}
}

return filteredContacts.add(c);
		
	}
	System.out.println("Bye");
}		
	
}

