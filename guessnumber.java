package guess;

import java.util.Scanner;

public class guessnumber {
	
	static int result(int a, int b, int c) {
		if(a == b){
			c = 1;
			return c;
		}else {
			c = 0;
			return c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
			int gissningar = 0;
			int thenumbers = (int) Math.round(Math.random()*100);
			int gissade = 25;
			int correct = 0;
			System.out.println("Spelet har 5 rundor");
			System.out.println("Nu är numret satt!");
			Scanner guess = new Scanner(System.in);
			System.out.println("Gissa numret!");
			
			gissade = guess.nextInt();
			correct = result(thenumbers, gissade, correct);
			if(correct != 1) {
//				System.out.println(correct);
			while(correct != 1) {
//				System.out.println(correct);
				gissningar++;
				if(gissade > thenumbers) {
					System.out.println("Ooops, du gissade högre än numret!");
					System.out.println("Pröva igen!");
					gissade = guess.nextInt();
					correct = result(thenumbers, gissade, correct);
				}else {
					System.out.println("Ooops, du gissade lägre än numret");
					System.out.println("Pröva igen");
					gissade = guess.nextInt();
					correct = result(thenumbers, gissade, correct);
				}
				

			}
			System.out.println("Du gissade numret på " + gissningar + " försök");
			}else {
				gissningar++;
				System.out.println("Grattis, du gissade numret på " + gissningar + " försök");
			}
			guess.close();
			
		}
	}
	


}
