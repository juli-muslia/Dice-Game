import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		
		// Krijimi i objektit randomNumber
		Random randomNumber = new Random();
		// Deklarimi i variablit x ku do te ruhet numri i gjeneruar  
		// Numrin 6 mund ta zevendesojme me cfare numri te duam
		int x = randomNumber.nextInt(6) +1 ;
		//afishimi
		System.out.println("Numri jot: " + x);

	}

}
