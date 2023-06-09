package Java_정석_객체지향개념;

public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result = mm.max(5, 3); // 둘 중에 큰값을 반환하는 메서드
		long result1 = mm.add(5L, 3L); // add 메서드 호출 
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(6);
		
		System.out.println("max(5L, 3L) = " + result);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath{
	void printGugudan(int dan) {
		if(!(2 < dan && dan < 10))
			return;
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
//		return;
	}
	long add(long a, long b) { // 메서드는 클래스 영역에만 정의 가능
		long result = a + b;
		return result;
		//return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	// 두 값을 받앙서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a, long b){
		if(a > b)
			return a; // 조건식이 참일때만 실행
		else
			return b;
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
}
