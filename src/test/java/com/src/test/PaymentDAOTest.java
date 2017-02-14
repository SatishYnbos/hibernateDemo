/**
 * 
 */
package com.src.test;

import java.io.Serializable;

import com.src.dao.DAO;
import com.src.dao.PaymentDAO;
import com.src.model.Payment;

import junit.framework.TestCase;

/**
 * @author satish
 *
 */
public class PaymentDAOTest extends TestCase {

	private static final PaymentDAO paymentDao = new PaymentDAO();

	public void testCreatePaymentDetails() {
		Payment creditCard = Payment.get(3, "credit", 1600);
		Serializable id = paymentDao.save(creditCard);
		assertEquals(id, 3);
	}

	public void tstupdatePaymentType() {
		Payment payment = (Payment) DAO.find(Payment.class, 3);
		payment.setType("debit");
		paymentDao.update(payment);
		assertEquals(payment.getType(), "debit");
	}

	public void testDeletePaymentDetails() {
		Payment payment = (Payment) DAO.find(Payment.class, 3);
		paymentDao.delete(payment);
		assertNull((Payment) DAO.find(Payment.class, 3));
	}
}
