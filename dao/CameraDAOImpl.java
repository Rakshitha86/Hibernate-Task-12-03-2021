package com.xworkz.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.dto.CameraDTO;
import com.xworkz.sessionfactory.SingleSessionFactory;

public class CameraDAOImpl implements CameraDAO {

	@Override
	public void saveCamera(CameraDTO cameraDTO) {
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(cameraDTO);
			System.out.println(cameraDTO);
//			session.getTransaction().commit();
			transaction.commit();
			System.out.println("Camera DTO is saved");
		} catch (IllegalArgumentException e) {
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("Session is closed");
				} else {
					System.out.println("Session not closed");
				}
//				SingleSessionFactory.closeFactory();
			} catch (HibernateException e2) {
			}

		}

	}

	@Override
	public void readCamera(int cameraId) {
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			CameraDTO cameraDTO = session.get( CameraDTO.class, cameraId);
			System.out.println(cameraDTO);
			System.out.println("Camera DTO is read");
		} catch (IllegalArgumentException e) {
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("Session is closed");
				} else {
					System.out.println("Session not closed");
				}
//				SingleSessionFactory.closeFactory();
			} catch (HibernateException e2) {
			}

		}
	}

	@Override
	public void updateCamera(int cameraId) {
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			CameraDTO cameraDTO = session.get( CameraDTO.class, cameraId);
			cameraDTO.setBrand("Philipse");
			System.out.println(cameraDTO);
			Transaction transaction = session.beginTransaction();
			session.update(cameraDTO);
			transaction.commit();
			System.out.println("Camera DTO is updated");
		} catch (IllegalArgumentException e) {
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("Session is closed");
				} else {
					System.out.println("Session not closed");
				}
//				SingleSessionFactory.closeFactory();
			} catch (HibernateException e2) {
			}

		}
	}

	@Override
	public void deleteCamera(int cameraId) {
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			CameraDTO cameraDTO = session.get( CameraDTO.class, cameraId);
			System.out.println(cameraDTO);
			Transaction transaction = session.beginTransaction();
			session.delete(cameraDTO);
			transaction.commit();
			System.out.println("Camera DTO is deleted");
		} catch (IllegalArgumentException e) {
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("Session is closed");
				} else {
					System.out.println("Session not closed");
				}
				SingleSessionFactory.closeFactory();
			} catch (HibernateException e2) {
			}

		}
	}

}
