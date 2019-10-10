package edu.mum.cs.studentMang.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.studentMang.models.Student;


public interface StudentRepository extends CrudRepository<Student, Long>{

}
