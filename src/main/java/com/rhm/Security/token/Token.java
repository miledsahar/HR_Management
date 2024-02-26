package com.rhm.Security.token;

import com.rhm.Security.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Token {
//Token class
    @Id
    @GeneratedValue
        private Integer Id;
        private String token;

        @Enumerated(EnumType.STRING)
        private TokenType tokenType;

        private boolean expired;
        private boolean revoked;

        @ManyToOne
        @JoinColumn(name="user_id")
        private User user;



    }
