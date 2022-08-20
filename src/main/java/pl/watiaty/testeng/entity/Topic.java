package pl.watiaty.testeng.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Arrays;

@Data
@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_topic")
    private Long id;

    @Column(name = "name")
    private String name;

//    @Enumerated(value = EnumType.STRING)
    @Column(name = "id_level")
    private Level level;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
