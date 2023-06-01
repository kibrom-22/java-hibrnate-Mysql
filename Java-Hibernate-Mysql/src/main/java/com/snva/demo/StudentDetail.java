package com.snva.demo;
import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "student_detail")
public class StudentDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	@Column(name = "college")
	private String college;
	@Column(name = "no_of_problems_soled")
	private int noOfProblemSolved;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "studentGfgDetail")
    private Student student;
	
	public StudentDetail() {}

	public StudentDetail(String college, int noOfProblemSolved) {
		super();
		this.college = college;
		this.noOfProblemSolved = noOfProblemSolved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getNoOfProblemSolved() {
		return noOfProblemSolved;
	}

	public void setNoOfProblemSolved(int noOfProblemSolved) {
		this.noOfProblemSolved = noOfProblemSolved;
	}
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", college=" + college + ", noOfProblemSolved=" + noOfProblemSolved
				+ ", student=" + student + "]";
	}


	
	

}
