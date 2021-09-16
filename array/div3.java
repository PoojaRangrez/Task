package com.xworkz.array;

public class div3 {

	public static void main(String[] args) {
		int sumTotal[]= {3,6,9,12,25,18,21,24,27,30};
		System.out.println("Total sum of all index values which is divisble by 3 are:");
		int total=0;
		for(int i=0;i<sumTotal.length;i++)
			if(i%3==0) {
				total=total+sumTotal[i];
			}
        System.out.println(total);
	}

}
