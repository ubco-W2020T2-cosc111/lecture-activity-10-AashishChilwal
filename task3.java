import java.util.Scanner;
public class task3
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation user_input = new QuadraticEquation(a, b, c);
		if (user_input.getDiscriminant() != 0)
		    System.out.println("The roots are: "+user_input.getRealRoot1() + " " +user_input.getRealRoot2());
		else 
		    System.out.println("The equation has no real roots!");
	}
	
	public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

   public double getRealRoot1(){
       if ((b * b - 4 * a * c) > 0)
            return (-b+Math.sqrt(b * b - 4 * a * c))/2*a ;
       else
            return 0.0;
   }
   public double getRealRoot2(){
       if ((b * b - 4 * a * c) > 0)
            return (-b-Math.sqrt(b * b - 4 * a * c))/2*a ;
       else
            return 0.0;
   }
}
}
