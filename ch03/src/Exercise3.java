
public class Exercise3 {

	public static void main(String[] args) {
		// 3-2
		
		int numOfApples = 120; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ((numOfApples / sizeOfBucket) + (numOfApples % sizeOfBucket == 0 ? 0 : 1) /* (1) */ ); // 모든 사과를 담는데 필요한 바구니의 수
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		

		// 3-3
		
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num == 0 ? 0 : "음수") /* (1) */ );
		
		// 3-4
		
		int num2 = 456;
		System.out.println(num2 / 100 * 100 /* (1) */ ); // int 나누면 소숫점 아래 버림
		System.out.println(num2 - num2 % 100 /* (1) */ ); // num2에서 100 나눈 나머지를 뺀 거
		
		// 3-5
		
		int num3 = 333;
		System.out.println(num3 / 10 * 10 + 1 /* (1) */ );
		
		// 3-6
		
		int num4 = 24;
		System.out.println(10 - num4 % 10 /* (1) */ ); // 처음 적은 답은 (num4 - (num4 % 10) + 10) - num4 였는데 정리하고 10 앞으로 보내면 같은 식
		
		// 3-7
		int fahrenheit = 100;
		float celcius = ((int)((5/9f*(fahrenheit-32))*100+0.5)/ 100f /* (1) */ );
		// 소숫점 아래 2자리 살리기 위해 *100(37.77778*100=3777.778), 반올림 +0.5(3778.278, 반올림 안 되면 더해도 영향 없음), int 변환(3778), 100f로 나누기(37.78, 소숫점 살리려고)
		System.out.println(celcius); // ((int)((5/9*(fahrenheit-32))*100+0.5)/ 100f /* (1) */ );
	}

}
