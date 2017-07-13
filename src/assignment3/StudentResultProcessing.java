package assignment3;	//package declaration
import java.util.Scanner;
class Student
{
	private String name;	//declaring private string variable to store name
	private int mno;		//declaring private integer variable to store phone no.
	private int roll;		//declaring private integer variable to store rollno.
	private int std;		//declaring private integer variable to store class
	public String getName()	//method to get	name of student
	{
		return name;
	}
	public int getMno()	//method to get phone no. of student
	{
		return mno;
	}
	public int getRoll()	//method to get rollno. of student
	{
		return roll;
	}
	public int getStd()	//method to get class of student
	{
		return std;
	}
	public void setName(String newName)	//method to assign value to variable name
	{
		name=newName;
	}
	public void setMno(int newMno)	//method to assign value to variable mno
	{
		mno=newMno;
	}
	public void setRoll(int newRoll)	//method to assign value to variable roll
	{
		roll=newRoll;
	}
	public void setStd(int newStd)	//method to assign value to variable std
	{
		std=newStd;
	}
	public int result(int s1,int s2,int s3)	//method to calculate avg of marks of three subject and return the avg to the calling funcion
	{
		int avg=(s1+s2+s3)/3;
		return avg;
	}
}
public class StudentResultProcessing extends Student {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)		//for loop to take input for 3 students
		{
		Student stu=new Student();	//object creation
		System.out.println("Enter Details of Student "+i+ ":");
		Scanner in=new Scanner(System.in);
		System.out.println("Name:");
		stu.setName(in.nextLine());	//passing cmd line argument to setName method to assign value to name
		System.out.println("Phone:");
		stu.setMno(in.nextInt());	//passing cmd line argument to setMno method to assign value to mno
		System.out.println("Roll no:");
		stu.setRoll(in.nextInt());	//passing cmd line argument to setRoll method to assign value to roll
		System.out.println("Standard:");
		stu.setStd(in.nextInt());	//passing cmd line argument to setStd method to assign value to std
		System.out.println("Enter marks of any three subjects:");
		int sub1=in.nextInt();
		int sub2=in.nextInt();
		int sub3=in.nextInt();
		int res=stu.result(sub1,sub2,sub3);	//calling result method to calculate the avg of three subject marks
		System.out.println("Details & Result of Student "+i+":");	//print deatils and result of student
		System.out.println("Name: "+stu.getName());
		System.out.println("Phone: "+stu.getMno());
		System.out.println("Roll no: "+stu.getRoll());
		System.out.println("Standard: "+stu.getStd());
		System.out.print("Result:");
		if(res>33)		//check if student has avg more than 33 then student pass else fail
			System.out.println("Pass");
		else
			System.out.println("Fail");
		}
	}

}
