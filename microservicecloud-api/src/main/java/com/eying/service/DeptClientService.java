package com.eying.service;

import com.eying.beans.DeptFallbackService;
import com.eying.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 22:16
 */
@FeignClient(value="MICROSERVICECLOUD-DEPT",fallbackFactory = DeptFallbackService.class)
public interface DeptClientService {

    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
    public boolean add( Dept dept);

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list();
}
