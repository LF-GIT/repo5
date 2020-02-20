package com.lf.springtest;

import com.lf.springtest.bean.Cat;
import com.lf.springtest.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringTestApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testCat(){
        boolean b = applicationContext.containsBean("cat");
        System.out.println(b);
    }

    @Autowired
    private Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
