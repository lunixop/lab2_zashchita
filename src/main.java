
public class main {

	public static void main(String[] args) {
		
		TheSieveOfEratosthenes numbers = new TheSieveOfEratosthenes();
		Object Alice = new Object(); //������� �����
		Object Bob = new Object(); //������� ���
		
		numbers.GenerateSimpleNumber();
		int p = numbers.ReturnSimpleNumber(numbers.ReturnSize() - 1); //���������� ��������� ����� �� �������
		numbers.GenerateSimpleNumber();
		int q = numbers.ReturnSimpleNumber(numbers.ReturnSize() - 1); //p � � ���� ��������
		numbers.GenerateSimpleNumber();
		int a = numbers.ReturnSimpleNumber(numbers.ReturnSize() - 1); 
		numbers.GenerateSimpleNumber();
		int b = numbers.ReturnSimpleNumber(numbers.ReturnSize() - 1); //a � b �������� ������ ����� � ����
		
		System.out.println("����� p = " + p + "\n" +
						   "����� q = " + q + "\n" +
				           "����� a = " + a + "\n" +
						   "����� b = " + b + "\n");
		
		Alice.addNumbers(a, p, q);
		Bob.addNumbers(b, p, q);
		int A = Alice.GetRemains();
		int B = Bob.GetRemains();
		
		System.out.print("������� A = " + A + "\n" +
				         "������� B = " + B + "\n");
		
		Bob.AddRemain(A);
		Alice.AddRemain(B);
		Alice.GetKey();
		Bob.GetKey();
		
		System.out.print("���� ����� = " + Alice.ReturnKey() + "\n" +
		                 "���� ����  = " + Bob.ReturnKey()   + "\n");

	}

}
