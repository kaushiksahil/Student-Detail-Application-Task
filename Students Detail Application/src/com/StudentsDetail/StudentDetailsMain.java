package com.StudentsDetail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentDetailsMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Student World.....");
		ArrayList<StudentProperties> list1 = new ArrayList<StudentProperties>();
		StudentDetailMethod objectDetailMethod = new StudentDetailMethod();
		StudentProperties objStudent1 = new StudentProperties();
		StudentProperties objectAddStudent = new StudentProperties();

		objStudent1.setName("Sahil Kaushik");
		objStudent1.setAddress("Hisar");
		objStudent1.setCity("Hisar City");
		objStudent1.setStandard("12th");
		objStudent1.setPassword("12341");
		objStudent1.setRoll_Number(1);
		list1.add(objStudent1);
		StudentProperties objStudent2 = new StudentProperties();
		objStudent2.setName("Rohit Nagpal");
		objStudent2.setAddress("Bwani ");
		objStudent2.setCity("Bhiwani City");
		objStudent2.setStandard("12th");
		objStudent2.setPassword("12342");
		objStudent2.setRoll_Number(2);
		list1.add(objStudent2);
		StudentProperties objStudent3 = new StudentProperties();
		objStudent3.setName("Sumit Gujjar");
		objStudent3.setAddress("Hisar");
		objStudent3.setCity("Hisar City");
		objStudent3.setStandard("12th");
		objStudent3.setPassword("12343");
		objStudent3.setRoll_Number(3);
		list1.add(objStudent3);
		StudentProperties objStudent4 = new StudentProperties();
		objStudent4.setName("Karan Kapoor");
		objStudent4.setAddress("Hisar");
		objStudent4.setCity("Hisar City");
		objStudent4.setStandard("12th");
		objStudent4.setPassword("12344");
		objStudent4.setRoll_Number(4);
		list1.add(objStudent4);
		StudentProperties objStudent5 = new StudentProperties();
		objStudent5.setName("Nikhil Thukral");
		objStudent5.setAddress("Dadri");
		objStudent5.setCity("Bhiwani City");
		objStudent5.setStandard("12th");
		objStudent5.setPassword("12345");
		objStudent5.setRoll_Number(5);
		list1.add(objStudent5);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);

		int choice;
		do {
			int roll_Number;
			objectDetailMethod.getHeader();
			System.out.println("Enter Choice");
			choice = Integer.parseInt(br.readLine());
			if (choice == 6) {
				System.out.println("Thank You");
				break;
			} else {
				switch (choice) {
				case 1: {
					StudentProperties objectAddStudent1 = new StudentProperties();
					System.out.println("Enter Name: ");
					objectAddStudent1.setName(br.readLine());
					System.out.println("Enter Address: ");
					objectAddStudent1.setAddress(br.readLine());
					System.out.println("Enter City: ");
					objectAddStudent1.setCity(br.readLine());
					System.out.println("Enter Class");
					objectAddStudent1.setStandard(br.readLine());
					System.out.println("Enter Password: ");
					objectAddStudent1.setPassword(br.readLine());
					System.out.println("Enter Roll Number:");
					objectAddStudent1.setRoll_Number(Integer.parseInt(br
							.readLine()));

					System.out.println("Added successfully!!");
					objectAddStudent = objectAddStudent1;
					list1.add(objectAddStudent);
					break;
				}

				case 2: {
					System.out.println("Enter Roll Number:");
					roll_Number = Integer.parseInt(br.readLine());
					Iterator<Integer> iterator = list2.iterator();
					while (iterator.hasNext()) {
						iterator.next();
						Iterator<StudentProperties> iteratorStudentIterator = list1
								.iterator();
						while (iteratorStudentIterator.hasNext()) {
							StudentProperties obj = new StudentProperties();
							obj = iteratorStudentIterator.next();
							if (roll_Number == obj.getRoll_Number()) {
								System.out
										.println("Which property want to Modify");
								System.out
										.println("1. Name\n2. Address\n3. City\n4. Class\n 5. Password");
								switch (Integer.parseInt(br.readLine())) {
								case 1: {
									System.out.println("Enter New Name:");

									obj.setName(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								case 2: {
									System.out.println("Enter New Address:");
									obj.setAddress(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								case 3: {
									System.out.println("Enter New City:");
									obj.setCity(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								case 4: {
									System.out.println("Enter New Class:");
									obj.setStandard(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								case 5: {
									System.out.println("Enter New Password:");
									obj.setPassword(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								default:
									System.out.println("Wrong Input!!");
								}
								break;
							} else if (roll_Number == objectAddStudent
									.getRoll_Number()) {
								obj = objectAddStudent;
								System.out
										.println("Which property want to Modify");
								System.out
										.println("1. Name\n2. Address\n3. City\n4. Class\n 5. Password");
								switch (Integer.parseInt(br.readLine())) {
								case 1: {
									System.out.println("Enter New Name:");

									obj.setName(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								case 2: {
									System.out.println("Enter New Address:");
									obj.setAddress(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								case 3: {
									System.out.println("Enter New City:");
									obj.setCity(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								case 4: {
									System.out.println("Enter New Class:");
									obj.setStandard(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								case 5: {
									System.out.println("Enter New Password:");
									obj.setPassword(br.readLine());
									list1.set(list1.indexOf(obj), obj);
									System.out
											.println("Successfully Modify.....");
									break;
								}
								default:
									System.out.println("Wrong Input!!");
								}// switch
								break;
							}
						}
						break;

					}

					break;
				}

				case 3: {
					System.out.println("Enter Roll Number:");
					roll_Number = Integer.parseInt(br.readLine());
					Iterator<Integer> iterator = list2.iterator();
					while (iterator.hasNext()) {
						iterator.next();
						Iterator<StudentProperties> iteratorStudentIterator = list1
								.iterator();
						while (iteratorStudentIterator.hasNext()) {
							StudentProperties obj = new StudentProperties();
							obj = iteratorStudentIterator.next();
							if (roll_Number == obj.getRoll_Number()) {
								list1.remove(obj);
								System.out.println("REMOVE SUCCESSFULLY");
								break;
							}

							else if (roll_Number == objectAddStudent
									.getRoll_Number()) {
								obj = objectAddStudent;
								list1.remove(obj);
								System.out.println("REMOVE SUCCESSFULLY");
								break;
							}

						}
						break;
					}
					break;
				}

				case 4: {

					System.out.println("Enter Roll Number:");
					roll_Number = Integer.parseInt(br.readLine());
					Iterator<Integer> iterator = list2.iterator();
					while (iterator.hasNext()) {
						iterator.next();
						Iterator<StudentProperties> iteratorStudentIterator = list1
								.iterator();
						while (iteratorStudentIterator.hasNext()) {
							StudentProperties obj = new StudentProperties();
							obj = iteratorStudentIterator.next();
							if (roll_Number == obj.getRoll_Number()) {
								System.out
										.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");
								System.out.println(obj.getName() + "\t"
										+ obj.getAddress() + "\t\t"
										+ obj.getCity() + '\t'
										+ obj.getStandard() + "\t\t"
										+ obj.getPassword() + "\t\t\t"
										+ obj.getRoll_Number());
								break;
							} else if (roll_Number == objectAddStudent
									.getRoll_Number()) {
								obj = objectAddStudent;
								System.out
										.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");
								System.out.println(obj.getName() + "\t"
										+ obj.getAddress() + "\t\t"
										+ obj.getCity() + '\t'
										+ obj.getStandard() + "\t\t"
										+ obj.getPassword() + "\t\t\t"
										+ obj.getRoll_Number());
								break;
							}
						}
						break;
					}
					break;
				}

				case 5: {
					objectDetailMethod.getDetail(list1);
					break;

				}
				default:
					System.out.println("Wrong Input!!");
				}
			}
		} while (choice != 6);
		choice++;
	}

}
