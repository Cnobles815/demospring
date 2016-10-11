package com.example.repository;


import com.example.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Brian on 10/7/2016.
 */
public interface UserRepository extends CrudRepository<User,Long> {

    User getUserByUserName(String userName);

}
