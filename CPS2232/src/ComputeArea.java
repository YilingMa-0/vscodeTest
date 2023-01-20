import java.util.Scanner;
public class ComputeArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of side:");
		double side = input.nextDouble();
		double area = Math.sqrt(3)/4*Math.pow(side, 2);
		double volume = area*side;
		System.out.println("traingle:"+side);
		System.out.println("The area is:"+area);
		System.out.println("The volume of the Triangular prism is:"+volume);
	}

}