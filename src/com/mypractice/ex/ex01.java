package com.mypractice.ex;

public class ex01 {

	public static void main(String[] args) {
		
		
		//int[] num = new int[] {50,60,70,80};
		
		int [] num = new int[3];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		System.out.println(num[2]); // 방의 갯수와 값은 지정해줬지만 단순히 num만 출력하라고 하면 뭘 출력해야 할지 몰라서 오류나는거같은디 아닌가
		
		for (int i=0; i < num.length; i++) {
			System.out.print(num[i] + "  ");       // 반복되면서 i의 값이 num.length(방갯수)보다 작기 때문에 0,1,2 로 인식되어서 결국 num[0] 부터 num[2]까지의 주소 안에 있는 값이 출력되는거 같음.
		}
		
		

	}

}
