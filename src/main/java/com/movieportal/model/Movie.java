package com.movieportal.model;

import com.movieportal.enums.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String director;
    private String shortDescription;
    private float rate;

    public Movie(String title, Category category, String director, String shortDescription, int likes, float rate) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.shortDescription = shortDescription;
        this.rate = rate;
    }
}
