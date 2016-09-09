package com.moloong.rolin.practise;
//按照学生年龄对学生进行排序，学习点Comparator Collections.sort 接口实现 将类当做一个数据结构
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class PrintRankStudent{
	public static void main(String[] args){
		Comparator<Student> rankComparator = new RankStudent();
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("xiaohua",30));
		studentList.add(new Student("miaomiao",20));
		studentList.add(new Student("rolin",30));
		Collections.sort(studentList,rankComparator);
		int rank=1;
		for(Student rankstudent:studentList){
			System.out.println(String.format("第{%d}的岁数是{%s}",rankstudent.getAge(),rankstudent.getName()));
		}
	}
}
