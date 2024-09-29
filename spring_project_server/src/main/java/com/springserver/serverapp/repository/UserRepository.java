/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springserver.serverapp.repository;
import com.springserver.serverapp.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author pc
 */
public interface UserRepository extends JpaRepository<User, Long> {
    
    public Optional<User> findById(long id);

    public void deleteById(long id);
    
    public Optional<List<User>> findByNomLike(String name);
    public Optional<List<User>>  findByNomContaining(String name);
    public Optional<List<User>> findByNomContains(String name);
    public Optional<List<User>> findByNomIsContaining(String name);
}

