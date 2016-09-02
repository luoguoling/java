import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
//关于奥运排名的接口的具体实现
public class Champion implements IChampion{
	public static void main(String[] args){
		//存储金牌记录
		Map<String,Integer> A = new HashMap<String,Integer>();
		A.put("American",30);
		A.put("England",27);
		A.put("China",25);
		A.put("Russia",25);
		//存储银牌记录
		Map<String,Integer> B = new HashMap<String,Integer>();
		B.put("American",20);
		B.put("England",30);
		B.put("China",30);
		B.put("Russia",20);		
		//调用方法的具体实现
		//计算新构建的带有权重值的Mapi
		System.out.println(A + "   " +B);
		countPri(A,B);
		System.out.println(countPri(A,B));
		//对新构建的Map的value进行排序
		sortChampion(countPri(A,B));
		
	}
	//对接口方法的具体实现
	//计算权重值
	public Map<String,Integer> countPri(Map<String,Integer> map1,Map<String,Integer> map2){
		Iterator iteA = A.entrySet().iterator();
		Iterator iteB = B.entrySet().iterator();
		//定义一个新的Map,存储计算过权重值的Map对象
		Map<String,Integer> C = new HashMap<String,Integer>();
		while(iteA.hasNext()){
		    System.out.println("ccccccccc");
		    Map.Entry entryA = (Map.Entry)iteA.next();
		    while(iteB.hasNext()){
			Map.Entry entryB = (Map.Entry)iteB.next();
            		Object keyA = entryA.getKey();
			Object keyB = entryB.getKey();
			Object valueA = entryA.getValue();
			Object valueB = entryB.getValue();
			System.out.println("keyA:  "+ keyA  + "valueA:  " + valueA + "valueB:  " + valueB);
			String keyAA = (String)keyA;
			int valueAA = (Integer)valueA * 100;
			int valueBB = (Integer)valueB * 10;
			int valueCC = valueAA + valueBB;
			System.out.println("key的值是：" + keyA + " " + "value的值是:::" + valueCC);
			C.put(keyAA,valueCC);
            
    		}
		return C;
            
	}	
	}
	//根据权重值进行排序
	public void sortChampion(Map<String,Integer> map){
		System.out.println("还没具体实现呢。。。。");

	}
}
