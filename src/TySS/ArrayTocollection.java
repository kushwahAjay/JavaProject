package TySS;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTocollection {

	public static void main(String[] args) {
		Integer [] arr= {4,5,6,7,8};
		ArrayList lst= new ArrayList<>(Arrays.asList(arr));
		System.out.println(lst);
		lst.add(9);
		
		lst.add('A');
		System.out.println(lst);

	}

}
