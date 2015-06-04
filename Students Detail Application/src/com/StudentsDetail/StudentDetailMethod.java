package com.StudentsDetail;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDetailMethod {
	public void getDetail(ArrayList<StudentProperties> list) {
		System.out
				.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");

		Iterator<StudentProperties> iterator = list.iterator();
		StudentProperties obj = new StudentProperties();
		while (iterator.hasNext()) {
			obj = iterator.next();
			System.out.println(obj.getName() + "\t" + obj.getAddress() + "\t\t"
					+ obj.getCity() + '\t' + obj.getStandard() + "\t\t"
					+ obj.getPassword() + "\t\t\t" + obj.getRoll_Number());
		}
	}

	public void getHeader() {

		System.out.println("Access Available:");
		System.out
				.println("1. Register a Student\n2. Modify Student\n3. Remove Student\n4. Search Student\n5. List of Students\n6. EXIT");
	}

}
