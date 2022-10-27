package com.example.datastructure.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StudentCreationRequestDTO {
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "sn")
    private String sn;
    @JsonProperty(value = "school_id")
    private Integer schoolId;
}
