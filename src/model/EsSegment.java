package model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;

public class EsSegment {
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(EsSegment.class);
	private String accSegment_index_name = "command_log201804";
	private String accSegment_index_type = "directiveslog";

	public void getAccSegmentSumES() {
		List<String> er=new ArrayList<String>();
		SearchRequestBuilder sbuilder = EsQuery.getClient().prepareSearch(accSegment_index_name)
				.setTypes(accSegment_index_type);
		BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
		// mustQuery.must(QueryBuilders.matchAllQuery());
		queryBuilder.must(QueryBuilders.termQuery("receiveDevice", "867597010569793"));
		SearchResponse searchResponse = sbuilder.setQuery(queryBuilder)
				.setFrom(0)// 閸掑棝銆夌挧宄邦潗娴ｅ秶鐤嗛敍鍫ｇ儲鏉╁洤绱戞慨瀣畱n娑擃亷绱�
				.setSize(10)// 閺堫剚顐兼潻鏂挎礀閻ㄥ嫭鏋冨锝嗘殶闁诧拷
				.execute().actionGet();// 閹笛嗩攽閹兼粎鍌�

		//log.info("response=" + searchResponse.getHits());
		SearchHits hits = searchResponse.getHits();
		for (SearchHit hit : hits.getHits()) {
			//er=hit.getSource().get("updationDate");
			er.add(hit.getSource().get("updationDate").toString());
			System.out.println(hit.getSource());
			//System.out.println(hits.getHits());
		}
		
	}

	public static void main(String[] args) {
		EsSegment es = new EsSegment();
		es.getAccSegmentSumES();
	}

}
