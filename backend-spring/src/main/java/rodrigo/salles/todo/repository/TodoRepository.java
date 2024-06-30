package rodrigo.salles.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.salles.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
