

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

        System.out.print(s1);
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

        Alien a1 = new Alien();

        l1.setBrand("Asus");
        l1.setModel("ExpertBook p1");
        l1.setRam(16);

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
*/


// --------------------------------------- ONE TO MANY AND MANY TO ONE ------------------------------------- //


/*
package com.scaler;

import jakarta.transaction.Synchronization;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Alien a1 = new Alien();

        System.out.println("laptop input");
        System.out.print("id of laptop: ");
        l1.setLid(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Brand name: ");
        l1.setBrand(scanner.nextLine());

        System.out.print("Model name: ");
        l1.setModel(scanner.nextLine());

        System.out.print("Ram Value: ");
        l1.setRam(scanner.nextInt());


        System.out.println("2nd laptop input");
        System.out.print("id of laptop: ");
        l2.setLid(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Brand name: ");
        l2.setBrand(scanner.nextLine());

        System.out.print("Model name: ");
        l2.setModel(scanner.nextLine());

        System.out.print("Ram Value: ");
        l2.setRam(scanner.nextInt());


        System.out.println("Alien input");
        System.out.print("id of Alien: ");
        a1.setAid(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Alien name: ");
        a1.setAname(scanner.nextLine());

        System.out.print("Alien skills: ");
        a1.setTech(scanner.nextLine());



        a1.setLaptops(Arrays.asList(l1, l2));
        l1.setAlien(a1);
        l2.setAlien(a1);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.scaler.Alien.class)
                .addAnnotatedClass(com.scaler.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();


        // making transaction to db
        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(a1);
        session.persist(l2);
        transaction.commit();


        // let us also print the value from db if it is stored or not
        Alien a2 = session.find(Alien.class, a1.getAid());
        System.out.println(a2);


        session.close();
        sf.close();

    }
}
*/


// ------------------------------------- MANY TO MANY ------------------------------------- //



package com.scaler;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Alien a1 = new Alien();

        System.out.println("laptop input");
        System.out.print("id of laptop: ");
        l1.setLid(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Brand name: ");
        l1.setBrand(scanner.nextLine());

        System.out.print("Model name: ");
        l1.setModel(scanner.nextLine());

        System.out.print("Ram Value: ");
        l1.setRam(scanner.nextInt());


        System.out.println("2nd laptop input");
        System.out.print("id of laptop: ");
        l2.setLid(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Brand name: ");
        l2.setBrand(scanner.nextLine());

        System.out.print("Model name: ");
        l2.setModel(scanner.nextLine());

        System.out.print("Ram Value: ");
        l2.setRam(scanner.nextInt());


        System.out.println("Alien input");
        System.out.print("id of Alien: ");
        a1.setAid(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Alien name: ");
        a1.setAname(scanner.nextLine());

        System.out.print("Alien skills: ");
        a1.setTech(scanner.nextLine());



        a1.setLaptops(Arrays.asList(l1, l2));
        l1.setAlien(a1);
        l2.setAlien(a1);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.scaler.Alien.class)
                .addAnnotatedClass(com.scaler.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();


        // making transaction to db
        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(a1);
        session.persist(l2);
        transaction.commit();


        // let us also print the value from db if it is stored or not
        Alien a2 = session.find(Alien.class, a1.getAid());
        System.out.println(a2);


        session.close();
        sf.close();

    }
}