
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/**
 * @Description 奖牌榜排序实现
 * 利用了TreeMap
 * TreeMap 利用了Comparator
 * @author jingxiaobo
 * @date 2016年9月7日 下午12:06:14
 */
public class ChampionTestWithTreeMap {

	/**
	 * @Description 排序测试
	 * @param args 参数
	 * @return void
	 * @author jingxiaobo
	 * @date 2016年9月7日 下午12:06:59
	 */
	public static void main(String[] args) {
		Comparator<RankData> rankComparator = new RankComparator();
		/**奖牌数据Map<奖牌数据, 国家名称>*/
		Map<RankData, String> rankMap = new TreeMap<RankData, String>(rankComparator);
		rankMap.put(new RankData("中国", 300,200,100), "中国");
		rankMap.put(new RankData("美国", 300,400,100), "美国");
		rankMap.put(new RankData("日本", 500,200,100), "日本");
		//排名
		int rank = 1;
		for(String country : rankMap.values()){
			System.out.println(String.format("第{%d}名是{%s}", rank++, country));
		}
	}

}
