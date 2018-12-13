package com.pccu.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(new File("src/text/consume.txt"));
			
			float amount = 0;
			
			while(s.hasNext()) {
				System.out.println(s.next());
				amount += s.nextFloat();
			}
			
			System.out.println(amount);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
		}

		System.out.println("Terminated.");

	}

}