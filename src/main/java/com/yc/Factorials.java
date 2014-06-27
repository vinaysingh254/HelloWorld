package com.yc;
/**
*@author vinay singh
*organization Chetu India Pvt Ltd
*/
public class Factorials {
	public static void main(String[] args) {
	
		System.out.println(fact(7));
	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}
	public void testcase(){
	
		System.out.println("test case");
	}
}
