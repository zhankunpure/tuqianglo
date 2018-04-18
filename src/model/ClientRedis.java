package model;

import redis.clients.jedis.Jedis;

import com.google.gson.Gson;

public class ClientRedis {
	@SuppressWarnings("resource")
	public void clientRedis(){
		Jedis jedis=new Jedis("172.16.10.105",6379);
		Gson gson=new Gson();
		ResultApi rs=gson.fromJson(jedis.hget("TRACKER_HB", "868120148479204"), ResultApi.class);
		System.out.println(rs.accStatus);
	}
	public static void main(String[] args){
		
		ClientRedis cr=new ClientRedis();
		cr.clientRedis();
	}

}
