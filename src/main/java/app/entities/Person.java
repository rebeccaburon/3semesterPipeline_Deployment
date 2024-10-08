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

    public int ForTest1(){
        int A = 5;
        int B = 4;
        int result = A + B;
        return result;

    }
    public int ForTest2(){
        int A = 9;
        int B = 8;
        int result = A * B;
        return result;

    }
    public int ForTest3(){
        int A = 7;
        int B = 3;
        int result = A - B;
        return result;

    }
}
