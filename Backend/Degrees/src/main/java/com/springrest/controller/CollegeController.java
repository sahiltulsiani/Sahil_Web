package com.springrest.controller;

import com.springrest.entity.College;
import com.springrest.service.CollegeImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "colleges")
public class CollegeController {
    @Autowired
    private CollegeImplementation collegeservice;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<College> GetAllcollege(){
        return collegeservice.GetAllcollege ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{collegeId}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public College FindVehicle(@PathVariable("collegeId") String strcollegeNum)
    {
        return collegeservice.Findcollege ( strcollegeNum );
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public College Create(@RequestBody College objCollege)
    {
        return collegeservice.Create ( objCollege );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{collegeId}", consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public College update(@PathVariable("collegeId") String strcollegeNumber, @RequestBody College objCollege)
    {
        return collegeservice.update ( strcollegeNumber,objCollege );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{collegeId}")
    public void Delete(@PathVariable("collegeId") String strcollegeNum)
    {
        collegeservice.Delete ( strcollegeNum );

    }




}
