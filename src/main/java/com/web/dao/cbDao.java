package com.web.dao;

import java.io.Serializable;
import java.util.List;


import com.web.model.camBien;

public interface cbDao {

	camBien getCB(int id);
    void deleteCB(camBien CB);
    Serializable saveCB(camBien CB);
    void updateCB(camBien CB);
    List<camBien> findAllCBs();
  
}
