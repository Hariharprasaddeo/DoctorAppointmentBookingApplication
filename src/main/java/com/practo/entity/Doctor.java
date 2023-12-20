package com.practo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Settergit 
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    private  String doctorName;
    private  String qualification;
    private  String specializations;
    private  String experience;
    private  String description;
    private String hospitals;

}
