package com.tom.springbootdiscover.cache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomCacheControlller.java
 * @Description TODO
 * @createTime 2025年08月02日 18:13:00
 */
@Controller
public class TomCacheControlller {

    @GetMapping("/cache-index")
    @ResponseBody
    public String index() {
        return "tom-cache-index";
    }
}
