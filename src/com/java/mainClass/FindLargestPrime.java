package com.java.mainClass;


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindLargestPrime {
	static int len;

	public void test() {
		int n = 1000;
		int[] maxPrime = new int[1000];
		int a[] = new int[1000];
		int index = 0;
		for (int i=1;i<n;i++){
			len = getIntegerlength(i);
			if(isPrime(i)){
				if(areAllDigitsPrime(i)){
					maxPrime[++index] = i;
				}
			}
		}
		System.out.println("*******************");
		int primeNumCount = 0;
		List<Integer> list = new ArrayList();
		for(int i=0;i<100;i++){
			if (maxPrime[i] != 0){
				primeNumCount++;
				list.add(maxPrime[i]);
			}
		}

		Collections.sort(list);
		System.out.println(">>>>>the num is: "+list);
		System.out.println(">>>>>the num is: "+list.get(list.size()-1));

	}


	public boolean areAllDigitsPrime(int j){
		int[] arr = new int[len];
		int m =j;
		boolean s = false;
		int chk[] = new int[len];
		for (int k =0;k<len;k++){
			int ll = m%10;
			arr[k] = ll;
			if(!isPrime(arr[k])){
				chk[0] =-1;
			}
			m= m/10;
		}
		if(chk[0] != -1){
			s = true;
			//  maxPrime[++index] = i;
		}
		return s;
	}
	public int getIntegerlength(int j){
		int len =0;
		while(j>0){
			j= j/10; 
			len++;
		}
		return len;
	}

	public  boolean isPrime(int n){
		boolean isPrime = true;
		if (n==0 || n== 1 || n==2 || n==4){
			return false;
		}

		for(int i=2;i<n/2; i++){
			if(n%i == 0){
				isPrime = false;
				break;
			}
		}
		//  System.out.println("isPrime "+n +" "+isPrime);
		return isPrime;
	}
}


