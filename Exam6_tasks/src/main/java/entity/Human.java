package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "human")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="virus_id")
    private Virus virus;
}
