package ch5ex11;
import java.util.Scanner;
import java.lang.Math;

public class Ch5Ex11 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c,b1;
        double x1,x2,holder;
            
            System.out.println("Enter a value for a");
                a=input.nextInt();
            System.out.println("Enter a value for b");
                b=input.nextInt();
            System.out.println("Enter a value for c");
                c=input.nextInt();
                input.close();
                b1=b*-1;
                
                
                holder=b*b-4*a*c;
                holder=Math.sqrt(holder);
                
                //System.out.println(holder);
                x1=((b1+holder)/(2*a));
                x2=((b1-holder)/(2*a));
                
                    System.out.println("Your first root is at "+x1);
                    System.out.println("Your second root is at "+x2);
    }
    
}
