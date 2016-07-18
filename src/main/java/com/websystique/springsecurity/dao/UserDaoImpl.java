package com.websystique.springsecurity.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springsecurity.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{

	public User findById(int id) {
		User user = getByKey(id);
		if(user!=null){
			initializeCollection(user.getRoles());
		}
		return user;
	}
	
	public User findByUsername(String username) {
		return new User();
	}

	
	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		List<User> users = getEntityManager()
				.createQuery("SELECT u FROM users u ORDER BY u.username ASC")
				.getResultList();
		return users;
	}

	public void save(User user) {
		persist(user);
	}

	public void deleteById(int id) {
		User user = (User) getEntityManager()
				.createQuery("SELECT u FROM users u WHERE u.id LIKE :id")
				.setParameter("id", id)
				.getSingleResult();
		delete(user);
	}
	
	//An alternative to Hibernate.initialize()
	protected void initializeCollection(Collection<?> collection) {
	    if(collection == null) {
	        return;
	    }
	    collection.iterator().hasNext();
	}

}
