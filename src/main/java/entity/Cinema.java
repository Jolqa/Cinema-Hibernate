package entity;

import javax.persistence.*;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private Location location;

    @Column
    private String name;

}
