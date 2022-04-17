package com.finzly.Assignment.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.finzly.Assignment.entity.User;


@Repository
public interface UserRepository extends JpaRepository <User,Long> {
	
	User findByUsername(String username);

}
