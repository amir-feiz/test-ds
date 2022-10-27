package com.example.datastructure.util;

import com.example.datastructure.dto.response.StudentCreationResponseDTO;
import com.example.datastructure.model.Student;

public class EntityToDTOConverter {
    public static StudentCreationResponseDTO convertToDTO(Student student) {
        return new StudentCreationResponseDTO(student.getName(), student.getSn(), student.getId());
    }
}
