package com.objis.spring.test;

import com.objis.spring.demodao.IFormationDao;
import com.objis.spring.demodomaine.Formation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringDAO {

    private Formation form;
    private IFormationDao springDao;
    private ClassPathXmlApplicationContext appContext;


    @Before
    public void setUp() throws Exception {
        form = new Formation(1, "GTM");
        appContext = new ClassPathXmlApplicationContext("demo-beans.xml");
        springDao = (IFormationDao) appContext.getBean("IFormationDao");

    }

    @Test
    public void saveFormation() {
        Formation result = springDao.save(form);

        System.out.println("Formation ajoutée en base : " + result.toString());
    }


    @Test
    public void testListFormation() {
        springDao = (IFormationDao) appContext.getBean("IFormationDao");
        List<Formation> formation = springDao.findByTheme(form.getTheme());
        for (Formation e : formation) {
            System.out.println(e.getTheme());
        }
        Assert.assertNotNull(formation);
    }
}

