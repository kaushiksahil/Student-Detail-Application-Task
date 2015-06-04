package com.StudentsDetail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

		// for (int loop = 1; loop <= 20; loop++)
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

					System.out.println("Enter Roll Number: ");
					roll_Number = Integer.parseInt(br.readLine());
					if (roll_Number == 1) {

						System.out.println("Which property want to Modify");
						System.out
								.println("1. Name\n2. Address\n3. City\n4. Class\n 5. Password");
						switch (Integer.parseInt(br.readLine())) {
						case 1: {
							System.out.println("Enter New Name:");
							objStudent1.setName(br.readLine());
							list1.set(0, objStudent1);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 2: {
							System.out.println("Enter New Address:");
							objStudent1.setAddress(br.readLine());
							list1.set(0, objStudent1);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 3: {
							System.out.println("Enter New City:");
							objStudent1.setCity(br.readLine());
							list1.set(0, objStudent1);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 4: {
							System.out.println("Enter New Class:");
							objStudent1.setStandard(br.readLine());
							list1.set(0, objStudent1);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 5: {
							System.out.println("Enter New Password:");
							objStudent1.setPassword(br.readLine());
							list1.set(0, objStudent1);
							System.out.println("Successfully Modify.....");
							break;
						}
						default:
							System.out.println("Wrong Input!!");
						}

					} else if (roll_Number == 2) {
						System.out.println("Which property want to Modify");
						System.out
								.println("1. Name\n2. Address\n3. City\n4. Class\n 5. Password");
						switch (Integer.parseInt(br.readLine())) {
						case 1: {
							System.out.println("Enter New Name:");
							objStudent2.setName(br.readLine());
							list1.set(1, objStudent2);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 2: {
							System.out.println("Enter New Address:");
							objStudent1.setAddress(br.readLine());
							list1.set(1, objStudent2);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 3: {
							System.out.println("Enter New City:");
							objStudent2.setCity(br.readLine());
							list1.set(1, objStudent2);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 4: {
							System.out.println("Enter New Class:");
							objStudent2.setStandard(br.readLine());
							list1.set(1, objStudent2);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 5: {
							System.out.println("Enter New Password:");
							objStudent2.setPassword(br.readLine());
							list1.set(1, objStudent2);
							System.out.println("Successfully Modify.....");
							break;
						}
						default:
							System.out.println("Wrong Input!!");
						}

					}

					else if (roll_Number == 3) {
						System.out.println("Which property want to Modify");
						System.out
								.println("1. Name\n2. Address\n3. City\n4. Class\n 5. Password");
						switch (Integer.parseInt(br.readLine())) {
						case 1: {
							System.out.println("Enter New Name:");
							objStudent3.setName(br.readLine());
							list1.set(2, objStudent3);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 2: {
							System.out.println("Enter New Address:");
							objStudent3.setAddress(br.readLine());
							list1.set(2, objStudent3);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 3: {
							System.out.println("Enter New City:");
							objStudent3.setCity(br.readLine());
							list1.set(2, objStudent3);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 4: {
							System.out.println("Enter New Class:");
							objStudent3.setStandard(br.readLine());
							list1.set(2, objStudent3);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 5: {
							System.out.println("Enter New Password:");
							objStudent3.setPassword(br.readLine());
							list1.set(2, objStudent3);
							System.out.println("Successfully Modify.....");
							break;
						}
						default:
							System.out.println("Wrong Input!!");
						}

					}

					else if (roll_Number == 4) {
						System.out.println("Which property want to Modify");
						System.out
								.println("1. Name\n2. Address\n3. City\n4. Class\n 5. Password");
						switch (Integer.parseInt(br.readLine())) {
						case 1: {
							System.out.println("Enter New Name:");
							objStudent4.setName(br.readLine());
							list1.set(3, objStudent4);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 2: {
							System.out.println("Enter New Address:");
							objStudent4.setAddress(br.readLine());
							list1.set(3, objStudent4);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 3: {
							System.out.println("Enter New City:");
							objStudent4.setCity(br.readLine());
							list1.set(3, objStudent4);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 4: {
							System.out.println("Enter New Class:");
							objStudent4.setStandard(br.readLine());
							list1.set(3, objStudent4);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 5: {
							System.out.println("Enter New Password:");
							objStudent4.setPassword(br.readLine());
							list1.set(3, objStudent4);
							System.out.println("Successfully Modify.....");
							break;
						}
						default:
							System.out.println("Wrong Input!!");
						}

					}

					else if (roll_Number == 5) {
						System.out.println("Which property want to Modify");
						System.out
								.println("1. Name\n2. Address\n3. City\n4. Class\n 5. Password");
						switch (Integer.parseInt(br.readLine())) {
						case 1: {
							System.out.println("Enter New Name:");
							objStudent5.setName(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 2: {
							System.out.println("Enter New Address:");
							objStudent5.setAddress(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 3: {
							System.out.println("Enter New City:");
							objStudent5.setCity(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 4: {
							System.out.println("Enter New Class:");
							objStudent5.setStandard(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 5: {
							System.out.println("Enter New Password:");
							objStudent5.setPassword(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						default:
							System.out.println("Wrong Input!!");
						}
					} else if (roll_Number == objectAddStudent.getRoll_Number()) {
						System.out.println("Which property want to Modify");
						System.out
								.println("1. Name\n2. Address\n3. City\n4. Class\n 5. Password");
						switch (Integer.parseInt(br.readLine())) {
						case 1: {
							System.out.println("Enter New Name:");
							objectAddStudent.setName(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 2: {
							System.out.println("Enter New Address:");
							objectAddStudent.setAddress(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 3: {
							System.out.println("Enter New City:");
							objectAddStudent.setCity(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 4: {
							System.out.println("Enter New Class:");
							objectAddStudent.setStandard(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						case 5: {
							System.out.println("Enter New Password:");
							objectAddStudent.setPassword(br.readLine());
							list1.set(4, objStudent5);
							System.out.println("Successfully Modify.....");
							break;
						}
						default:
							System.out.println("Wrong Input!!");
						}

					} else
						System.out.println("Wrong Input");
					break;
				}

				case 3: {
					
					System.out.println("Enter Roll Number:");
					roll_Number = Integer.parseInt(br.readLine());
					if (roll_Number == 1) {
						list1.remove(objStudent1);
						System.out.println("REMOVE SUCCESSFULLY");

					} else if (roll_Number == 2) {
						list1.remove(objStudent2);
						System.out.println("REMOVE SUCCESSFULLY");

					} else if (roll_Number == 3) {
						
						list1.remove(objStudent3);
						System.out.println("REMOVE SUCCESSFULLY");

					} else if (roll_Number == 4) {
						list1.remove(objStudent4);
						System.out.println("REMOVE SUCCESSFULLY");

					} else if (roll_Number == 5) {
						list1.remove(objStudent5);
						System.out.println("REMOVE SUCCESSFULLY");

					} else if (roll_Number == objectAddStudent.getRoll_Number()) {
						list1.remove(objectAddStudent);
						System.out.println("REMOVE SUCCESSFULLY");
					} else
						System.out.println("Wrong Input");
					break;
				}
				case 4: {
					System.out.println("Enter Roll Number: ");
					roll_Number = Integer.parseInt(br.readLine());

					if (roll_Number == 1) {
						System.out
								.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");
						System.out.println(objStudent1.getName() + "\t"
								+ objStudent1.getAddress() + "\t\t"
								+ objStudent1.getCity() + '\t'
								+ objStudent1.getStandard() + "\t\t"
								+ objStudent1.getPassword() + "\t\t\t"
								+ objStudent1.getRoll_Number());

					} else if (roll_Number == 2) {
						System.out
								.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");
						System.out.println(objStudent2.getName() + "\t"
								+ objStudent2.getAddress() + "\t\t"
								+ objStudent2.getCity() + '\t'
								+ objStudent2.getStandard() + "\t\t"
								+ objStudent2.getPassword() + "\t\t\t"
								+ objStudent2.getRoll_Number());
					} else if (roll_Number == 3) {
						System.out
								.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");
						System.out.println(objStudent3.getName() + "\t"
								+ objStudent3.getAddress() + "\t\t"
								+ objStudent3.getCity() + '\t'
								+ objStudent3.getStandard() + "\t\t"
								+ objStudent3.getPassword() + "\t\t\t"
								+ objStudent3.getRoll_Number());
					} else if (roll_Number == 4) {
						System.out
								.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");
						System.out.println(objStudent4.getName() + "\t"
								+ objStudent4.getAddress() + "\t\t"
								+ objStudent4.getCity() + '\t'
								+ objStudent4.getStandard() + "\t\t"
								+ objStudent4.getPassword() + "\t\t\t"
								+ objStudent4.getRoll_Number());
					} else if (roll_Number == 5) {
						System.out
								.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");
						System.out.println(objStudent5.getName() + "\t"
								+ objStudent5.getAddress() + "\t\t"
								+ objStudent5.getCity() + '\t'
								+ objStudent5.getStandard() + "\t\t"
								+ objStudent5.getPassword() + "\t\t\t"
								+ objStudent5.getRoll_Number());
					}

					else if (roll_Number == objectAddStudent.getRoll_Number()) {
						System.out
								.println("Name\t\tAddress\t\tCity\t\tClass\t\tPassword\t\tRoll Number");
						System.out.println(objectAddStudent.getName() + "\t"
								+ objectAddStudent.getAddress() + "\t\t"
								+ objectAddStudent.getCity() + '\t'
								+ objectAddStudent.getStandard() + "\t\t"
								+ objectAddStudent.getPassword() + "\t\t\t"
								+ objectAddStudent.getRoll_Number());
					} else
						System.out.println("Wrong Input");

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
