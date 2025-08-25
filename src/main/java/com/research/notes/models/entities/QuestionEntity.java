package com.research.notes.models.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.hibernate.annotations.JdbcTypeCode;
import org.springframework.data.annotation.CreatedBy;
import java.util.UUID;
import java.sql.Types;
import java.time.Instant;

@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionEntity {

    @Id
    @GeneratedValue
    @JdbcTypeCode(Types.VARCHAR)
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false, length = 1000)
    private String question;

    // Foreign key to User (creator and modifier)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "created_by", nullable = false)
    @CreatedBy
    private UserEntity createdBy;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant createdTime;

}
