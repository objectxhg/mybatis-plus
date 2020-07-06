package com.xhg.plus;

import static org.assertj.core.api.Assertions.entry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusApplicationTests {

	@Test
	void contextLoads() {

		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");

		map.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		});

		int arr[] = { 2, 4, 1, 5, 7, 9, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int number = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = number;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(demo(5));
	}
	
	public static int demo(int a) {
		
		if(a < 1) {
			System.out.println("ERROR");
			return 0;
		}else if(a == 1 || a == 2){
			return a;
		}else {
			return a * demo(a - 1);
		}
		
	}

}
