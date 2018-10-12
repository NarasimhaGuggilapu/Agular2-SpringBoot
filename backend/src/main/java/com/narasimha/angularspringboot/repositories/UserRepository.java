package com.narasimha.angularspringboot.repositories;

import com.narasimha.angularspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{

}
