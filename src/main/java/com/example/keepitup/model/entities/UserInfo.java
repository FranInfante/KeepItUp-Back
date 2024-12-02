package com.example.keepitup.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private double initialWeight;

    @Column(nullable = false)
    private double goalWeight;

    @Column(nullable = false)
    private Integer workoutDaysPerWeek;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

}