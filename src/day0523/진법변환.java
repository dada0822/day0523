package day0523;

public class 진법변환 {

	public static void main(String[] args) {

		/* 10진수를 2진수로 변환하는 코드
		 * 10진수 10을 2진수로 변환 */
		
		int[] arr = new int[8]; // 결과를 저장하기 위한 배열
		int num = 10;
		int i = 0;
		
//		for (int i=0; i<arr.length; i++) {
//		arr[i] = num % 2;
//		num /= 2;
//	}
		
		while(i<8) {
			arr[i++] = num % 2;
//			i++;
			num /= 2; // num = num / 2
		}
		
		for (i=7; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
