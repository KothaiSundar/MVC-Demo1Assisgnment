package mvc_demo1Assignment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import mvc_demo1Assignment.dto.Employee;


@Component
public class EmployeeDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("sigma");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void saveEmployee(Employee employee)
	{
		et.begin();
		em.persist(employee);
		et.commit();
	}
	
}
