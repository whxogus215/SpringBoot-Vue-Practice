package net.javaguides.springboot.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name") // 테이블에 열 이름을 지정할 때, 두 단어가 합쳐있을 경우 _로 구분하기 위해 @Column으로 직접 정의하였다.
    private String lastName;
    private String email;
}
