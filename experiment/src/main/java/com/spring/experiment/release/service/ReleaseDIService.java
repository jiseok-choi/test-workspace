package com.spring.experiment.release.service;

import org.springframework.stereotype.Service;

@Service
public class ReleaseDIService {

    private int count;

    public int test() {
        return ++count;
    }
}
