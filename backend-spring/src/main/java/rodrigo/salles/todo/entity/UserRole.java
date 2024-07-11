package rodrigo.salles.todo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles")
public class UserRole {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated(EnumType.STRING)  // Use EnumType.ORDINAL se preferir armazenar o índice do enum
    @Column(nullable = false)
    private Role role;
}
