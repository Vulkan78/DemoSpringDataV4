package com.objis.spring.demoservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.objis.spring.demodao.IFormationDao;
import com.objis.spring.demodomaine.Formation;

public class FormationService {

    private IFormationDao dao;

    public IFormationDao getDao() {
        return dao;
    }

    public void setDao(IFormationDao dao) {
        this.dao = dao;
    }

    public void creerformation(Formation formation) {
        dao.create(formation);
    }

    public void initmethod() {
        System.out.println("je suis init");
    }

    public void destroymethod() {
        System.out.println("je suis destroy");
    }
}
