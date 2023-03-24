
public class ConveresionDemo {

	public static void main(String[] args) {
		int i = 10;// 4 bytes
		long l; // 8 bytes

		l = 7;// implicit
		System.out.println("Implicit is.. " + l);

		int x;
		x = (int) l;// explicit

		System.out.println();

		int z = 128;
		byte b = (byte) z;
		System.out.println("Byte value is.. " + b);
	}

}
