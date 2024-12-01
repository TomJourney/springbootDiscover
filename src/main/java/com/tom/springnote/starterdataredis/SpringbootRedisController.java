package com.tom.springnote.starterdataredis;

import com.tom.springnote.starterdataredis.repository.SpringbootRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringbootRedisController.java
 * @Description TODO
 * @createTime 2024年12月01日 16:18:00
 */
@RestController
public class SpringbootRedisController {

    @Autowired
    private SpringbootRedisRepository springbootRedisRepository;

    @GetMapping("/springbootredis/set/{key}")
    public void setKey(@PathVariable("key") String key) {
        springbootRedisRepository.set(key, "tom-" + key);
    }

    @GetMapping("/springbootredis/setex/{key}/{timeout}")
    public void setKeyEx(@PathVariable("key") String key, @PathVariable("timeout") int timeout) {
        springbootRedisRepository.setExpire(key, "tom-" + key, timeout);
    }

    @GetMapping("/springbootredis/get/{key}")
    public Object getKey(@PathVariable("key") String key) {
        return springbootRedisRepository.get(key);
    }
}
