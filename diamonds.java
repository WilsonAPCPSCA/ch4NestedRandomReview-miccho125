import java.util.Scanner;	
public class diamonds {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.print("What is the length of your diamond?");
		int x = in.nextInt();
		for(int i=1; i<=x; i++){
			for(int y=(x-i); y>=0; y--){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++){
				System.out.print("*");
			}
		System.out.println("");
		}
		for(int i=(x-1);i>=1;i--){
			for(int k=(x-i); k>=0; k--){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
