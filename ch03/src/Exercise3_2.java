
public class Exercise3_2 {

	public static void main(String[] args) {
		
		int numOfApples = 120; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = ((numOfApples / sizeOfBucket) + (numOfApples % sizeOfBucket == 0 ? 0 : 1) /* (1) */ ); // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
		

	}

}
