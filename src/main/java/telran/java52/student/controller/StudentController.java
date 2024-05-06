package telran.java52.student.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import telran.java52.student.dto.ScoreDto;
import telran.java52.student.dto.StudentAddDto;
import telran.java52.student.dto.StudentDto;
import telran.java52.student.dto.StudentUpdateDto;
import telran.java52.student.service.StudentService;

@RestController
@RequiredArgsConstructor
public class StudentController {
	
	final StudentService studentService;

	@PostMapping("/student")
	public Boolean addStudent(@RequestBody StudentAddDto studentAddDto) {
		return studentService.addStudent(studentAddDto);
	}

	@GetMapping("/student/{studentId}")
	public StudentDto findStudent(@PathVariable("studentId") Long id) {
		return studentService.findStudent(id);
	}

	@DeleteMapping("/student/{id}")
	public StudentDto removeStudent(@PathVariable Long id) {
		return studentService.removeStudent(id);
	}

	@PutMapping("/student/{id}")
	public StudentAddDto updateStudent(@PathVariable Long id, @RequestBody StudentUpdateDto studentUpdateDto) {
		return studentService.updateStudent(id, studentUpdateDto);
	}

	@PutMapping("score/student/{id}")
	public Boolean addScore(@PathVariable Long id, @RequestBody ScoreDto scoreDto) {
			return studentService.addScore(id, scoreDto);
	}

	@GetMapping("/students/name/{name}")
	public List<StudentDto> findStudentsByName(@PathVariable String name) {
		return studentService.findStudentsByName(name);
	}

	@PostMapping("/quantity/students")
	public Long getStudentsNamesQuantity(@RequestBody Set<String> names) {
		return studentService.getStudentsNamesQuantity(names);
	}

	@GetMapping("students/exam/{exam}/minscore/{minScore}")
	public List<StudentDto> getStudentsByExamMinScore(@PathVariable String exam, @PathVariable Integer minScore) {
		return studentService.getStudentsByExamMinScore(exam, minScore);
	}
}
