import java.util.Scanner;
public class coinFlipper {
	 public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.print("How many coins do you want to flip? ");
		int coins = in.nextInt();
		int heads = 0;
		int tails = 0;
		System.out.println("");
		Double x;
			for(int i = 0;i<coins;i++ ){
				x = Math.random();
				if(x<0.5){
					tails++;
					System.out.print("T ");
				}else if(x>0.5){
					heads++;
					System.out.print("H ");
				}
			}
			System.out.println();
		System.out.println("You had " + heads + " heads and " + tails + " tails.");
	 }
}
