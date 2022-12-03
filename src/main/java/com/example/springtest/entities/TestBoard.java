package com.example.springtest.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;



// @Entity 는 db의 table 을 의미
@Entity
@Data
@Table(name="tboard")
public class TestBoard {
    @Id // PK 를 의미
    @GeneratedValue(strategy = GenerationType.AUTO, generator="native") // mariadb 에서는 IDENTITY 를 사용.
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    private String title;

    private String content;

    private String filename;

    private String filepath;
}
