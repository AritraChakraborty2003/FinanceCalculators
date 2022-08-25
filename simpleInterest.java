import java.util.*;
public class simpleInterest{


  	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal amount");
		int p=sc.nextInt();
		System.out.println("Enter Interest rate");
		int r=sc.nextInt();
		System.out.println("Enter time in years");
		int t=sc.nextInt();

		int sim_num=p*r*t;
		int sim_den=100;
                                           int sim_interest=sim_num/sim_den;
		System.out.println(sim_interest);
	


         }


}