package com.demo.spring.basics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.spring.basics.springin10steps.basic.BinarySearchImpl;
import com.demo.spring.basics.springin10steps.basic.BubbleSortAlgorithm;

@SpringBootApplication
public class SpringIn10StepsBaseApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringIn10StepsBaseApplication.class, args);
		BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgorithm());
		
		int result=binarySearch.binarySearch(new int[] {12,4,6},3);
		
		System.out.println(result);
		
		SpringApplication.run(SpringIn10StepsBaseApplication.class, args);
	}

}
