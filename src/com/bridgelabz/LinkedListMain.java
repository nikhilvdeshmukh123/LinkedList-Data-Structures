package com.bridgelabz;

/*
 * @author: Nikhil Deshmukh
 * Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3 
 */
import java.util.Scanner;// import scanner class

public class LinkedListMain {
	public static void main(String[] args) {
		// create object for linkedlist class coz no one method is static in this class
		LinkedList linkedList = new LinkedList();
		// create scanner class and object scanner class read java user input
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Welcome to DataStructure Program\n\n" + "Choose your option:\n" + "1. Create a simple LinkedList\n" // uc1
						+ "2. Create Linked List by adding 30 and 56 to 70\n" // uc2
						+ "3. Create Linked List by apending 30 and 70 to 56\n" // uc3
						+ "4. Insert 30 between 56 & 70\n" // uc4
						+ "5. Ability to delete the first element\n" // uc5
						+ "6. Delete the last element in the LinkedList\n"// uc6
						+ "7. Find node with value 30\n" // uc7
						+ "8. Insert 40 after 30\n"// uc8
						+ "9. Delete the Node");// uc9
		int option = sc.nextInt();
		System.out.println();
		// using switch case,they check the condition if they got condition is true then
		// the stop searching and break it.
		switch (option) {
		// Creating simple linked list
		case 1:
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			linkedList.print();
			break;
		case 2:
			linkedList.push(70);
			linkedList.push(30);
			linkedList.push(56);
			linkedList.print();
			break;
		case 3:
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			linkedList.print();
			break;
		case 4:
			LinkedList.Node prevNode = linkedList.insert(56);
			linkedList.insert(70);
			linkedList.insertAfter(prevNode, 30);
			break;
		case 5:
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			int pop = linkedList.pop();
			System.out.println(pop);
			linkedList.print();
			break;
		case 6:
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			linkedList.popLast();
			linkedList.print();
			break;
		case 7:
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			int search = linkedList.search(30);
			System.out.println("Position of 30::" + search);
			break;
		case 8:
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			linkedList.insertelement(3, 40);
			linkedList.print();
			break;
		case 9:
			linkedList.deleteANode(40);
			linkedList.print();
		}
	}
}