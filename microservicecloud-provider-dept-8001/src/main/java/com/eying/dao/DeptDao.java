package com.eying.dao;

import com.eying.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 18:06
 */
@Mapper
public interface DeptDao {

    public Dept findByDeptNo(Long deptNo);

    public List<Dept> findAll();

    public boolean addDept(Dept dept);
}
