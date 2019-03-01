package com.forezp.hystric;

import com.forezp.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by deng_ on 2019/1/28.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "feign : sorry "+name;
    }
}
