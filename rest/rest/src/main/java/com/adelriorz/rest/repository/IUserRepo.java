package com.adelriorz.rest.repository;

import com.adelriorz.rest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
}
