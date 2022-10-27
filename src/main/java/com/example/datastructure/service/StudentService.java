package com.example.datastructure.service;

import com.example.datastructure.dto.request.StudentCreationRequestDTO;
import com.example.datastructure.dto.response.StudentCreationResponseDTO;
import com.example.datastructure.model.School;
import com.example.datastructure.model.Student;
import com.example.datastructure.repository.SchoolRepository;
import com.example.datastructure.repository.StudentRepository;
import com.example.datastructure.util.DTOToEntityConverter;
import com.example.datastructure.util.EntityToDTOConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final SchoolRepository schoolRepository;

    @PostMapping("/students")
    public StudentCreationResponseDTO addStudent(StudentCreationRequestDTO requestDTO) {
        Student student = DTOToEntityConverter.convertToStudent(requestDTO);
        School school = schoolRepository.findById(requestDTO.getSchoolId()).orElseThrow();
        student.setSchool(school);
        return EntityToDTOConverter.convertToDTO(studentRepository.save(student));
    }
}
