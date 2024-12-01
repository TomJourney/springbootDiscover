package com.tom.springnote.usingjedis;

import com.tom.springnote.usingjedis.support.IRedisSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomSpringRedisController.java
 * @Description TODO
 * @createTime 2024年12月01日 14:34:00
 */
@RestController
public class TomSpringRedisController {

    @Autowired
    private IRedisSupport redisSupport;

    @GetMapping("/redis/set/{key}")
    public void setKey(@PathVariable("key") String key) {
        redisSupport.set(key, "tom-" + key);
    }

    @GetMapping("/redis/get/{key}")
    public String getKey(@PathVariable("key") String key) {
        return redisSupport.get(key);
    }
}
