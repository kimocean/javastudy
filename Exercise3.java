
public class Exercise3 {

	public static void main(String[] args) {
		// 3-2
		
		int numOfApples = 120; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = ((numOfApples / sizeOfBucket) + (numOfApples % sizeOfBucket == 0 ? 0 : 1) /* (1) */ ); // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
		

		// 3-3
		
		int num = 10;
		System.out.println(num > 0 ? "���" : (num == 0 ? 0 : "����") /* (1) */ );
		
		// 3-4
		
		int num2 = 456;
		System.out.println(num2 / 100 * 100 /* (1) */ ); // int ������ �Ҽ��� �Ʒ� ����
		System.out.println(num2 - num2 % 100 /* (1) */ ); // num2���� 100 ���� �������� �� ��
		
		// 3-5
		
		int num3 = 333;
		System.out.println(num3 / 10 * 10 + 1 /* (1) */ );
		
		// 3-6
		
		int num4 = 24;
		System.out.println(10 - num4 % 10 /* (1) */ ); // ó�� ���� ���� (num4 - (num4 % 10) + 10) - num4 ���µ� �����ϰ� 10 ������ ������ ���� ��
		
		// 3-7
		int fahrenheit = 100;
		float celcius = ((int)((5/9f*(fahrenheit-32))*100+0.5)/ 100f /* (1) */ );
		// �Ҽ��� �Ʒ� 2�ڸ� �츮�� ���� *100(37.77778*100=3777.778), �ݿø� +0.5(3778.278, �ݿø� �� �Ǹ� ���ص� ���� ����), int ��ȯ(3778), 100f�� ������(37.78, �Ҽ��� �츮����)
		System.out.println(celcius); // ((int)((5/9*(fahrenheit-32))*100+0.5)/ 100f /* (1) */ );
	}

}
