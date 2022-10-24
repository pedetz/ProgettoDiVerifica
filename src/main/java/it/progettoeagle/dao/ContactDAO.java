package it.progettoeagle.dao;

import java.util.List;

import it.progettoeagle.model.Contact;


public interface ContactDAO {
	
	public void saveOrUpdate(Contact contact);
	
	public void delete(int contactId);
	
	public Contact get(int contactId);
	
	public List<Contact> list();
}
