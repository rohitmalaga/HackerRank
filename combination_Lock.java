package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class combination_Lock{
	
	public static void main(String [] args){
		System.out.println("Enetr valeues");
		ArrayList<Integer> given = new ArrayList<Integer>(5);
		ArrayList<Integer> expected = new ArrayList<Integer>(5);
		Scanner in = new Scanner(System.in);
		int  index=0;
		while(index<10){
			if(index<5)
				given.add(in.nextInt());
			else 
				expected.add(in.nextInt());
			index++;
		}
		System.out.println("The given List : "+given);
		
		System.out.println("The expected List : "+expected);
		System.out.println("The Counts are : "+combination_Lock(given,expected));
		
		
	}
	public static int combination_Lock(ArrayList<Integer>given,ArrayList<Integer>expected){
		int cout = 0;
		int index=0;
		while(index<5){
			int diff = Math.abs(given.get(index)-expected.get(index));
			int temp = 10-diff;
			System.out.println("The difft : "+diff);
			System.out.println("The temp : "+temp);
			if(diff<6){
				cout  = cout+diff;
			}else{
				cout= cout+temp+1;
			}
			index++;
		}
		return cout;
		
	}
}