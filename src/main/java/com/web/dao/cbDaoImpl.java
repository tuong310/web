package com.web.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.web.model.camBien;

@Repository
public class cbDaoImpl extends AbstractDao implements cbDao {

	@Override
	public camBien getCB(int id) {
		
		return (camBien) getSession().get(camBien.class, id);
	}

	@Override
	public void deleteCB(camBien CB) {
		getSession().delete(CB);
		
	}

	@Override
	public Serializable saveCB(camBien CB) {
		// TODO Auto-generated method stub
		return getSession().save(CB);
	}

	@Override
	public void updateCB(camBien CB) {
		getSession().update(CB);
		
	}

	@Override
	public List<camBien> findAllCBs() {
		CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();
		CriteriaQuery<camBien> criteriaQuery = criteriaBuilder.createQuery(camBien.class);
		Root<camBien> root = criteriaQuery.from(camBien.class);
		criteriaQuery.select(root);
		Query<camBien> query = getSession().createQuery(criteriaQuery);
		List<camBien> camBiens = query.getResultList();	
		return camBiens;
	}

}
