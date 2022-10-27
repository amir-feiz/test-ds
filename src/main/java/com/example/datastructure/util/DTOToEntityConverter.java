package com.example.datastructure.util;

import com.example.datastructure.dto.request.StudentCreationRequestDTO;
import com.example.datastructure.model.Student;

public class DTOToEntityConverter {
    public static Student convertToStudent(StudentCreationRequestDTO requestDTO) {
        return Student.builder().name(requestDTO.getName()).sn(requestDTO.getSn()).build();
    }
}
