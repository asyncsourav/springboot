

/*

// ----------------------------------- UPDATE DATA ------------------------------------- //
// This is complete code to update or create if no such row exist

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
        s1.setMarks(87);
        s1.setSRoll(35);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.scaler.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.merge(s1);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);
    }
}
*/



// --------------------------------------------- DELETE DATA --------------------------------------- //


/*
package com.scaler;

import jakarta.transaction.Synchronization;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;


public class Main {
    public static void main(String[] args) {

        Student s1 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.scaler.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        // here we are first trying to find out the Student row from db by help of find() method and then delete it
        s1 = session.find(Student.class, 35);

        Transaction transaction = session.beginTransaction();
        session.remove(s1);
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);
    }
}

*/


// ------------------------------------ CHANGING TABLE AND COLUMN NAME ------------------------------------ //


package com.scaler;

import jakarta.transaction.Synchronization;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;


public class Main {
    public static void main(String[] args) {

        Alien a1 = new Alien();

        a1.setAid(101);
        a1.setAname("Sourav Kumar");
        a1.setTech("Java");

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.scaler.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        transaction.commit();

        session.close();
        sf.close();

    }
}
