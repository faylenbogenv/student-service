package telran.java52.student.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
	Long id;
    String name;
    Map<String, Integer> scores;
    
}
