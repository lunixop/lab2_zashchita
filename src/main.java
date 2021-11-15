
public class main {

	public static void main(String[] args) {
		
		TheSieveOfEratosthenes numbers = new TheSieveOfEratosthenes();
		Object Alice = new Object(); //Человек Алиса
		Object Bob = new Object(); //Человек Боб
		
		numbers.GenerateSimpleNumber();
		int p = numbers.ReturnSimpleNumber(numbers.ReturnSize() - 1); //Возвращаем последнее число из массива
		numbers.GenerateSimpleNumber();
		int q = numbers.ReturnSimpleNumber(numbers.ReturnSize() - 1); //p и й всем известны
		numbers.GenerateSimpleNumber();
		int a = numbers.ReturnSimpleNumber(numbers.ReturnSize() - 1); 
		numbers.GenerateSimpleNumber();
		int b = numbers.ReturnSimpleNumber(numbers.ReturnSize() - 1); //a и b известны только Алисе и Бобу
		
		System.out.println("Число p = " + p + "\n" +
						   "Число q = " + q + "\n" +
				           "Число a = " + a + "\n" +
						   "Число b = " + b + "\n");
		
		Alice.addNumbers(a, p, q);
		Bob.addNumbers(b, p, q);
		int A = Alice.GetRemains();
		int B = Bob.GetRemains();
		
		System.out.print("Остаток A = " + A + "\n" +
				         "Остаток B = " + B + "\n");
		
		Bob.AddRemain(A);
		Alice.AddRemain(B);
		Alice.GetKey();
		Bob.GetKey();
		
		System.out.print("Ключ Алисы = " + Alice.ReturnKey() + "\n" +
		                 "Ключ Боба  = " + Bob.ReturnKey()   + "\n");

	}

}
