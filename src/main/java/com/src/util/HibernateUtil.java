/**
 * 
 */
package com.src.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author satish
 *
 */
public class HibernateUtil {

	public static Session getSession() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}
}
