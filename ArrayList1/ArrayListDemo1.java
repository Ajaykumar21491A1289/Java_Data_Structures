package ArrayList1;
import java.util.*;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(2);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        System.out.println(l);//[10, 2, 30, 40, 50, 60]
        l.add(1,20);
        System.out.println(l);//[10, 20, 2, 30, 40, 50, 60]
        l.remove(6);
        System.out.println(l);//[10, 20, 2, 30, 40, 50]
        l.remove(4);
        System.out.println(l);//[10, 20, 2, 30, 50]
        System.out.println(l.get(0));//10
        l.set(0, 100);
        System.out.println(l.size());//5
        System.out.println(l.isEmpty());//false
        System.out.println(l.contains(30));//true
        System.out.println(l.indexOf(100));//0
        Object[] arr = l.toArray();
        System.out.println(arr);
	}

}
