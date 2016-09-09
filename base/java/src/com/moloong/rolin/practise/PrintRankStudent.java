package com.moloong.rolin.practise;
//����ѧ�������ѧ����������ѧϰ��Comparator Collections.sort �ӿ�ʵ�� ���൱��һ�����ݽṹ
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
			System.out.println(String.format("��{%d}��������{%s}",rankstudent.getAge(),rankstudent.getName()));
		}
	}
}
