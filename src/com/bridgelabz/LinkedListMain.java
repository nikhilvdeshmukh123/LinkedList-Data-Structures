package com.bridgelabz;
/*
 * @author: Nikhil Deshmukh
 * Ability to create Linked List by adding 30 and 56 to 70
 */
import java.util.Scanner;// import scanner class

public class LinkedListMain {
	public static void main(String[] args) {
		//create object for linkedlist class coz no one method is static in this class
		LinkedList linkedList = new LinkedList();
		//create scanner class and object scanner class read java user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to DataStructure Program\n\n"
                + "Choose your option:\n"
                + "1. Create a simple LinkedList\n"  //uc1
                + "2. Create Linked List by adding 30 and 56 to 70\n"    );//uc2
		int option = sc.nextInt();
		System.out.println();
		//using switch case,they check the condition if they got condition is true then the stop searching and break it.
		switch (option) {
		//Creating simple linked list
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
		}
	}
}