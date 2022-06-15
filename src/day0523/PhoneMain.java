package day0523;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.name = "삼성 갤럭시 z플립";
		p.spec = "접는 휴대폰";
		p.cost = 1500000;
		
		p.phoneSpec();
		
		Phone p1 = new Phone();
		
		p1.name = "아이폰";
		p1.spec = "감성적인 디자인";
		p1.cost = 1400000;
		
		p1.phoneSpec();

	}

}
