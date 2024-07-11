package rodrigo.salles.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rodrigo.salles.todo.entity.Role;
import rodrigo.salles.todo.entity.UserRole;

public interface RoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRole(Role role);

}
