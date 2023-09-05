import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(CustomerDetail.class)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Warehouse.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

//         == CREATE NEW DATE #1 ==
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item item = new Item("Telephone", 1000);
//        System.out.println(item);
//        session.save(item);
//        session.getTransaction().commit();

//         == CREATE NEW DATA #2 ==
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item item = new Item();
//        item.setPrice(25000);
//        item.setTitle("Laptop");
//        System.out.println(item);
//        session.save(item);
//        session.getTransaction().commit();

//             == READ DATA ==
//          session = sessionFactory.getCurrentSession();
//          session.beginTransaction();
//          Item itemData = session.get(Item.class,1);
//          System.out.println(itemData);
//          session.beginTransaction().commit();

//                == READ DATA BY Query ==
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Item item = session.createQuery("SELECT i FROM Item i WHERE i.id = :id", Item.class)
//                    .setParameter("id", 1).getSingleResult();
//            System.out.println(item);
//            session.getTransaction().commit();

//                == READ TABLE BY Query ==
//              session = sessionFactory.getCurrentSession();
//              session.beginTransaction();
//              List<Item> items = session.createQuery("SELECT i FROM Item i", Item.class).getResultList();
//              System.out.println(items);
//              session.getTransaction().commit();

//            == UPDATE DATA ==
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Item itemData = session.get(Item.class, 1);
//            itemData.setPrice(40000);
//            System.out.println(itemData);
//            session.beginTransaction().commit();

//               == DELETE DATA ==
//              session = sessionFactory.getCurrentSession();
//              session.beginTransaction();
//              Item itemDeleted = session.get(Item.class, 4);
//              session.remove(itemDeleted);
//              session.getTransaction().commit();

//                == JOIN OneToOne ==
//                session = sessionFactory.getCurrentSession();
//                session.beginTransaction();
//                Customer customer = session.get(Customer.class, 1);
//                System.out.println(customer.getName() + customer.getDetails());
//                session.getTransaction().commit();


//                session = sessionFactory.getCurrentSession();
//                session.beginTransaction();
//                Warehouse warehouse = session.get(Warehouse.class, 1);
//                System.out.println(warehouse);
//                session.getTransaction().commit();

                  session = sessionFactory.getCurrentSession();
                  session.beginTransaction();
                   Item item = session.get(Item.class,1);
                  System.out.println(item);

                  for (Warehouse i : item.getWarehouse())
                  {
                      System.out.println(i.getWarehouseName());
                  }

                  session.getTransaction().commit();

        sessionFactory.close();
    }
}