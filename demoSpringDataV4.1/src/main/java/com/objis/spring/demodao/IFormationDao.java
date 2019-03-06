package com.objis.spring.demodao;

import com.objis.spring.demodomaine.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFormationDao extends JpaRepository <Formation, Integer>{

	public List<Formation> findByTheme(String theme);

	void create(Formation formation);

}