import entities.Address;
import entities.Project;
import entities.Student;
import entities.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Student student=new Student("Shyam","Kathmandu");
        Student student1=new Student("Hari","pokhara");

        Project project=new Project(1,"Online Examination");
        Project project1=new Project(2,"Online New Portal");

        student.getProjects().add(project);
        student.getProjects().add(project1);

        student1.getProjects().add(project);
        student1.getProjects().add(project1);

        session.save(project);
        session.save(project1);

        session.save(student);
        session.save(student1);


        session.getTransaction().commit();
        session.close();




    }
}
