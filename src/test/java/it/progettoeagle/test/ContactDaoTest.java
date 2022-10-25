package it.progettoeagle.test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import it.progettoeagle.dao.ContactDAO;
import it.progettoeagle.dao.ContactDAOImpl;
import it.progettoeagle.model.Contact;

public class ContactDaoTest {
	
	private static DriverManagerDataSource dataSource;
	private ContactDAO contactDAO;

	
	//creo oggetto datasource per connessione al database 
	@BeforeClass
	public static void dataSourceCon() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/contactdb");
		dataSource.setUsername("postgres");
		dataSource.setPassword("polaroid");	
	}
	@Test
	public void testSave() {
		contactDAO= new ContactDAOImpl(dataSource);
		//passo l'oggetto al costuttore della classe 
		//creo un nuovo contatto
		Contact contact =new Contact("daniele", "dan@gmail.com","via prova","325487548"); 
		//chiamo il metodo per fare l'aggiunta 
		contactDAO.saveOrUpdate(contact);
		//se il valore è nullo il test fallisce 
		assertNotNull(contact);
	}
	@Test
	public void testGet() {
		contactDAO= new ContactDAOImpl(dataSource);
		Integer id=1; 
		Contact contact=contactDAO.get(id);
			if(contact !=null) {
				System.out.println(contact);
			}
			assertNotNull(contact);
	}
	@Test
	public void testDelete() {
		contactDAO= new ContactDAOImpl(dataSource);
		Integer id=5;
		contactDAO.delete(id);
		assertEquals(contactDAO.get(id),null);
	}
	@Test
	public void testList() {
		contactDAO= new ContactDAOImpl(dataSource);
		List<Contact> list =contactDAO.list();
			for (Contact contact : list) {
				System.out.println(contact);
			}
			assertTrue(!list.isEmpty());
	}
}
