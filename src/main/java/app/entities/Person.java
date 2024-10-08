package app.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;


    public void ForTest(){
        int A = 0;
        int B = 0;


    }
}
