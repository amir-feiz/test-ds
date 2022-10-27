package com.example.datastructure.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Builder
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String sn;
    private String name;

    @ManyToOne
    @JoinColumn(name = "school_id")
    @Setter
    private School school;
}
