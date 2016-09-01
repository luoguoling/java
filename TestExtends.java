public class TestExtends{
    public static void main(String[] args){
        B b = new B();
        b.printA();       
    }

}
class A{
    int a = 5;
}
class B extends A{
    public void printA(){
        System.out.println(a);
    }
}
