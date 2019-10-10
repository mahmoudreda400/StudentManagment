package edu.mum.cs.studentMang;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.studentMang.models.Classroom;
import edu.mum.cs.studentMang.models.Student;
import edu.mum.cs.studentMang.models.Transcript;
import edu.mum.cs.studentMang.repository.ClassroomRepository;
import edu.mum.cs.studentMang.repository.StudentRepository;

@SpringBootApplication
public class StudentMgmtApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepo;

	@Autowired
	ClassroomRepository classroomRepo;

	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtApplication.class, args);
	}

	public void saveStudent(Student student) {
		studentRepo.save(student);
	}

	public Classroom saveClassRoom(Classroom classroom) {
		return classroomRepo.save(classroom);
	}

	@Override
	public void run(String... args) throws Exception {
		// save Student
		Student s = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.parse("2019-05-24"));
		saveStudent(s);

		// save student with transcript
		Transcript t = new Transcript();
		t.setDegreeTitle("BS Computer Science");
		s.setTranscript(t);
		saveStudent(s);

		// save student with classroom
		Classroom cr = new Classroom("McLaughlin building", "M105");
		saveClassRoom(cr);
		s.setClassroom(cr);
		saveStudent(s);

	}

}
