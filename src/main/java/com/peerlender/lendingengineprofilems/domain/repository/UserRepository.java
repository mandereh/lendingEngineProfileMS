package com.peerlender.lendingengineprofilems.domain.repository;

import com.peerlender.lendingengineprofilems.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
