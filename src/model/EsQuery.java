package model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.elasticsearch.action.bulk.BulkProcessor;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import java.net.InetAddress;

public class EsQuery {
	static Log log=LogFactory.getLog(EsQuery.class);
	public static  TransportClient tclient=null;
	static BulkProcessor staticBulkProcessor=null;
	public static TransportClient getClient(){
		try{
			if(tclient==null){
				String EsHosts="172.16.0.116:9300";
				Settings settings=Settings.settingsBuilder()
						.put("cluster.name", "my-application")
						.put("tclient.transport.sniff", true).build();
				tclient=TransportClient.builder().settings(settings).build();
				String[] hostPort=EsHosts.split(":");
				tclient.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(hostPort[0]),Integer.parseInt(hostPort[1])));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return tclient;
	}
	
}
