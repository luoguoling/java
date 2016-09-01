import java.util.*;
public class TestVecotr{
    public static void main(String[] args){
        Vector v = new Vector();
        System.out.println(v.capacity());
        v.add(new Integer(1));
        v.add(new Integer(2));
        Enumeration en = v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement() + " ");
        }

    }



}
