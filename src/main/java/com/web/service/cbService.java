package com.web.service;

import java.io.Serializable;
import java.util.List;

import com.web.dto.cbmanufacture;

public interface cbService {
	cbmanufacture getCB(int id);
    void deleteCB(cbmanufacture CB);
    Serializable saveCB(cbmanufacture CB);
    void updateCB(cbmanufacture CB);
    List<cbmanufacture> findAllCBs();
}
