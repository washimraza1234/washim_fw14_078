package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entities.Manager;

@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer>{

}
