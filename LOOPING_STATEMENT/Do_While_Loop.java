package LOOPING_STATEMENT;

import java.util.Scanner;

public class Do_While_Loop {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter an number:");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		do
		{
			System.out.println(num);
			++num;
		}
		while(num<=10);
	}

}
