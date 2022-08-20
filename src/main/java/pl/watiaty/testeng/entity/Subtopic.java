package pl.watiaty.testeng.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "subtopics")
public class Subtopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subtopic")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_topic")
    private Topic topic;
}
