package org.scann;

import java.util.Scanner;

public class Employee {
		private void code() {
			System.out.println("Code done by Elam");

		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Employee Id");
			int Id =s.nextInt();
			System.out.println("Enter Employee Name");
			String name = s.next();
			System.out.println("Enter Employee email");
			String email =s.next();
			System.out.println("Enter Employee Phone Number");
			long phoneno = s.nextLong();
			System.out.println("Enter Employee Salary");
			float salary = s.nextFloat();
			System.out.println("Enter Employee Gender");
			String gender = s.next();
			System.out.println("Enter Employee City");
			String city = s.next();
			System.out.println("Id:"+Id);
			System.out.println("Name:"+name);
			System.out.println("EmailId:"+email);
			System.out.println("Phone No:"+phoneno);
			System.out.println("Salary:"+salary);
			System.out.println("Gender:"+gender);
			System.out.println("City:"+city);
			
			
		}
}
