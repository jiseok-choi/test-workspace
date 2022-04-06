package com.jiseok.mybatis.awards;

import com.jiseok.mybatis.AwardApplication;
import com.jiseok.mybatis.awards.dao.AwardMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = AwardApplication.class)
@WebAppConfiguration
@Transactional
public class AwardTest {

    @Autowired
    private AwardMapper awardMapper;

    @Test
    public void awardMapper() throws Exception {
        int count = 4;
        int resultCount = awardMapper.awardCount();

        Assertions.assertEquals(resultCount, count);
    }
}
