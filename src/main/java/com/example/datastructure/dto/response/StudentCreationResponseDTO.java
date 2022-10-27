package com.example.datastructure.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class StudentCreationResponseDTO {
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "sn")
    private String sn;
    @JsonProperty(value = "student_id")
    private Integer StudentId;
}
