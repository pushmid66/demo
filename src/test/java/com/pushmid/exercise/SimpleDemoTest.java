package com.pushmid.exercise;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleDemoTest {

	@Test
	public void test0() {
		int i, j, count = 10;
		int arr[] = new int[count];

		System.out.println("生成10个整数为：");
		for (i = 0; i < count; i++) {
			arr[i] = (int) (Math.random()*1000);
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
		System.out.println("进行冒泡排序为：");
		for (i = 0; i < count; i++) {
			for (j = 0; j < count-1-i; j++) {
				if (arr[j] < arr[j+1]) {
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
