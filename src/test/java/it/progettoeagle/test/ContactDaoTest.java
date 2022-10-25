package it.progettoeagle.test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import it.progettoeagle.dao.ContactDAO;
import it.progettoeagle.dao.ContactDAOImpl;
import it.progettoeagle.model.Contact;

public class ContactDaoTest {
	
	private DriverManagerDataSource dataSource;
	private ContactDAO contactDAO;
	private Contact c;
	
	//creo oggetto datasource per connessione al database 
	@Test
	public void testSave() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/contactdb");
		dataSource.setUsername("postgres");
		dataSource.setPassword("polaroid");
		
		contactDAO= new ContactDAOImpl(dataSource);//passo l'oggetto al costuttore della classe 
		
		Contact contact =new Contact("daniele", "dan@gmail.com","via prova","325487548"); //creo un nuovo contatto
		contactDAO.saveOrUpdate(contact);//chiamo il metodo per fare l'aggiunta 
		assertNotNull(contact);//se il valore è nullo il test fallisce 
	}

	@Test
	public void testGet() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/contactdb");
		dataSource.setUsername("postgres");
		dataSource.setPassword("polaroid");
		contactDAO= new ContactDAOImpl(dataSource);
		Integer id=1;
		Contact contact=contactDAO.get(id);//cerco di prendere un oggetto di tipo contact con lo specificato id 
			if(contact !=null) {
				System.out.println(contact);//se il contatto non è null ritorno il tostring 
			}
			assertNotNull(contact);//il test fallisce
	}
	
	@Test
	public void testDelete() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/contactdb");
		dataSource.setUsername("postgres");
		dataSource.setPassword("polaroid");
		contactDAO= new ContactDAOImpl(dataSource);
		
		Integer id=5;
		
		contactDAO.delete(id);
		assertEquals(contactDAO.get(id),null);
	}
	
	@Test
	public void testList() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/contactdb");
		dataSource.setUsername("postgres");
		dataSource.setPassword("polaroid");
		contactDAO= new ContactDAOImpl(dataSource);
		List<Contact> list =contactDAO.list();
		
			for (Contact contact : list) {
				System.out.println(contact);
			}
			assertTrue(!list.isEmpty());
	}
	
	
	
}
