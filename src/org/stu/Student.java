package org.stu;

import java.util.Scanner;

public class Student {

	private void college() {
		// TODO Auto-generated method stub
System.out.println("Anna University");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id-");
		int studentId=sc.nextInt();
		System.out.println("Enter your Name-");
		String studentName=sc.next();
		int Mark1=90;
		int Mark2=95;
		int Mark3=80;
		int Mark4=85;
		int Mark5=70;
		System.out.println("Studentid:"+studentId);
		System.out.println("StudentName:"+studentName);
		System.out.println("Mark1:"+Mark1);
		System.out.println("Mark2:"+Mark2);
		System.out.println("Mark3:"+Mark3);
		System.out.println("Mark4:"+Mark4);
		System.out.println("Mark5:"+Mark5);
		System.out.println("Total:"+(Mark1+Mark2+Mark3+Mark4+Mark5));
		System.out.println("Average:"+(Mark1+Mark2+Mark3+Mark4+Mark5)/5);
						
	}
}
