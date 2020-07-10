package com.springrest.repository;
import com.springrest.entity.College;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICollegeRepository extends CrudRepository<College,String> {

    //default Optional<college> findById(String collegeId) {
        //return null;

}


