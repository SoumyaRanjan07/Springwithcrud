package com.tutorial.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tutorial_ranjan")

public class Soumya_Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	 private int id;
	@Column(name="title")
	private String title;
	@Column(name="descripition")
	private String description;
    @Column(name="PublishStatus")
    private String publishStatus; 
	 
   public Soumya_Tutorial() {
	   super();
   }
   public Soumya_Tutorial(int id,String title,String descripition,String publishStatus) {
	   super();
	   this.id=id;
	   this.title=title;
	   this.description=description;
	   this.publishStatus=publishStatus;
   }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPublishStatus() {
	return publishStatus;
}
public void setPublishStatus(String publishStatus) {
	this.publishStatus = publishStatus;
}
@Override
public String toString() {
	return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", publishStatus="
			+ publishStatus + "]";
}

   
}
