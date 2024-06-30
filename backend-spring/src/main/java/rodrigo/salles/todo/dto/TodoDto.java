package rodrigo.salles.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private int id;
    private String title;
    private String description;
    private boolean completed;
}
