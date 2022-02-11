package repository;

import entity.Driver;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;

public class DriverDao {

    Logger logger = Logger.getLogger(StudentDao.class);

    public List<Driver> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Driver").list();
        } catch (HibernateException e) {
            e.printStackTrace();
            logger.error(e);
        }
        return null;
    }

    public Driver findById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Driver> query = session.createQuery("select s from Driver s where s.id = :p_driver_id");
            query.setParameter("p_driver_id", id);
            return query.getSingleResult();
        } catch (HibernateException e) {
            e.printStackTrace();
            logger.error(e);
        }
        return null;
    }

    public boolean insert(Driver student) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            logger.error(e);
        }
        return false;
    }

    public boolean removeDriver(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Driver student = session.load(Driver.class, id);
            session.delete(student);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            logger.error(e);
        } finally {
            session.close();
        }
        return false;
    }

}

