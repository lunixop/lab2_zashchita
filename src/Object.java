import java.math.BigInteger;

public class Object {
	
	int level, p, q; //level - ������� ����������
	BigInteger Remains = new BigInteger("1"); //������� �� ������� ������� (A', B')
	BigInteger RemainFromObject = new BigInteger ("1"); //������� �� ������� �������
	BigInteger Key = new BigInteger ("1");
	
	public void addNumbers (int Level, int P, int Q) { //��������� ������ ��� �������� ����� ����� � ����
		
		level = Level;
		q = Q;
		p = P;
		
	}
	
	public int GetRemains () { //������� �������
		
		BigInteger BigRemain = new BigInteger(Integer.toString(q));
		Remains = BigRemain;
		BigInteger BigLevel = new BigInteger(Integer.toString(level));
		BigInteger BigP = new BigInteger(Integer.toString(p));
		Remains = Remains.modPow(BigLevel, BigP);
		return Remains.intValue();
	
	}
	
	public void AddRemain (int remain) { //������ �������
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
