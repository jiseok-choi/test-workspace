package com.spring.experiment.release.controller;

import com.spring.experiment.release.service.ReleaseDI2Service;
import com.spring.experiment.release.service.ReleaseDIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReleaseController {

    private final ReleaseDIService releaseDIService;
    private final ReleaseDI2Service releaseDI2Service;

    @Autowired
    public ReleaseController(ReleaseDIService releaseDIService, ReleaseDI2Service releaseDI2Service) {
        this.releaseDIService = releaseDIService;
        this.releaseDI2Service = releaseDI2Service;
    }

    @GetMapping("/release-di")
    @ResponseBody
    public String acynclic() {
        return releaseDIService.test() + " " + releaseDI2Service.test();
    }
}
