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

        s1.setName("Krishna Anantwar");
        s1.setMarks(83);
        s1.setSRoll(35);

        Student s2 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.scaler.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        s2 = session.find(Student.class, 46);

        Transaction transaction = session.beginTransaction();
        // session.persist(s1);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s2);
    }
}
