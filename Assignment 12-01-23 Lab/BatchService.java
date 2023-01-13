package batchapplication;

import java.util.Scanner;

public class BatchService{
		//CRUD -> Create,Read,Update and Delete
		
		static Scanner sc = new Scanner(System.in);
		static Java java[] = new Java[20];
		static int id;
		static long phone;
		static String name,email;
		static int jindex=0;
		static Aws aws[]=new Aws[20];
		static int aindex=0;
		
		//student info taking java couse
		public static void javaStudentInfo()
		{
			System.out.println("Enter student id:");
			id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter student name:");
			name = sc.nextLine();
			
			System.out.println("Enter student phone no.:");
			phone = sc.nextLong();
			
			sc.nextLine();
			System.out.println("Enter student email:");
			email = sc.nextLine();
			
			java[jindex] = new Java(id, name, phone, email);
			jindex++;
			System.out.println("Student deatils added successfully");

	}
		//student info taking AWS corse
		public static void AwsStudentcorseInfo()
		{
			System.out.println("Enter student Id:" );
			id=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Student name:");
			name = sc.nextLine(); 
			
			System.out.println("Enter Student phone number:");
			phone = sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter Student email:");
			email = sc.nextLine();
			
			aws[aindex] = new Aws(id, name, phone, email);
			aindex++;
			
			System.out.println("Student details added succesfully.");
		}
		
		//get AWS student info
		public static void getAllJavaStudentDetails()
		{
			for(int i=0; i<jindex; i++) {
				System.out.println("Student Id:"+java[i].getStdId());
				System.out.println("Student Name:"+java[i].getStdName());
				System.out.println("Student Email:"+java[i].getEmail());
				System.out.println("Student phone No:"+java[i].getPhone());
				System.out.println("Course Name: JAVA");
				System.out.println("...............................");
			}
		}
		
		//update student info
		public static void updateJavaStudentInfo()
		{
			System.out.println("Enter student id:");
			id = sc.nextInt();
			for(int i=0;i<jindex;i++)
				{
					if(id==java[i].getStdId())
					{
						System.out.println("Enter student id to update:");
						id = sc.nextInt();
						
						sc.nextLine();
						System.out.println("Enter student name to update:");
						name = sc.nextLine();
						
						System.out.println("Enter student phone no. to update:");
						phone = sc.nextLong();
						
						sc.nextLine();
						System.out.println("Enter student email to update:");
						email = sc.nextLine();
						
						java[i] = new Java(id, name, phone, email);
						System.out.println("update Successfull");
					}
					else
					{
						throw new StudentNotFoundException("Student detail not found");
					}
				}
				
					
					}
		//update AWS info
		public static void updateAwsStudentInfo()
		{
			System.out.println("Enter student id:");
			id = sc.nextInt();
			for(int i=0;i<aindex;i++){
				{
					if(id==aws[i].getStdId())
					{
						System.out.println("Enter student id:");
						id = sc.nextInt();
						
						sc.nextLine();
						System.out.println("Enter student name:");
						name = sc.nextLine();
						
						System.out.println("Enter student phone no.:");
						phone = sc.nextLong();
						
						sc.nextLine();
						System.out.println("Enter student email:");
						email = sc.nextLine();
						
						aws[i] = new Aws(id, name, phone, email);
						System.out.println("update Successfull");
									
					}
		
					else
					{
						throw new StudentNotFoundException("Student details not found !!");
					}
				}
			}
		}
			public static void searchCourses() 
			{
				System.out.println("Enter a course");
				String course = sc.nextLine();
				if(course.equalsIgnoreCase("JAVA") || course.equalsIgnoreCase("AWS")) 
				{
					System.out.println("Course is available");
					
				}
				else
				{
					throw new CourseNotFoundException("Course not found");
				}
			
		}

}
