package com.api.CrudInterview.repositories;

import com.api.CrudInterview.models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModels, Long> {
}
