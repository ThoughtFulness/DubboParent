package com.aaa.ssm.util;

import redis.clients.jedis.Jedis;

/**
 * className:TestRedisConnect
 * discriptoin:
 * author:毛宇
 * createTime:2018-12-29 16:39
 */
public class TestRedisConnect {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.159.110");
		System.out.println(jedis.ping());
	}
}
