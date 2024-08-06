package Sets;
import java.util.*;
public class HashsetDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet hash = new HashSet();
	String s = sc.nextLine();
	String[] arr = s.split(" ");
	int[] arr1=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr1[i]=Integer.parseInt(arr[i]);
		hash.add(arr1[i]);
	}
	
		System.out.println(hash.size());
	

	}

}
