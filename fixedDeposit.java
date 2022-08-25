import java.util.*;
public class  fixedDeposit{


  	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal amount");
		double p=sc.nextDouble();
		System.out.println("Enter Interest rate");
		double r=sc.nextDouble();
		System.out.println("Enter time in years");
		double t=sc.nextDouble();
		double adj_r=r/100;
		double Amount= p*(Math.pow((1+adj_r),t));
		System.out.println("Your maturity amount is "+" Rs "+String.format("%.2f", Amount));
  }
	


         }


