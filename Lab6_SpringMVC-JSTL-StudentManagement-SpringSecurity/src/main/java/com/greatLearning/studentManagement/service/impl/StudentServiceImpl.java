package com.greatLearning.studentManagement.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greatLearning.studentManagement.entity.Student;
import com.greatLearning.studentManagement.repository.StudentRepository;
import com.greatLearning.studentManagement.service.StudentService;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> students=studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);
		
	}

	@Override
	public List<Student> searchBy(String firstName, String course) {
		// TODO Auto-generated method stub
		List<Student> students=studentRepository.findByFirstNameContainsAndCourseContainsAllIgnoreCase(firstName, course);
		return students;
	}





}