package org.practice;

import org.testng.annotations.Test;

public class ParallelExecution {
	@Test
	public void Test1() {
		System.out.println("Test 1- Thread ID: "+Thread.currentThread().getId());
	}
		
	@Test
	public void Test2() {
		System.out.println("Test 2- Thread ID: "+Thread.currentThread().getId());
	}
	@Test
	public void Test3() {
		System.out.println("Test 3- Thread ID "+Thread.currentThread().getId());
	}
	
	
	}


