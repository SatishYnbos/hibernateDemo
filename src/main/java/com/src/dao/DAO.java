/**
 * 
 */
package com.src.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.src.util.HibernateUtil;

/**
 * This service provide the CRUD operations on Payment Object
 * 
 * @author satish
 *
 */
public class DAO {

	/**
	 * This method saves the given object and returns the Serializable ID
	 * 
	 * @param obj
	 * @return
	 */
	public Serializable save(Object obj) {
		/**
		 * Getting Session instance
		 */
		Session session = HibernateUtil.getSession();
		/**
		 * Begining the transaction from the session
		 */
		Transaction transaction = session.beginTransaction();
		/**
		 * saving the given Object
		 */
		Serializable id = session.save(obj);
		/**
		 * commiting the transaction
		 */
		transaction.commit();

		return id;
	}

	/**
	 * This method updates the given Object and return updated object
	 * 
	 * @param obj
	 * @return
	 */
	public void update(Object obj) {
		/**
		 * Getting Session instance
		 */
		Session session = HibernateUtil.getSession();
		/**
		 * Begining the transaction from the session
		 */
		Transaction transaction = session.beginTransaction();
		/**
		 * updating the given Object
		 */
		session.update(obj);
		/**
		 * commiting the transaction
		 */
		transaction.commit();
	}

	/**
	 * This method finds the Object with the given class, ID
	 * 
	 * @param id
	 * @return
	 */
	public static Object find(Class persistedclass, Serializable id) {
		/**
		 * Getting Session instance
		 */
		Session session = HibernateUtil.getSession();
		/**
		 * Begining the transaction from the session
		 */
		Transaction transaction = session.beginTransaction();

		/**
		 * finding the given Object
		 */
		Object persistedObject = session.get(persistedclass, id);

		/**
		 * commiting the transaction
		 */
		transaction.commit();

		return persistedObject;
	}

	/**
	 * This Method deletes given object and returns the deleted object
	 * 
	 * @param obj
	 * @return
	 */
	public void delete(Object obj) {
		/**
		 * Getting Session instance
		 */
		Session session = HibernateUtil.getSession();
		/**
		 * Begining the transaction from the session
		 */
		Transaction transaction = session.beginTransaction();
		/**
		 * deleting the given Object
		 */
		session.delete(obj);
		/**
		 * commiting the transaction
		 */
		transaction.commit();
	}

}
