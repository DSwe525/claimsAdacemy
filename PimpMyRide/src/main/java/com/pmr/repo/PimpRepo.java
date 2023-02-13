package com.pmr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pmr.entity.Pimp;

@Repository
public interface PimpRepo extends JpaRepository<Pimp, Integer> {
    
    @Query(value="select * from pimp where email = ?1", nativeQuery = true)
    public Pimp getAccountByEmail(String email);

    @Query(value="select * from pimp where email = ?1 && password = ?2", nativeQuery = true)
    public Pimp getAccountByEmailAndPassword(String email, String password);
}
