package com.tom.springnote.usingjedis.support;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName RedisSupport.java
 * @Description TODO
 * @createTime 2024年12月01日 14:32:00
 */
public interface IRedisSupport {

    String set(String key, String value);

    String get(String key);
}
