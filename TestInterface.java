//接口
public class TestInterface{
    public static void main(String[] args){
    Person p = new Person();
    p.setMove();
    p.setSing();
    p.setEat(); 
    }

}
//定义接口
interface IPerson{
    static int cc = 33;
    final int bb = 44;
    public void setMove();
    public void setSing();
    public void setEat();

}
//接口实现
class Person implements IPerson{
    
    public void setMove(){
        System.out.println("i can move" + cc);
    }
    public void setSing(){
        System.out.println("i can sing" + bb);
    }
    public void setEat(){
        System.out.println("i can eat");
    }



}
