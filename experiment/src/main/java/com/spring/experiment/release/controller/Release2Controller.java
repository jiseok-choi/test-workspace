package com.spring.experiment.release.controller;

import com.spring.experiment.release.service.ReleaseDI2Service;
import com.spring.experiment.release.service.ReleaseDIService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Release2Controller {



    private ReleaseDIService releaseDIService = new ReleaseDIService();

    private ReleaseDI2Service releaseDI2Service = new ReleaseDI2Service();

    @GetMapping("/release-di2")
    @ResponseBody
    public String acynclic() {
        return releaseDIService.test() + " " + releaseDI2Service.test();
    }
}
