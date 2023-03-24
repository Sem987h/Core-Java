
public class TypeCasting 
{
	public static void main(String[] args) 
	{
		int i=10;
		long l;
		
		l=i;
		System.out.println("Implicit is.. "+l);
		
		byte b=123;
		int a;
		
		a=b;
		System.out.println("Implicit is.. "+a);
		
		int x=(int)l;
		System.out.println("Explicit is.. "+x);
		
		int z=513;
		byte bb=(byte)z;
		System.out.println("explicit is.. "+bb);
	}
}
