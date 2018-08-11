package cn.itheima.sort;

import java.util.Arrays;

public class Demo {

	public static void sort(int[] arr) {
		
		int temp = 0;
		boolean flag = true;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1- i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = false;
				}
			}
			if(flag) {
				break;
			}
		}
	}
	
	public static void sort2(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length -1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 6, 2, 7, 4, 9, 5 };
		sort2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
