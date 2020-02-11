package com.eying.service.impl;

import com.eying.dao.DeptDao;
import com.eying.entities.Dept;
import com.eying.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 18:15
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept get(Long deptNo) {
        return deptDao.findById(deptNo);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

    @Override
    public Boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }
}
