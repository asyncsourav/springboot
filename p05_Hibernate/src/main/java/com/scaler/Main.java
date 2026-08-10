package com.scaler;

import jakarta.transaction.Synchronization;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Shruti Mandal");
        s1.setMarks(99);
        s1.setSRoll(57);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.scaler.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();

        System.out.println(s1);
    }
}
