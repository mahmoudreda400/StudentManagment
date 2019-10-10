package edu.mum.cs.studentMang.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transcript {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long transcriptId;

	private String degreeTitle;

	@OneToOne(mappedBy = "transcript")
	private Student student;

	public Transcript() {
		// TODO Auto-generated constructor stub
	}

	public long getTranscriptId() {
		return transcriptId;
	}

	public void setTranscriptId(long transcriptId) {
		this.transcriptId = transcriptId;
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
