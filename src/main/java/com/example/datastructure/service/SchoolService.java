package com.example.datastructure.service;

import com.example.datastructure.model.School;
import com.example.datastructure.model.Student;
import com.example.datastructure.repository.SchoolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public School addSchool(School school) {
        return schoolRepository.save(school);
    }

    public List<Student> getStudents(Integer schoolId) {
        School school = schoolRepository.findById(schoolId).orElseThrow();
        return school.getStudents();
    }

}
