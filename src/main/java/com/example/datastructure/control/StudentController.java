package com.example.datastructure.control;

import com.example.datastructure.dto.request.StudentCreationRequestDTO;
import com.example.datastructure.dto.response.StudentCreationResponseDTO;
import com.example.datastructure.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @PostMapping("/students")
    private StudentCreationResponseDTO addStudent(@RequestBody StudentCreationRequestDTO requestDTO) {
        return service.addStudent(requestDTO);
    }

}
