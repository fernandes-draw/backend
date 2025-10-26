package com.fernandesdraw.user.UserMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fernandesdraw.user.UserMS.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
