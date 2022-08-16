package com.example.litteraturebooksection.repository;

import com.example.litteraturebooksection.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
  public Users findById(int id);
  public Users findByNameAndSurname(String name, String surname);
  public Users findByEmail(String email);
  public Users findByUsernameAndPassword(String username, String password);
  public boolean existsUsersByUsername(String username);

}
