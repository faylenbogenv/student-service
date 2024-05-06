package telran.java52.student.service;

import java.util.List;
import java.util.Set;

import telran.java52.student.dto.ScoreDto;
import telran.java52.student.dto.StudentAddDto;
import telran.java52.student.dto.StudentDto;
import telran.java52.student.dto.StudentUpdateDto;

public interface StudentService {
	Boolean addStudent(StudentAddDto studentAddDto);
	
	StudentDto findStudent(Long id);
	
	StudentDto removeStudent(Long id);
	
	StudentAddDto updateStudent(Long id, StudentUpdateDto studentUpdateDto);
	
	Boolean addScore(Long id, ScoreDto scoreDto);
	
	List<StudentDto> findStudentsByName(String name);
	
	Long getStudentsNamesQuantity(Set<String> names);
	
	List<StudentDto> getStudentsByExamMinScore(String exam, Integer minScore);
}
