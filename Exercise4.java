
public class Exercise4 {

	public static void main(String[] args) {
		
		// 2. 1~20 ���� �� 2, 3 ����� �ƴ� ���� ����
		
		int num = 0, sum = 0;
		for(num=0;num<=20;num++) {
		if(num%2!=0 && num%3!=0) { // ó���� 2�� ��� �Ǵ� 3�� ����� ||�� ��µ� �� �� ���� �ؼ� &&�� ����
			sum += num;
		}
		}
		System.out.printf("%d, %d%n", num, sum);

		// 3. 1+(1+2)+...(1+2+...+10) ���
		
		int num2 = 0, sum2 = 0, sumsum = 0;
		for(num2=0;num2<=10;num2++) {
			sum2 += num2;
			sumsum += sum2;
		}
		System.out.println(sumsum);
		
		// 4. 1+(-2)+3+(-4)+... ���� 100�� �Ƿ��� ����� ���ؾ� �ϴ°�?
		
		int num3 = 0, sum3 = 0, s = 1;
		for(int i=1;true;i++, s=-s) { // true ��� sum3 <= 100�� ����, 100�� ������ �����ϱ�
			num3 = s*i; // i�� ���̳ʽ� ���ؼ� ����� ����, ������ ����� �ٲ�
			sum3 += num3;
			if (sum3>=100)
			break;
		}
		System.out.printf("%d, %d%n", num3, sum3);
		
		
	} // main

}
