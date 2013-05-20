package com.blog.cavalr.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ResumeDao {

    private SessionFactory sessionFactory;

    public ResumeDao() {
        sessionFactory = HibernateHelper.sessionFactory();
    }

    public void saveResume(Resume resume) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(resume);
        transaction.commit();

    }

    public Resume findById(Long resumeId) {
        return (Resume) sessionFactory.openSession().get(Resume.class, resumeId);
    }

    public void deleteResume(Resume resume) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(resume);
        transaction.commit();
    }
}
