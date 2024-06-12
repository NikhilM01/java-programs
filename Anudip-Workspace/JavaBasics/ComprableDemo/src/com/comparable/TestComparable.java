package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
Student std1=new Student(111, "Nikhil", 20000);
		
		ArrayList<Student> stdlist = new ArrayList<Student>();
		
		stdlist.add(std1);
		stdlist.add(new Student(106, "Aniket", 85));
		stdlist.add(new Student(103, "Suraj", 90));
		stdlist.add(new Student(102, "Aakansha", 75));
		
		System.out.println("Sorted by Name : ");
		
//		Student std= new Student();
		Collections.sort(stdlist);
		for (Student std : stdlist)
            System.out.println( std.getId() + " "
                               + std.getName() + " "
                               + std.getMarks());
		

	}

}
