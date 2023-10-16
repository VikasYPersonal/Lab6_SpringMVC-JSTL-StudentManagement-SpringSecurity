package com.greatLearning.studentManagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.greatLearning.studentManagement.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByFirstNameContainsAndCourseContainsAllIgnoreCase(String firstName,String course);
	
	
	
}
