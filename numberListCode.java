import java.util.Scanner;
import java.io.*;
public class numberListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		String fileName = "NumberList.txt";
		int choice = 0;
		
		
		while (choice != 4) {
			System.out.println("1 is to create the file \n2 to is to read the file \n3 is to sum"
			+ " up the file \n4 is to quit");
			
			choice = kb.nextInt();
			
			switch (choice){
			case 1:
				createFile(fileName);
				System.out.println("your file has been created");
				break;
			case 2:
				readFile(fileName);
				break;
			case 3:
				sumTheFile(fileName);
				break;
			case 4:
				System.out.println("Quit Succesfull");
				break;
			}	
		}
		kb.close();
		
		
		
	}
	/**
	 * 
	 * @param fileName - name for the file that will be created
	 */
	public static void createFile(String fileName) {
		// creating the file within a try method 
		PrintWriter outputFile = null;
		try {
			outputFile = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		//writing 1-100 into the text file 
		for(int i = 1; i <= 100; i += 1) {
			outputFile.println(i);
		}
		
		//closing the file 
		outputFile.close();
		
		
	}

	/**
	 * 
	 * @param fileName -the file name that will be read
	 */
	public static void readFile(String fileName) {
		//getting file name
		File file = new File(fileName);
		
		//making the file readeable
		Scanner inputFile = null;
		try {
			 inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//displaying what is in the file while there is content on each line
		while(inputFile.hasNext()) {
		String line = inputFile.nextLine();
		System.out.println(line);
		
		
		}
	}

	/**
	 * 
	 * @param fileName - the name of the file to sum up the integers in it
	 */
	public static void sumTheFile(String fileName) {
		int theTotal = 0;
		
		//getting the filename
		File file = new File(fileName);
		
		//making the file readeable
		Scanner inputFile = null;
		try {
			 inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//displaying what is in the file while there is content on each line
		while(inputFile.hasNext()) {
		String line = inputFile.nextLine();
		theTotal = Integer.parseInt(line) + theTotal;
		}
		
		//displaying the total 
		System.out.println(theTotal);
		
		//clsoing the file
		inputFile.close();
	}

}
