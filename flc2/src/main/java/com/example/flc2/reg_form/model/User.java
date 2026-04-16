package com.example.flc2.reg_form.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Логин обязателен")
    @Size(min = 1, max = 50, message = "Слишком много символов")
    @Column(name = "user_name", nullable = false)
    private String username;

    @NotBlank(message = "Пароль обязателен")
    @Column(name = "password", nullable = false)
    private String password;

    public User(Long id, String name, String password) {
        this.id = id;
        this.username = name;
        this.password = password;
    }
}