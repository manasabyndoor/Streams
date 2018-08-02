package com.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LambdaTestClass {
	public static void main(String[] args) throws IOException {
		LambdaExpression lambda = new LambdaExpression();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ret=0;
		int T = Integer.parseInt(br.readLine());

		// references for interface
		performOperation op;
		
		String ans = null;
		while (T --> 0) {
			
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num=Integer.parseInt(st.nextToken());

			if(ch==1)
			{
				
			op = lambda.checkEvenOdd();
			// sending the values to check the number is even or odd
			ret = lambda.checker(op, num);
			ans=((ret == 0) ? "Even" : "Odd");
			}
			else if(ch==2){
				
			
			op= lambda.checkPalindrome();
			ret = lambda.checker(op, 121);
			 ans =((ret == 0) ? "Palindrome" : "Not palindrome");
			}
			else if(ch==3)
			{
			op = lambda.checkPrime();
			// Prime or not
			ret = lambda.checker(op, 23);
			ans  = ((ret == 0) ? "Prime" : "Not prime");
			}
			System.out.println(ans);
		}

	}
}
