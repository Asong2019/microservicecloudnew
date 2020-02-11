package com.eying.beans;

import com.eying.entities.Dept;
import com.eying.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ShenGuiSong
 * @create 2020-02-10 9:20
 */
@Component
public class DeptFallbackService implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptNo(id).setDeptName(id+"你查询的信息不存在").setDbSource("No data in mysql database");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
