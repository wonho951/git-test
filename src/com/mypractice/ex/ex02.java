package com.mypractice.ex;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
			
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("arrA값" + arrA[i]);
			//arrB[i] = arrA[i];
		}
		
		System.out.println("================");
		
		int[] arrB = new int[4]; // int[] arrB = arrA; --> 비교해보기
								// []안의 값을 A의 방크기보다 크게 줄 경우 방크기에 상관없이
								// arrA의 값만 복사됨. 나머지는 기본값이라 출력되지 않음.
		
		for(int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		//arrA출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
			
		}
		
		System.out.println("--------------------------");
		
		//arrB출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrB[i]);		
		}
		
		System.out.println("================");
		
		//arrA[1] : 6-->100으로 변경     arrA만 변경되고 arrB는 변경 안되는거 확인
		
		arrA[1] = 100;									// arrA[1]의 값만 바꿨을때 arrA[1]의 값만 바뀜
		
		
		//arrA출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("--------------------------");
		
		
		//arrB출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrB[i]);		
		}
	}

}
