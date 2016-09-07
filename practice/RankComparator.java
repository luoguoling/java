
import java.util.Comparator;
/**
 * @Description 奖牌排名比较器
 * 实现了Comparator接口
 * 这里就是面向接口编程的体现
 * java api只是定义了接口
 * 具体的排序逻辑需要我们自己实现
 * @author jingxiaobo
 * @date 2016年9月7日 下午12:00:23
 */
public class RankComparator implements Comparator<RankData> {

	@Override
	public int compare(RankData o1, RankData o2) {
		//金牌数多,排在前面
		if(o1.getGold() > o2.getGold()){
			return -1;
		//金牌数少,排在后面
		}else if(o1.getGold() < o2.getGold()){
			return 1;
		}
		//金牌数量一样，继续看银牌
		//银牌数多,排在前面
		if(o1.getSilver() > o2.getSilver()){
			return -1;
		//银牌数少,排在后面
		}else if(o1.getSilver() < o2.getSilver()){
			return 1;
		}
		//银牌数量一样，继续看铜牌
		//铜牌数多,排在前面
		if(o1.getSilver() > o2.getSilver()){
			return -1;
		//铜牌数少,排在后面
		}else if(o1.getSilver() < o2.getSilver()){
			return 1;
		}
		return 0;
	}

}
