package com.example.datastructure.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class School {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String type;
    @OneToMany(mappedBy = "school")
    @ToString.Exclude
    private List<Student> students;
}
