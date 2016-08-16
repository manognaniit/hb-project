import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		StudentInfo inf=new StudentInfo();
		inf.setName("manogna");
		inf.setCourse("electronics");
		inf.setDepartment("ece");
		session.persist("inf");
		tx.commit();
		session.close();
		System.out.println("DONE");
	

	}

}
