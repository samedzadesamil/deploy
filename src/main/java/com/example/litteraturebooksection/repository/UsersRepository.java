package com.example.litteraturebooksection.repository;

import com.example.litteraturebooksection.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
   Users findById(long id);
   Users findByNameAndSurname(String name, String surname);
   Users findByEmail(String email);
   Users findByUsernameAndPassword(String username,String password);
   boolean existsUsersByUsername(String username);

}
