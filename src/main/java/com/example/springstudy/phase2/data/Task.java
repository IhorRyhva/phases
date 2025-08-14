package com.example.springstudy.phase2.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Future
    LocalDate data;

    @NotNull
    String task;

    @ManyToOne
    @JoinColumn(name = "userId")
    User user;
}
