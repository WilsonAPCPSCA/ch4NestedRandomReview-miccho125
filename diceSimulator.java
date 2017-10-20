import java.util.Scanner;
public class diceSimulator {
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("How many dice would you like to be tossed? ");
		int rolls = in.nextInt();
		int value;
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
		int seven=0;
		int eight=0;
		int nine=0;
		int ten=0;
		int eleven=0;
		int twelve=0;
		System.out.println("Here are the numbers: ");
		for(int i = 0; i < rolls; i++){
			value = (int )(Math.random() * 12 + 2);
			System.out.print(value + " ");
			if(value == 2){
				two++;
			}
			if(value == 3){
				three++;
			}
			if(value == 4){
				four++;
			}
			if(value == 5){
				five++;
			}
			if(value == 6){
				six++;
			}
			if(value == 7){
				seven++;
			}
			if(value == 8){
				eight++;
			}
			if(value == 9){
				nine++;
			}
			if(value == 10){
				ten++;
			}
			if(value == 11){
				eleven++;
			}
			if(value == 12){
				twelve++;
			}
		}System.out.println();
		System.out.print("2: ");
		for(int i = 0; i<two; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("3: ");
		for(int i = 0; i<three; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("4: ");
		for(int i = 0; i<four; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("5: ");
		for(int i = 0; i<five; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("6: ");
		for(int i = 0; i<six; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("7: ");
		for(int i = 0; i<seven; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("8: ");
		for(int i = 0; i<eight; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("9: ");
		for(int i = 0; i<nine; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("10: ");
		for(int i = 0; i<ten; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("11: ");
		for(int i = 0; i<eleven; i++){
			System.out.print("* ");
		}System.out.println();
		System.out.print("12: ");
		for(int i = 0; i<twelve; i++){
			System.out.print("* ");
		}
	} 
}