package com.springrest.repository;

import com.springrest.entity.college;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICollegeRepository extends CrudRepository<college,String> {

    default Optional<college> findById(String College_ID) {
        return null;
    }
}


