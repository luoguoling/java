//判断谁是冠军
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
public class Champion{
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
		//对金牌的权值赋予100
		
		Map<String,Integer> A100 = new HashMap<String,Integer>();
		Iterator iteA = A.entrySet().iterator();
		while(iteA.hasNext()){
			Map.Entry entry = (Map.Entry)iteA.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			String key1 =(String)key;
			int value1 = (Integer)value * 100;
			A100.put(key1,value1);
			
		}
		System.out.println(A100);
		//对银牌的权值赋予10
		Map<String,Integer> B10 = new HashMap<String,Integer>();
		Iterator iteB = B.entrySet().iterator();
		while(iteB.hasNext()){
			Map.Entry entry = (Map.Entry)iteB.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			String keyB = (String)key;
			int valueB = (Integer)value * 10;
			B10.put(keyB,valueB);
		}
		System.out.println(B10);
		
		/**
		Iterator iteA = A.entrySet().iterator();
		Iterator iteB = B.entrySet().iterator();
		//定义一个新的Map
		Map<String,Integer> C = new HashMap<String,Integer>();
		while(iteA.hasNext()){
			System.out.println("ccccccccc");
			Map.Entry entryA = (Map.Entry)iteA.next();
			Object keyA = entryA.getKey();
			Object valueA = entryA.getValue();
			while(iteB.hasNext()){
				Map.Entry entryB = (Map.Entry)iteB.next();
//				Object keyA = entryA.getKey();
			//	Object keyB = entryB.getKey();
			//	Object valueA = entryA.getValue();
			Object valueB = entryB.getValue();
			System.out.println("keyA:  "+ keyA  + "valueA:  " + valueA + "valueB:  " + valueB);
			String keyAA = (String)keyA;
			int valueAA = (Integer)valueA * 100;
			int valueBB = (Integer)valueB * 10;
			int valueCC = valueAA + valueBB;
			System.out.println("key的值是：" + keyA + " " + "value的值是:::" + valueCC);
			C.put(keyAA,valueCC);
			}
		}
		System.out.println("C的值是::::::"+ C);
*/
		
}	
}
