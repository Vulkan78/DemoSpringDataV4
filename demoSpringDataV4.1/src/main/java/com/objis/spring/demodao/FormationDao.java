package com.objis.spring.demodao;
import com.objis.spring.demodomaine.Formation;
import java.util.List;

/**
 * Created by jimmy on 06/03/2019.
 */
public class FormationDao implements IFormationDao {

    @Override
    public void create(Formation formation) {
        System.out.println("créer formation" + formation.toString());
    }

    @Override
    public List<Formation> findByTheme(String theme) {
        return null;
    }

}
