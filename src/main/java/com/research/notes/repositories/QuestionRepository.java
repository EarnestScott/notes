package com.research.notes.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.research.notes.models.entities.QuestionEntity;

public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID> {

}