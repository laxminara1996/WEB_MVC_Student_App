package in.laxmi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.laxmi.binding.Student;
import in.laxmi.entity.StudentEntity;
import in.laxmi.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public boolean saveStudent(Student student) {
		StudentEntity entity = new StudentEntity();
		 BeanUtils.copyProperties(student, entity);
		  entity.setTimings(Arrays.toString(student.getTimings()));
		 repo.save(entity);
		 return true;
	}
public List<String> getCourses(){
	return Arrays.asList("java","python","devops","aws");
}
public List<String> getTimings(){
	return Arrays.asList("morning","afternoon","evening");
}

	
}
