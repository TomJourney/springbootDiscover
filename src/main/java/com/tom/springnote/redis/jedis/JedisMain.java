package com.tom.springnote.redis.jedis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName JedisMain.java
 * @Description TODO
 * @createTime 2024年12月01日 15:34:00
 */
public class JedisMain {
    public static void main(String[] args) throws IOException {
        //set 集合,用来装集群的ip 和端口的
        Set<HostAndPort> nodes = new HashSet<>();
        //通过for循环把集群的主机信息装到集合
        for (int port = 6611; port <= 6616; port++) {
            nodes.add(new HostAndPort("192.168.163.211", port));
        }

        JedisPoolConfig jedisPoolConfig = buildJedisPoolConfig();
        //创建JedisCluster
        JedisCluster cluster = new JedisCluster(nodes, 1000, 1000 ,3, "123456", jedisPoolConfig);
        cluster.set("name", "zhangsan");
        cluster.close();
    }

    private static JedisPoolConfig buildJedisPoolConfig() {

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();

        jedisPoolConfig.setMaxIdle(8);       // 最大空闲连接数, 默认8个
        jedisPoolConfig.setMaxTotal(8);    // 最大连接数, 默认8个
        jedisPoolConfig.setMinIdle(0);       // 最小空闲连接数, 默认0
        jedisPoolConfig.setMaxWaitMillis(1000); // 获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常, 小于零:阻塞不确定的时间,  默认-1
        jedisPoolConfig.setTestOnBorrow(true);                              // 对拿到的connection进行validateObject校验
        return jedisPoolConfig;
    }
}
