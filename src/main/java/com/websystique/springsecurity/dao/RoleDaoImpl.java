package com.websystique.springsecurity.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springsecurity.model.Role;

@Repository("roleDao")
@Transactional
public class RoleDaoImpl extends AbstractDao<Integer, Role> implements RoleDao {

	public Role findById(int id) {
		return getByKey(id);
	}

	public Role findByRole(String roleType) {
		System.out.println("role: "+ roleType);
		try{
			Role role = (Role) getEntityManager()
					.createQuery("SELECT p FROM roles p WHERE p.role LIKE :role")
					.setParameter("role", roleType)
					.getSingleResult();
			return role; 
		}catch(NoResultException ex){
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Role> findAll(){
		List<Role> role = getEntityManager()
				.createQuery("SELECT r FROM roles r  ORDER BY r.role ASC")
				.getResultList();
		return role;
	}

}
