import java.util.*;
public  class emiCalculator{
    
    public static  void  main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter loan amount");
         double amt=sc.nextDouble();
         System.out.println("Enter loan interest");
         double interest=sc.nextDouble();
         System.out.println("Enter loan tenure in  months");
         double time=sc.nextDouble();
         
         double adj_r=interest/100;
         double adj_res=adj_r/12;
         double emi_num=amt*adj_res;
         double emi_side=Math.pow((1+adj_res),time);
         double emi_div=Math.pow((1+adj_res),time)-1;
         double emi_side_res=emi_side/emi_div;
         double emi_val=emi_num*emi_side_res;
         
         System.out.println("The emi amount monthly is "+" Rs "+String.format("%.2f",emi_val));
        
        
    }
    
    
    
}
