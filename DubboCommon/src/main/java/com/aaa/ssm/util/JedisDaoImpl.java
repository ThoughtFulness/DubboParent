package com.aaa.ssm.util;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * className:JedisDaoImpl
 * discriptoin:
 * author:毛宇
 * createTime:2018-12-29 16:54
 */
//@Service
public class JedisDaoImpl implements JedisDao {

	//@Autowired
	private JedisPool jedisPool;

	@Override
	public void putObject(Object key, Object value) {
		// TODO Auto-generated method stub
		Jedis resource = jedisPool.getResource();
		resource.set(SerializeUtil.serialize(key.toString()),
				SerializeUtil.serialize(value));
		resource.close();
	}
	@Override
	public Object removeObject(Object arg0) {
		// TODO Auto-generated method stub
		Jedis resource = jedisPool.getResource();
		Object expire = resource.expire(
				SerializeUtil.serialize(arg0.toString()), 0);
		resource.close();
		return expire;
	}
	@Override
	public Object getObject(Object arg0) {
		// TODO Auto-generated method stub
		Jedis resource = jedisPool.getResource();
		Object value = SerializeUtil.unserialize(resource.get(
				SerializeUtil.serialize(arg0.toString())));
		resource.close();
		return value;
	}
	@Autowired
	public static byte[] serialize(Object object) {
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try {
			// 序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Object unserialize(byte[] bytes) {
		if (bytes == null)
			return null;
		ByteArrayInputStream bais = null;
		try {
			// 反序列化
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
