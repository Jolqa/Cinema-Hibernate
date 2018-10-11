package DAO;

import entity.Movie;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class MovieDAO {

    public void create(Movie movie) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory ();
        try (Session session = sessionFactory.openSession ()) {
            Transaction transaction = session.beginTransaction ();
            session.persist (movie);
            transaction.commit ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
