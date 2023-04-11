// 주사위의 눈의 수(1~6)는 이것이다. 10번 던져서
// 1의 눈이 나오면 500원,
// 2의 눈이 나오면 1000원,
// 3의 눈이 나오면 1500원,
// 4의 눈이 나오면 2000원,
// 5의 눈이 나오면 2500원,
// 6의 눈이 나오면 3000원,
// 전체 금액은 얼마인가?
package pack05;

public class RandomEx {

	public static void main(String[] args) {
		int balance = 0;
		int rn;
		for(int i = 0; i < 10; i++) {
			rn = (int)(Math.random()*6+1);
			System.out.print(rn+" ");
			balance += rn * 500;
		
		}
		System.out.println(balance);
	}
}
