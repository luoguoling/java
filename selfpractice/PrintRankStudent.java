import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
//import Student;
public class PrintRankStudent{
	public static void main(String[] args){
		Comparator<Student> rankComparator = new RankStudent();
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("xiaohua",30));
		studentList.add(new Student("miaomiao",20));
		Collections.sort(student,rankComparator);
		int rank=1;
		for(RankStudent rankstudent:studentList){
			System.out.println(String.format("第{%d}年龄{%s}",rankstudent.getAge(),rankstudent.getName()));
		}
	}
}
