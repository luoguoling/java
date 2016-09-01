//package com.moloong.rolin;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class TestCollection{
    public static void main(String[] args){
//List的实现
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        System.out.println("链表的长度为::::" + list.size()+ list);
        //用foreach循环输出
        for(String str:list){
            System.out.println(str);
        }
       //把链表变为数组输出
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++)
        {
            System.out.println(strArray[i]);
        }
        //使用迭代器输出
        Iterator<String> ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
//Set的实现
        Set<String> set = new HashSet<String>();
        set.add("china");
        set.add("hongkong");
        set.add("china");
        System.out.println("集合的长度为::::" + set.size() + set);
        //使用集合直接遍历
        for (String str:set){
            System.out.println(str);
        }
       //转为为数组遍历
        String[] strArray1 = new String[set.size()];
        strArray1 = set.toArray(strArray1);
        for (String str:strArray1){
            System.out.println(str);
        }
       //使用迭代器进行遍历
       Iterator ite2 = set.iterator();
       while(ite2.hasNext()){
           System.out.println(ite2.next());
       }
       Map<String,String> map = new HashMap<String,String>();
       map.put("nation","china");
       map.put("location","asia");
       System.out.println("map长度：：：" + map.size()+ map);
       Iterator ite3 = map.entrySet().iterator();
       while(ite3.hasNext()){
           Map.Entry entry = (Map.Entry)ite3.next();
           Object key = entry.getKey();
           Object value = entry.getValue();
           System.out.println(key + "的值是:::"+ value);
       }
       
       


    }





}
