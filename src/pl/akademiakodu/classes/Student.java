package pl.akademiakodu.classes;

import java.util.ArrayList;

public class Student {
	private String name;
	private String surname;
	private ArrayList<Grade> grades = new ArrayList<Grade>();
	
	
	public void addGrade(Grade grade){
		grades.add(grade);
	}
	
	public Student(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}


	public ArrayList<Grade> getGrades() {
		return grades;
	}


	public void setGrades(ArrayList<Grade> grades) {
		this.grades = grades;
	}
}
