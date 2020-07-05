package com.springrest.controller;

import com.springrest.entity.college;
import com.springrest.service.CollegeImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "colleges")
public class CollegeController {
    @Autowired
    private CollegeImplementation collegeservice;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<college> GetAllcollege(){
        return collegeservice.GetAllcollege ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{College_Id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public college FindVehicle(@PathVariable("College_Id") String strcollegeNum)
    {
        return collegeservice.Findcollege ( strcollegeNum );
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public college Create(@RequestBody college objCollege)
    {
        return collegeservice.Create ( objCollege );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{College_Id}", consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public college update(@PathVariable("College_Id") String strcollegeNumber,@RequestBody college objCollege)
    {
        return collegeservice.update ( strcollegeNumber,objCollege );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{College_Id}")
    public void Delete(@PathVariable("College_Id") String strcollegeNum)
    {
        collegeservice.Delete ( strcollegeNum );

    }




}
