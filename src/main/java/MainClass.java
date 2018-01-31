import entities.Address;
import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Student student=new Student("ram","Pokhara");

        Address address=new Address("Pokhara","Srijanachowk");
        address.setStudent(student);

        session.save(address);

        session.getTransaction().commit();
        session.close();




    }
}
