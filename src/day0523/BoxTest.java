package day0523;

public class BoxTest {

	public static void main(String[] args) {

		Box b = new Box();
		
		b.width = 20;
		b.length = 20;
		b.height = 30;
		
		System.out.println("상자의 가로, 세로, 높이값은 " + b.width + ", " + b.length + ", " + b.height + "입니다.");

	}

}
