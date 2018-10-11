package DAO;

import entity.Cinema;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class CinemaDAO {

    public void create (Cinema cinema){
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory ();
        try (Session session = sessionFactory.openSession ()) {
            Transaction transaction = session.beginTransaction ();
            session.persist (cinema);
            transaction.commit ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
