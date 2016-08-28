package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class bon_appetit{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	//System.out.println("Enter the values");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        int i=0;
    	double total = 0;
        ArrayList<Double> cost = new ArrayList<Double>();
        while(i<n){
        	cost.add(in1.nextDouble());
        	i++;
        }
        Scanner in2 = new Scanner(System.in);
        Double amount = in2.nextDouble();
        i=0;
    	while(i<n){
    		total = total + cost.get(i);
    		i++;
    	}
        //System.out.println("The value of N  : "+n+"  And K is "+k );
        //System.out.println("The Amount "+amount );
        //System.out.println("The List "+cost );
        bon_appetit(n,k,amount,cost,total);
    }
    
    public static void bon_appetit(int n,int k, double amount,ArrayList<Double> cost,double total){
    	double item = cost.get(k);
    	double actualprice = (total/2)-(item/2);
    	//System.out.println("The total "+total );
    	//System.out.println("The item "+item );
    	//System.out.println("The actualprice "+actualprice );
    	if(amount == actualprice)
    		System.out.println("Bon Appetit");
    	else
    		System.out.println(amount-actualprice);
    }
}