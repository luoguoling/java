
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @Description 奖牌榜排序实现
 * 利用了ArrayList
 * ArrayList 利用了Collections的sort方法
 * Collections的sort方法利用了Comparator
 * @author jingxiaobo
 * @date 2016年9月7日 下午12:06:14
 */
public class ChampionTestWithArrayList {

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
		List<RankData> rankList = new ArrayList<RankData>();
		rankList.add(new RankData("中国", 300,200,100));
		rankList.add(new RankData("美国", 300,400,100));
		rankList.add(new RankData("日本", 500,200,100));
		//排序
		Collections.sort(rankList, rankComparator);
		//排名
		int rank = 1;
		for(RankData rankData : rankList){
			System.out.println(String.format("第{%d}名是{%s}", rank++, rankData.getCountry()));
		}
	}

}
