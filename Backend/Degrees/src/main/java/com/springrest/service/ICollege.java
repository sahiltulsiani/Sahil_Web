package com.springrest.service;

import com.springrest.entity.College;
import com.springrest.exception.CollegeNotFoundException;

import java.util.List;

public interface ICollege {

    List<College> GetAllcollege();

    College Findcollege(String collegeId);

    College Create(College objCollege);

    College update(String collegeId, College objCollege);

    void Delete(String collegeId) throws CollegeNotFoundException;
}
