package com.example.datastructure.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
