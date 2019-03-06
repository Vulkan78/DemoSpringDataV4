package com.objis.spring.test;

import com.objis.spring.demodao.IFormationDao;
import com.objis.spring.demodomaine.Formation;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringDAO extends TestCase {

    private Formation form;
    private IFormationDao springDao;
    private ClassPathXmlApplicationContext appContext;


    @Override
    protected void setUp() throws Exception {
        super.setUp ();
        form = new Formation ( 1, "GTM" );
        appContext = new ClassPathXmlApplicationContext("demo-beans.xml");
        springDao = (IFormationDao) appContext.getBean("IFormationDao");

    }

 /*   @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        form = null;
        appContext = null;
        springDao = null;
    }*/

    public void testSaveFormation() {
        springDao.save(form);
    }

    public void testfindTheme() {
        springDao = (IFormationDao) appContext.getBean("IFormationDao");
        List<Formation> formation = springDao.findByTheme(form.getTheme());
        for (Formation e : formation) {
            System.out.println (e.getTheme());
        }
        assertNotNull(formation);
    }
}

