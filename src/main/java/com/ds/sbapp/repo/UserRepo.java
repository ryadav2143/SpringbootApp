package com.ds.sbapp.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ds.sbapp.dto.User;


public interface UserRepo extends JpaRepository<User,String> {
   
}
