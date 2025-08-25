package com.research.notes.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.research.notes.models.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}
