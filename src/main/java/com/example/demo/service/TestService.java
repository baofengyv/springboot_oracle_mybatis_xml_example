package com.example.demo.service;

import com.example.demo.dao.xxt.EncounterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    @Resource
    EncounterMapper encounterMapper;

    public Map x() {

        Map r = new HashMap();
        r.put("x", encounterMapper.selectByPrimaryKey(1L));
        return r;
    }
}
