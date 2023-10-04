package com.app.crud.fullstack.repository;

import com.app.crud.fullstack.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
