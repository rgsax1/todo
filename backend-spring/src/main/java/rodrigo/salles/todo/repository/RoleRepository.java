package rodrigo.salles.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.salles.todo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);

}
