//package service;
//
//import entities.Student;
//import org.hibernate.QueryException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
//public class StudentService {
//    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//    Session session = sessionFactory.openSession();
//
//
//
//    public void saveStudent(Student student){
//        session.beginTransaction();
//        session.save(student);
//        session.getTransaction().commit();
//        session.close();
//
//    }
//
//    public void getAllData(){
//        session.beginTransaction();
//        Query query=session.createQuery("FROM Student");
//        List<Student> listOfStudent=query.list();
//        for(Student student1: listOfStudent){
//            System.out.println("ID : "+student1.getId());
//            System.out.println("NAme  : "+student1.getName());
//            System.out.println("Address : "+student1.getAddress());
//        }
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    public void getStudentById(Integer id){
//
//        session.beginTransaction();
//
//        Student student=(Student) session.get(Student.class, id);
//        System.out.println("ID : "+student.getId());
//        System.out.println("NAme  : "+student.getName());
//        System.out.println("Address : "+student.getAddress());
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    public void updateStudentById(Integer id){
//        session.beginTransaction();
//        Student student=(Student) session.get(Student.class, id);
//        student.setName("Ram HAri");
//        session.save(student);
//        session.getTransaction().commit();
//        session.close();
//
//    }
//
//}
