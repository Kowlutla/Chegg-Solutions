package intBuffer;

public class IntBuffDemo {

	public static void main(String[] args) {

		IntBuff buff=new IntBuff(5);
		buff.append(10);
		buff.println();
		buff.append(20);
		buff.println();
		buff.delete(0);
		buff.println();
		buff.insert(3, 30);
		buff.println();

	}

}
