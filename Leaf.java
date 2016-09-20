//package cn.galc.test;

public class Leaf {

    int i = 0;

    public Leaf(int i) {
        this.i = i;
    
    }

    Leaf increament() {
        i++;
        return this;
    
    }

    void print() {
        System.out.println("i = " + i);
    
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf(100);
        leaf.increament().print();
    
    }

}
