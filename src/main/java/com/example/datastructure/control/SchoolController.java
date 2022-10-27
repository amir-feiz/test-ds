package com.example.datastructure.control;

import com.example.datastructure.model.School;
import com.example.datastructure.model.Student;
import com.example.datastructure.service.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SchoolController {
    private final SchoolService service;

    @GetMapping("/schools/{id}/students")
    private List<Student> getStudents(@PathVariable Integer id) {
        return service.getStudents(id);
    }

    @PostMapping("/schools")
    private School addSchool(@RequestBody School school) {
        return service.addSchool(school);
    }
}

