package com.yyj.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "Users")
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    private UUID id;
    private String username;
    private String password;
    private LocalDateTime createdAt;
}
