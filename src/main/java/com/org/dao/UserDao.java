package com.org.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;
import com.org.dto.User;

public class UserDao {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasanta");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
		et.begin();
		em.merge();	
		et.commit();
	}
	
	public User fetchUserById(int id) {
	return em.find(User.class,id);
}
	public User fetchUserByEmailAndPassword(String email,String password)
	{
		
		Query query=em.createQuery("select u from user u where u.email=? and password=?");
		
		query.setParameter(1,email);
		query.setParameter(1,password);
		
		List<User> List=query.getResultList();
		
		if(list.IoEmpty());
		return null;
	}
	else
		return list.get(0);

}
