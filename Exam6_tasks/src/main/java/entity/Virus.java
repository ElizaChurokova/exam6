package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "virus")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Virus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="medicine_id")
    private Medicine medicine;


}
