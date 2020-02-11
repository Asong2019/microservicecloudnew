package com.eying.controller;

import com.eying.entities.Dept;
import com.eying.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 20:25
 */
@RestController
public class DeptControllerConsumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value="/consumer/dept/add",method= RequestMethod.POST)
    public boolean add( Dept dept){
        return service.add(dept);
    }


    @RequestMapping(value="/consumer/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id")Long id){
        return service.get(id);
    }

    @RequestMapping(value="/consumer/dept/list",method=RequestMethod.GET)
    public List<Dept> list(){
        return service.list();
    }

}
