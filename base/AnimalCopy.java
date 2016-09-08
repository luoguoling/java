//继承接口
package com.moloong.rolin;
public class Animal implements IAnimal{
    public void eat(){
        System.out.println("i am eating");
    }
    public void travel(){
        System.out.println("i am traveling");
    }
    public static void main(String[] args){
        Animal a = new Animal();
        a.eat();
        a.travel();
    }



}
