import java.math.BigInteger;

public class Object {
	
	int level, p, q; //level - степень возведения
	BigInteger Remains = new BigInteger("1"); //Остатки от первого деления (A', B')
	BigInteger RemainFromObject = new BigInteger ("1"); //Остаток от другого объекта
	BigInteger Key = new BigInteger ("1");
	
	public void addNumbers (int Level, int P, int Q) { //Добавляем данные для подсчета ключа Алисы и Боба
		
		level = Level;
		q = Q;
		p = P;
		
	}
	
	public int GetRemains () { //Считаем остаток
		
		BigInteger BigRemain = new BigInteger(Integer.toString(q));
		Remains = BigRemain;
		BigInteger BigLevel = new BigInteger(Integer.toString(level));
		BigInteger BigP = new BigInteger(Integer.toString(p));
		Remains = Remains.modPow(BigLevel, BigP);
		return Remains.intValue();
	
	}
	
	public void AddRemain (int remain) { //Вносим остаток
		BigInteger Big = new BigInteger (Integer.toString(remain));
		RemainFromObject = Big;
		
	}
	
	public void GetKey () {
		BigInteger BigLevel = new BigInteger(Integer.toString(level));
		BigInteger BigP = new BigInteger(Integer.toString(p));
		Key = RemainFromObject.modPow(BigLevel, BigP);
		
	}
	
	public int ReturnKey() {
		
		return Key.intValue();
		
	}

}
