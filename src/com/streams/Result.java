package com.streams;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) throws IOException {

		File file=new File("boy.txt"); //file object is created with a specific path

		PrintWriter printWriter=new PrintWriter(file);  //writes formatted data
		for(int i=0;i<100;i++)
		{
			Random random=new Random();
			printWriter.write(""+random.nextInt(50));  //Generates random number from 0-49
			printWriter.println();
		}
		printWriter.close();
		ArrayList<Integer> intList= new ArrayList<>(); 

		Scanner scanner=new Scanner(file);

		while(scanner.hasNextInt()) {
			intList.add(scanner.nextInt());  //inserts the data in the list
		}

		//distinct and sorted data is displayed on the screen
		intList.stream().distinct().sorted().forEach(System.out::println);
	}

	
}
