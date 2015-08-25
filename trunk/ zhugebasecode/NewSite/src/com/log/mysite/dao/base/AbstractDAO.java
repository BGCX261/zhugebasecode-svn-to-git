package com.log.mysite.dao.base;

import hibernate.HibernateSessionFactory;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.log.mysite.base.Page;
import com.log.mysite.exceptions.DatabaseException;
import com.log.mysite.exceptions.SiteException;

import com.log.mysite.pojo.Entity;

/**
 * @ author 诸葛晓寅 Oct 11, 2008 7:30:10 PM @ Description: @ version 1.0 @ 著作权所有，侵权必究
 */
public abstract class AbstractDAO {

	private static Logger logger = Logger.getLogger(AbstractDAO.class);

	/**
	 * 通过属性来查找对象
	 * 
	 * @param entity
	 * @param propertyName
	 * @param value
	 * @return List;
	 */
	public static List findByProperty(Object entity, String propertyName,
			Object value) {
		logger.debug("finding " + entity + " instance with property: "
				+ propertyName + ", value: " + value);
		List list = null;
		Session session = null;
		try {
			String hql = "from " + entity + " as e where e." + propertyName
					+ "=?";
			session = getSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, value);
			return query.list();
		} catch (Exception e) {
			logger.error("find by property name failed", e);
			e.printStackTrace();
			list = null;
		} finally {
			closeSession();
		}
		return list;
	}

	/**
	 * 保存一个对象
	 * 
	 * @param entity
	 * @return
	 */
	public boolean save(Entity entity) {

		boolean flag = false;
		Session session = null;
		Transaction tr = null;
		try {
			session = getSession();
			tr = session.beginTransaction();
			session.flush();
			session.save(entity);
			flag = true;
			tr.commit();

		} catch (HibernateException e) {
			logger
					.error("com.log.mysite.dao.AbstractDAO.save(Entity) occur an error!");
			if (tr != null) {
				tr.rollback();
			}
			flag = false;
			e.printStackTrace();
			throw new DatabaseException(e);

		} finally {
			closeSession();
		}
		return flag;
	}

	/**
	 * 实体类对象更新,返回是否成!
	 * 
	 * @param entity
	 * @return boolean
	 */
	public static boolean update(Object entity) {
		boolean flag = false;
		Session session = null;
		Transaction tr = null;
		try {
			session = getSession();
			tr = session.beginTransaction();
			session.flush();
			session.update(entity);
			tr.commit();
			flag = true;
		} catch (HibernateException e) {
			logger.error("AbstractDAO.update(entity) occur an error!");
			if (tr != null) {
				tr.rollback();
			}
			flag = false;
			e.printStackTrace();
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return flag;
	}

	/**
	 * 根据语句来更新用户数据,返回是否成功
	 * 
	 * @param hql
	 * @return
	 */
	public static boolean updateByHql(String hql) {
		boolean flag = false;
		Session session = null;
		Transaction tr = null;

		try {
			session = getSession();
			tr = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.executeUpdate();
			tr.commit();
			flag = true;
		} catch (HibernateException e) {
			logger.error("AbstractDAO.updateByHql(entity) occur an error!");
			flag = false;
			if (tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return flag;
	}

	public static boolean delEntityByCondition(String hql) {
		boolean flag = false;
		Session session = null;
		Transaction tr = null;
		try {
			session = getSession();
			tr = session.beginTransaction();
			session.flush();
			session.delete(hql);
			tr.commit();
			flag = true;
		} catch (HibernateException e) {
			e.printStackTrace();
			logger.error("AbstractDAO.delete(entity) occur an error");
			if (tr != null) {
				tr.rollback();
			}
			flag = false;
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return flag;
	}

	/**
	 * 删除一个实体类对象,返回是否成功!
	 * 
	 * @param entity
	 * @return
	 */
	public static boolean delete(Object entity) {
		boolean flag = false;
		Session session = null;
		Transaction tr = null;
		try {
			session = getSession();
			tr = session.beginTransaction();
			session.flush();
			session.delete(entity);
			tr.commit();
			flag = true;
		} catch (HibernateException e) {
			e.printStackTrace();
			logger.error("AbstractDAO.delete(entity) occur an error");
			if (tr != null) {
				tr.rollback();
			}
			flag = false;
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return flag;
	}

	/**
	 * 根据实体和查询对象,返回列表
	 * 
	 * @param entity
	 *            实体
	 * @param condition
	 *            查询条件
	 * @return
	 */
	public static List getByCondition(String entity, String condition) {
		List list = null;
		Session session = null;
		if ("".equals(condition)) {
			condition = "";
		}
		try {
			session = getSession();
			String hql = "from " + entity + " e " + condition;
			Query query = session.createQuery(hql);
			list = query.list();
		} catch (HibernateException e) {
			list = null;
			e.printStackTrace();
			logger.error("AbstractDAO.getBycondition(" + entity
					+ ") occur an error");

			throw new DatabaseException(e);
		} finally {
			closeSession();
		}

		return list;
	}

	/**
	 * 根据语句,返回列表
	 * 
	 * @param hql
	 *            查询条件
	 * @return
	 */
	public static List getByCondition(String hql) {
		List list = null;
		Session session = null;
		if ("".equals(hql)) {
			return null;
		}
		try {
			session = getSession();
			Query query = session.createQuery(hql);
			list = query.list();

		} catch (HibernateException e) {
			list = null;
			e.printStackTrace();
			logger.error("AbstractDAO.getBycondition(" + hql
					+ ") occur an error");
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}

		return list;
	}

	/**
	 * 通过一个查询条件,返回一个对象
	 * 
	 * @param hql
	 *            查询条件
	 * @return
	 */
	public static Object getOneByCondition(String hql) {
		Object object = null;
		Session session = null;
		try {
			session = getSession();
			Query query = session.createQuery(hql);
			object = query.setMaxResults(1).uniqueResult();
		} catch (HibernateException e) {
			object = null;
			e.printStackTrace();
			logger.error("AbstractDAO.getOneByCondition(" + hql
					+ ") occur as error");
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return object;
	}

	/***************************************************************************
	 * 根据条件查询记录数
	 * 
	 * @param entity
	 * @param condition
	 * @return
	 */
	public static long getCountByCondition(String entity, String condition) {
		long count = new Long(0);
		Session session = null;
		try {
			session = getSession();
			String hql = "select count(*) from " + entity + " e " + condition;
			Query query = session.createQuery(hql);
			count = (Long.parseLong(query.list().get(0).toString()));

		} catch (RuntimeException e) {
			count = -1l;
			logger.error("AbstractDAO.getCountByCondition(" + entity
					+ ") occur as error");
			e.printStackTrace();
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return count;
	}

	/***************************************************************************
	 * 根据条件查询记录数
	 * 
	 * @param condition
	 * @return
	 */
	public static long getCountByCondition(String condition) {
		long count = new Long(0);
		Session session = null;
		try {
			session = getSession();
			String hql = "select count(*) from " + condition;
			Query query = session.createQuery(hql);
			count = (Long.parseLong(query.list().get(0).toString()));
		} catch (RuntimeException e) {
			count = -1l;
			logger.error("AbstractDAO.getCountByCondition(" + condition
					+ ") occur as error");
			e.printStackTrace();
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return count;
	}

	/**
	 * 对一hql语句执行查询返回 List 分页
	 * 
	 * @param hql
	 * @param page
	 * @return List
	 */
	public static List getPageByHql(String hql, Page page) {
		List list = null;
		if (page == null) {
			new SiteException("Page 为空");
		}
		Session session = null;
		try {
			session = getSession();
			list = session.createQuery(hql).setFirstResult(
					page.getFirstResult()).setMaxResults(page.getPageSize())
					.list();

		} catch (Exception e) {
			list = null;
			e.printStackTrace();
			logger.error("AbstractDAO.getPageByHql(" + hql + "," + page
					+ ") occur as error");
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return list;
	}

	/**
	 * 对一hql语句执行查询返回 List 分页
	 * 
	 * @param hql
	 * @param pageSize
	 * @param currentPage
	 * @return List;
	 */
	public static List getPageByHql(String hql, int pageSize, int currentPage) {
		if (currentPage < 1) {
			currentPage = 1;
		}
		List list = null;
		Session session = null;
		try {
			session = getSession();
			list = session.createQuery(hql).setFirstResult(
					(currentPage - 1) * pageSize).setMaxResults(pageSize)
					.list();
		} catch (Exception e) {
			list = null;
			logger.error("AbstractDAO.getPageByHql(" + hql + "," + pageSize
					+ "," + currentPage + ") occur as error");
			throw new DatabaseException(e);
		} finally {
			closeSession();
		}
		return list;
	}

	public static Session getSession() {
		return HibernateSessionFactory.getSession();
	}

	public static void closeSession() {
		HibernateSessionFactory.closeSession();
	}

}
