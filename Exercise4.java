
public class Exercise4 {

	public static void main(String[] args) {
		
		// 2. 1~20 정수 중 2, 3 배수가 아닌 수의 총합
		
		int num = 0, sum = 0;
		for(num=0;num<=20;num++) {
		if(num%2!=0 && num%3!=0) { // 처음에 2의 배수 또는 3의 배수라 ||를 썼는데 둘 다 빼야 해서 &&가 답임
			sum += num;
		}
		}
		System.out.printf("%d, %d%n", num, sum);

		// 3. 1+(1+2)+...(1+2+...+10) 결과
		
		int num2 = 0, sum2 = 0, sumsum = 0;
		for(num2=0;num2<=10;num2++) {
			sum2 += num2;
			sumsum += sum2;
		}
		System.out.println(sumsum);
		
		// 4. 1+(-2)+3+(-4)+... 총합 100이 되려면 몇까지 더해야 하는가?
		
		int num3 = 0, sum3 = 0, s = 1;
		for(int i=1;true;i++, s=-s) { // true 대신 sum3 <= 100도 가능, 100이 넘으면 중지니까
			num3 = s*i; // i에 마이너스 곱해서 양수는 음수, 음수는 양수로 바꿈
			sum3 += num3;
			if (sum3>=100)
			break;
		}
		System.out.printf("%d, %d%n", num3, sum3);
		
		
	} // main

}
