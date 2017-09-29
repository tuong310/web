package com.web.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.web.dao.cbDao;
import com.web.dto.cbmanufacture;
import com.web.model.camBien;

@Service("cbService")
@Transactional
public class cbServiceImpl implements cbService {

	 @Autowired
	 cbDao cbdao;
	 
	 public camBien convert(cbmanufacture cbmanufacture){
		 
		 camBien cb = new camBien();
		 cb.setId(cbmanufacture.getId());
		 cb.setDieuKhien(cbmanufacture.getDieuKhien());
		 cb.setDoAm(cbmanufacture.getDoAm());
		 cb.setNhietDo(cbmanufacture.getNhietDo());
		 return cb;
	 }
    public cbmanufacture convert(camBien cb){
		 
		 cbmanufacture cbm = new cbmanufacture();
		 cbm.setId(cb.getId());
		 cbm.setDieuKhien(cb.getDieuKhien());
		 cbm.setDoAm(cb.getDoAm());
		 cbm.setNhietDo(cb.getNhietDo());
		 return cbm;
	 }
	@Override
	public cbmanufacture getCB(int id) {
		camBien cb = cbdao.getCB(id);
		cbmanufacture cbm = convert(cb);
		return cbm;
	}

	@Override
	public void deleteCB(cbmanufacture cbm) {
		camBien cb = convert(cbm);
		cbdao.deleteCB(cb);
		
	}

	@Override
	public Serializable saveCB(cbmanufacture cbm) {
		camBien cb = convert(cbm);
		return cbdao.saveCB(cb);
	}

	@Override
	public void updateCB(cbmanufacture cbm) {
		camBien cb = convert(cbm);
		cbdao.updateCB(cb);
		
	}

	@Override
	public List<cbmanufacture> findAllCBs() {
		List<cbmanufacture> cbms = new ArrayList<cbmanufacture>();
		List<camBien> cbs = cbdao.findAllCBs();
		if(!CollectionUtils.isEmpty(cbs)){
			for(camBien cb : cbs){
				cbms.add(convert(cb));}}
		return cbms;
	}

}
