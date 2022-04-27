package com.spring.experiment.release.service;

import org.springframework.stereotype.Service;

@Service
public class ReleaseDI2Service {

    private int count;

    public int test() {
        return ++count;
    }
}
