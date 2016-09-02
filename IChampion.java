import java.util.Map;
interface IChampion{
	//计算权重
	public Map<String,Integer> countPri(Map<String,Integer> map1,Map<String,Integer> map2);
	//根据权重进行排序
	public void sortChampion(Map<String,Integer> map);
}
