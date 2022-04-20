package com.tutorial.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.springboot.bean.Soumya_Tutorial;
import com.tutorial.springboot.dao.TutorialDao;

@Service
public class TutorialServiceimpl implements TutorialService {
	
    @Autowired
    private TutorialDao td;
    

	@Override
	public List<Soumya_Tutorial> getTutorial() {
		return td.findAll();
	}

	@Override
	public Soumya_Tutorial updateTutorial(Soumya_Tutorial tut) {
	   td.save(tut);
		return tut;
	}

	@Override
	public void deleteTutorial(long parseLong) {
		Soumya_Tutorial te=td.getById(parseLong);
		td.delete(te);
	}

	@Override
	public Soumya_Tutorial getTutorial(long tId) {
		
		return td.getById(tId);
	}

	@Override
	public Soumya_Tutorial addTutorial(Soumya_Tutorial tuto) {
		td.save(tuto);
		return tuto;
	}
    
	}
