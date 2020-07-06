package com.springrest.service;
import com.springrest.repository.ICollegeRepository;
import com.springrest.entity.college;
import com.springrest.exception.BadRequestException;
import com.springrest.exception.CollegeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import com.springrest.*;

@Service
public class CollegeImplementation implements ICollege {
    @Autowired
    ICollegeRepository collRepo;


    @Override
    @Transactional (readOnly = true)
    public List<college> GetAllcollege() {
        return (List<college>) collRepo.findAll();
    }

    @Override
    public college Findcollege(String College_ID) {
        return null;
    }


    //    @Override
//    @Transactional(readOnly = true)
//    public Vehicle FindVehicleName(String strVehicleName) {
//        //optional is a wrapper on top of vehicle object
//        Optional<Vehicle> v1 = vehiRepo.findByStrmake(strVehicleName);
//        if(!v1.isPresent ())
//        {
//            throw new VehicleNotFoundException ("Vehicle with id :" + strVehicleName +" not found");
//        }
//        return v1.get();
//    }


    @Override
    @Transactional
    public college Create(college objCollege) {
        college v1 = collRepo.save ( objCollege );
        if(v1 == null)
        {
            throw new BadRequestException ("Customer  not created successfully:" + objCollege.getClg_name () +" not found");
        }
        return v1;
    }

    @Override
    @Transactional // Have the benefit of applying to whatever layer you want to
    //Syncronized -- one thread at a time but trans gives rollback features
    public college update(String College_ID, college objCollege) {
        Optional<college> v1 = collRepo.findById(College_ID);
        if(!v1.isPresent ())
        {
            throw new CollegeNotFoundException ("Customer with id :" + College_ID +" not found");
        }
        return   collRepo.save( objCollege);
        //  return  null;
    }


    @Override
    @Transactional
    public void Delete(String College_ID) throws CollegeNotFoundException {
        Optional<college> v1 = collRepo.findById(College_ID);
        if(!v1.isPresent ())
        {
            throw new CollegeNotFoundException ("Customer with id :" + College_ID +" not found");
        }
        collRepo.delete ( v1.get () );
    }

}
