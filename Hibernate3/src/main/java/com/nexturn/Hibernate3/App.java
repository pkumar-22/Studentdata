package com.nexturn.Hibernate3;

import java.util.Scanner;

import com.nexturn.assignment.Student;
import com.nexturn.assignment.studentDAO;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	int choice=0;
    	while(choice!=3) {
        System.out.println( "project started" );
        System.out.println("press 1: addrecords");
        System.out.println("press 2: read details");
        System.out.println("press 3: exit ");
        System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			Student student=new Student();
			studentDAO studentdao=new studentDAO();
			studentdao.addRecords(student);
			break;
			
		case 2:
			studentDAO studentdao1=new studentDAO();
			Student s=studentdao1.read();
			if(s!=null) {
				System.out.println(s);
			}
			else {
				System.out.println("Record not found");
			}
			System.out.println();
			break;
			
		case 3:
			System.exit(0);
			break;
			
		default:
			System.out.println("please enter valid input");
			break;
		}
        
    	}
    }
}