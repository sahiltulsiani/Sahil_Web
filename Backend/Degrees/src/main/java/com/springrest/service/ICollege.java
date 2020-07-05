package com.springrest.service;

import com.springrest.entity.college;
import com.springrest.exception.CollegeNotFoundException;

import java.util.List;

public interface ICollege {

    List<college> GetAllcollege();

    college Findcollege(String College_ID);

    college Create(college objCollege);

    college update(String College_ID, college objCollege);

    void Delete(String College_ID) throws CollegeNotFoundException;
}
