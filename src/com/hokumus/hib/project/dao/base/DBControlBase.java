package com.hokumus.hib.project.dao.base;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hokumus.hib.project.util.myHbUtil;

public class DBControlBase<T> implements IDBService<T> {

	private Session session;
	private Transaction transaction;

	private void getSessionAndTrans() {
		session = (Session) myHbUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
	}

	private void closeSesionAndCommit() {
		transaction.commit();
		session.close();
	}
	private void closeSesionAndRoolback() {
		transaction.rollback();
		session.close();
	}

	@Override
	public Boolean kaydet(T temp) {
		try {
			getSessionAndTrans();
			session.save(temp);
			closeSesionAndCommit();
		} catch (Exception e) {
			// log al
			closeSesionAndRoolback();
			e.printStackTrace();
			
			return false;
		}

		return true;
	}

	@Override
	public Boolean guncelle(T temp) {
		try {
			getSessionAndTrans();
			session.update(temp);
			closeSesionAndCommit();
		} catch (Exception e) {
			// log al
			closeSesionAndRoolback();
			e.printStackTrace();
			
			return false;
		}

		return true;
	}

	@Override
	public Boolean sil(T temp) {
		try {
			getSessionAndTrans();
			session.delete(temp);
			closeSesionAndCommit();
		} catch (Exception e) {
			// log al
			closeSesionAndRoolback();
			e.printStackTrace();
			
			return false;
		}

		return true;
	}

	@Override
	public List<T> getir(T temp) {
		// TODO Auto-generated method stub
		return null;
	}

}
