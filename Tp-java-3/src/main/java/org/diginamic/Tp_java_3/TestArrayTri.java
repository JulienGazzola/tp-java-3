package org.diginamic.Tp_java_3;
import java.util.Arrays;

public class TestArrayTri {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		Arrays.sort(array);
		for (int i = 0; i < array.length ;i++){
			System.out.println(array[i]);
		}
	}
}
