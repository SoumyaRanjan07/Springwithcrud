package com.tutorial.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.springboot.bean.Soumya_Tutorial;


public interface TutorialDao extends JpaRepository <Soumya_Tutorial,Integer>{

	Soumya_Tutorial getById(long tId);

		 
		
	}


