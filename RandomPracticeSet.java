//Name:Ahmet Yesilbas
//Project Name: RandomPracticeSet
//Date: 1/25/2021
//Project Description: randomizes numbers for various uses.

import java.util.Random;
import java.util.Scanner;

public class RandomPracticeSet{
public static void CoinToss() {
//Outputs heads or tails
int hT;
Random r = new Random();
hT=r.nextInt(2)-1;
if (hT==0)
	System.out.println("Heads");
else
	System.out.println("Tails");
}
public static void FortuneTeller() {
//Outputs 1 of 4 different predictions
//Think of a magic 8-ball
int magicNum;
Random r = new Random();
magicNum = r.nextInt(4);
if (magicNum==0) {
	System.out.println("Magic 8-Ball says: Hi");
}
else if (magicNum==1) {
	System.out.println("Magic 8-Ball says: Hello");
}
else if (magicNum==2) {
	System.out.println("Magic 8-Ball says: What's up?");
}
else if (magicNum==3) {
	System.out.println("Magic 8-Ball says: Hey");
}
}

//Design your own
public static void passGen() {
	int pass;
	int input;
	int digit;
	int ans;
    Scanner scan = new Scanner(System.in);
    Random r = new Random();
	System.out.println("Passcode Generator!\n===================\nHow many digits should the passocde be? (Up to 9 digits)\n");
	ans = scan.nextInt();
	if (ans==0) {
		System.out.println("Cannot generate a 0 digit passcode.");
	}
	else if (ans==1) {
		pass= r.nextInt(10);
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans==2) {
		pass= r.nextInt(100)-9;
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans==3) {
		pass= r.nextInt(1000)-99;
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans==4) {
		pass= r.nextInt(10000)-999;
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans==5) {
		pass= r.nextInt(100000)-9999;
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans==6) {
		pass= r.nextInt(1000000)-99999;
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans==7) {
		pass= r.nextInt(10000000)-999999;
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans==8) {
		pass= r.nextInt(100000000)-9999999;
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans==9) {
		pass= r.nextInt(1000000000)-99999999;
		System.out.println("\nPasscode Generated!\n===================\n"+pass);
	}
	else if (ans>9) {
		System.out.println("Insert a digit up to 10 (1-9)");
	}
	}
public static void main (String[] args) {

passGen();
//FortuneTeller();
}
}
