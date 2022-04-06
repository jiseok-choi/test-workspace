package com.jiseok.mybatis.awards.controller;

import com.jiseok.mybatis.awards.dao.AwardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/awards")
public class AwardController {

    @Autowired
    public AwardMapper awardMapper;

    @GetMapping(value = "/count")
    public int awardCount() {
        return awardMapper.awardCount();
    }


}
