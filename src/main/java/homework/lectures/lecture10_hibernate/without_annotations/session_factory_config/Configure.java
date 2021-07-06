package homework.lectures.lecture10_hibernate.without_annotations.session_factory_config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Configure {
    private SessionFactory sessionFactory;

    public SessionFactory init(){
        return sessionFactory = new Configuration().configure().buildSessionFactory();
    }

}
