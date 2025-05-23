package ru.securitytrip.auth_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "Ответ на успешную аутентификацию")
public class LoginResponse {
    @Schema(description = "JWT токен для авторизации (access token)", example = "eyJhbGciOiJIUzI1NiJ9...", required = true)
    private String token;
    
    @Schema(description = "Refresh токен для обновления access токена", example = "eyJhbGciOiJIUzI1NiJ9...", required = true)
    private String refreshToken;
    
    @Schema(description = "Имя пользователя", example = "Иван Иванов", required = true)
    private String name;
    
    @Schema(description = "Идентификатор пользователя", example = "1", required = true)
    private Long userId;
    
    public LoginResponse(String token, String refreshToken, String name, Long userId) {
        this.token = token;
        this.refreshToken = refreshToken;
        this.name = name;
        this.userId = userId;
    }
    
    /**
     * Для совместимости со старым кодом
     */
    public String getUsername() {
        return name;
    }
    
    /**
     * Для совместимости со старым кодом
     */
    public void setUsername(String username) {
        this.name = username;
    }
}
