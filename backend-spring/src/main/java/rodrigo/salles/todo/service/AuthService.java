package rodrigo.salles.todo.service;

import rodrigo.salles.todo.dto.LoginDto;
import rodrigo.salles.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    String login(LoginDto loginDto);

}
