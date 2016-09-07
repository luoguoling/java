
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/**
 * @Description 奖牌榜排序实现
 * 利用了TreeSet
 * TreeSet 利用了Comparator
 * @author jingxiaobo
 * @date 2016年9月7日 下午12:06:14
 */
public class ChampionTestWithTreeSet {

	/**
	 * @Description 排序测试
	 * @param args 参数
	 * @return void
	 * @author jingxiaobo
	 * @date 2016年9月7日 下午12:06:59
	 */
	public static void main(String[] args) {
		Comparator<RankData> rankComparator = new RankComparator();
		/**奖牌数据Set<奖牌数据>*/
		Set<RankData> rankSet = new TreeSet<RankData>(rankComparator);
		rankSet.add(new RankData("中国", 300,200,100));
		rankSet.add(new RankData("美国", 300,400,100));
		rankSet.add(new RankData("日本", 500,200,100));
		//排名
		int rank = 1;
		for(RankData rankData : rankSet){
			System.out.println(String.format("第{%d}名是{%s}", rank++, rankData.getCountry()));
		}
	}

}
