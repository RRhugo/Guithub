package sencillo;
public class GuitHub {
		
	public static void main(String[] args)
	{
		int x = 0;
		
		if (x == 0) {
			
			System.out.print("Hello World");
			x--;
		}
		
		System.out.println("Hola usuario bienvenido");
		System.out.println("A continuación se muestra una cuenta regresiva");
		
		for (int i = 10; i >= 1;  i--)
		{
		    System.out.println(i);
		}
		
		System.out.println("Ahora, otra cuenta progresiva:");
		
		for (int i = 10; i >= 1;  i++)
		{
		    System.out.print(i);
		}
}
}
