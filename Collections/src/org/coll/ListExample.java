package org.coll;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1000000l);
        a.add(124522456.45125d);
        a.add("Abhishek");
        a.add('M');
        a.add(2451.452d);
        a.add("New Delhi");
        
        System.out.println(a);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c);
                
	}

}
