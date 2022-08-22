package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentDao;

@Service
public class StudentServiceImpl implements Studentservice {

	@Autowired
	private StudentDao sDao;

	@Override
	public Student saveStudent(Student student) {

		Student savedStudent = sDao.save(student);

		return savedStudent;
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {

//		Optional<Student> opt= sDao.findById(roll);
//		
//		if(opt.isPresent()) {
//			Student student= opt.get();
//			return student;
//		}
//		else {
//			throw new StudentException("Student with roll "+roll+" is not present");
//		}

		return sDao.findById(roll)
				.orElseThrow(() -> new StudentException("Student with roll " + roll + " is not present"));

	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student> students = sDao.findAll();

		if (students.size() > 0) {
			return students;
		} else {
			throw new StudentException("No Students found..");
		}
	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		Student existingStudent = sDao.findById(roll)
				.orElseThrow(() -> new StudentException("Student Does not Exist with roll: " + roll));

		sDao.delete(existingStudent);

		return existingStudent;

	}

	@Override
	public Student updateStudent(Integer roll, Integer graceMarks) throws StudentException {
		Optional<Student> opt = sDao.findById(roll);

		if (opt.isPresent()) {

			Student existingStudent= opt.get();
			existingStudent.setMarks(existingStudent.getMarks()+graceMarks);
			return sDao.save(existingStudent);
			
		}
		else {
			throw new StudentException("Student does not exist...");
		}
	}

}
