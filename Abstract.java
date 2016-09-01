public class Abstract{
    public static void main(String[] args){
        Student s = new Student("xiaohua",33,33);
        System.out.println(s.getName() + " " + s.getAge()+" "+s.getScore() + " " + s.getAbstract());      
	System.out.println(s.PrintA());

    }
}
//定义抽象类
abstract class Person{
    public int a = 5;
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    //定义抽象方法
    public abstract String getAbstract();
}
class Student extends Person{
    private int score;
    public Student(String name,int age,int score){
        super(name,age);
        setScore(score);
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }
    public void printA(){
        System.out.println(a);
    }
    String bookName="小明同学";
//抽象方法的实现
    public String getAbstract(){
        return bookName;
    }
    
}
