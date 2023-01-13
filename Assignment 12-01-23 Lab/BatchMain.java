package batchapplication;

import java.util.Scanner;

public class BatchMain {

	public static void main(String[] args) {
		
		int choice,ch;
		Scanner sc = new Scanner(System.in);
		BatchService batch = new BatchService();
		System.out.println("Welcome to Anudip Foundation");
		do{
			System.out.println("Please choose which course you want to pursue:\n"
					+ "1)JAVA  2) AWS  3) Other  4) Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("..............JAVA..........");
				System.out.println("1)Enter student info.\n2) Show Student Info\n"
						+"3)Update student info");
				ch = sc.nextInt();                                                                                      
			
				switch(ch)
				{
				case 1:
					batch.javaStudentInfo();
					System.out.println();
					break;
					
				case 2:
					batch.getAllJavaStudentDetails();
					System.out.println();
					break;
				case 3:
					batch.updateJavaStudentInfo();
					System.out.println();
					break;
					
				case 4:
					batch.AwsStudentcorseInfo();
					System.out.println();
					break;
				default:
					System.out.println("Worng choice !!");
					
				}
				break;
			case 2:
				System.out.println("..............AWS..........");
				System.out.println("1)Enter student info.\n2) Show Student Info\n"
						+"3)Update student info");
				break;
				
			case 3:
				System.out.println("Others");
				System.out.println();
				batch.searchCourses();
				break;
				
			case 4:
				System.exit(0);
				break;
				
				default:
					System.out.println("Wrong choice!!");
					
				}
			
			}while(true);
		}

	}


