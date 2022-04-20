package com.tutorial.springboot.service;


import java.util.List;

import com.tutorial.springboot.bean.Soumya_Tutorial;


public interface TutorialService {
	 
	
	public  List<Soumya_Tutorial>getTutorial();
		 
	public Soumya_Tutorial updateTutorial(Soumya_Tutorial tut) ;

	public void deleteTutorial(long parseLong)  ;

	public Soumya_Tutorial getTutorial(long tId) ;
		
	public Soumya_Tutorial addTutorial(Soumya_Tutorial tuto)  ;
	 
	 

}
