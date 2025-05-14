package ru.securitytrip.auth_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Ответ на запрос регистрации")
public class RegisterResponse {
    @Schema(description = "Сообщение о результате регистрации", example = "Пользователь успешно зарегистрирован", required = true)
    private String message;
    
    @Schema(description = "Флаг успешности операции", example = "true", required = true)
    private boolean success;
} 