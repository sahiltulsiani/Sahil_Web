package com.springrest.service;
import com.springrest.repository.ICollegeRepository;
import com.springrest.entity.College;
import com.springrest.exception.BadRequestException;
import com.springrest.exception.CollegeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeImplementation implements ICollege {
    @Autowired
    ICollegeRepository collRepo;


    @Override
    @Transactional (readOnly = true)
    public List<College> GetAllcollege() {
        return (List<College>) collRepo.findAll();
    }

    @Override
    public College Findcollege(String collegeId) {
        return null;
    }


    @Override
    @Transactional
    public College Create(College objCollege) {
        College v1 = collRepo.save ( objCollege );
        if(v1 == null)
        {
            throw new BadRequestException ("Customer  not created successfully:" + objCollege.getClgname () +" not found");
        }
        return v1;
    }

    @Override
    @Transactional // Have the benefit of applying to whatever layer you want to
    //Syncronized -- one thread at a time but trans gives rollback features
    public College update(String collegeId, College objCollege) {
        Optional<College> v1 = collRepo.findById(collegeId);
        if(!v1.isPresent ())
        {
            throw new CollegeNotFoundException ("Customer with id :" + collegeId +" not found");
        }
        return   collRepo.save( objCollege);
        //  return  null;
    }


    @Override
    @Transactional
    public void Delete(String collegeId) throws CollegeNotFoundException {
        Optional<College> v1 = collRepo.findById(collegeId);
        if(!v1.isPresent ())
        {
            throw new CollegeNotFoundException ("Customer with id :" + collegeId +" not found");
        }
        collRepo.delete ( v1.get () );
    }

}
