package entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Movie {
    @Column
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column
    private String title;

    @Column
    private LocalDate date;

    @Column
    private LocalTime startingTime;

    @Column
    private String description;

}
