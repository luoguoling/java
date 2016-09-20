//定义学生类
public class Student{
    //定义学生的名字
    private String name;
    //定义学生的年龄
    private int age;
    public Student(){

    }
    public Student(String name,int age){
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
}
