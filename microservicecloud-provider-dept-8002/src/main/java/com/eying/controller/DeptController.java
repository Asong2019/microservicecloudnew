package com.eying.controller;

import com.eying.entities.Dept;
import com.eying.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 18:17
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value="/dept/get/{id}",method= RequestMethod.GET)
    public Dept get(@PathVariable("id")Long id){
        Dept dept= service.get(id);
        return dept;
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list(){
        return service.list();
    }

    @RequestMapping(value="/dept/add",method=RequestMethod.POST)
    public Boolean add(Dept dept){
        return service.add(dept);
    }
}
