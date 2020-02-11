package com.eying.service;

import com.eying.entities.Dept;

import java.util.List;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 18:12
 */
public interface DeptService {

    public Dept get(Long deptNo);

    public List<Dept> list();

    public Boolean add(Dept dept);
}
