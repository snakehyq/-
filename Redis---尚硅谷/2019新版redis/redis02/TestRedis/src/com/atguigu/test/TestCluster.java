package com.atguigu.test;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class TestCluster {

	public static void main(String[] args) throws Exception {
		
		Set<HostAndPort> nodes = new HashSet<>();
		nodes.add(new HostAndPort("192.168.242.132", 6379));
		JedisCluster cluster = new JedisCluster(nodes);
		//cluster.set("username", "admin");
		String s = cluster.get("username");
		System.out.println(s);
		cluster.close();
		
	}
	
}
