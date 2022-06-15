package day0523;

public class TvMain2 {

	public static void main(String[] args) {
		
		// int[] score = new int();
		
		Tv[] tvArr1 = new Tv[3];
		
//		score[0] = 90;
//		score[1] = 60;
		
		// 객체 배열 초기화방법 1
		tvArr1[0] = new Tv();
		tvArr1[1] = new Tv();
		tvArr1[2] = new Tv();
		
		// 객체 배열 초기화방법 2
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv()};
		
		// 객체 배열 초기화방법 3 (많을 때)
		Tv[] tvArr3 = new Tv[100]; // 객체 만들기
		
		for(int i=0; i<tvArr3.length; i++) {
			tvArr3[i] = new Tv(); // 인스턴스 생성
		}

	}

}
