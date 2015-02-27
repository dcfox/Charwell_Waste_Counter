import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.*;

/**
 * @author ashraf
 * 
 */
public class CsvFileWriter {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV file header
	private static final String FILE_HEADER = "id,firstName,lastName,gender,age";

	public static void writeCsvFile(String fileName) {
		
		//Create new wasters objects
		Date date = new Date();
		Waster student1 = new Waster("Mohamed", 25, date);
		Waster student2 = new Waster("Said", 23, date);

		//Create a new list of student objects
		List wasters = new ArrayList();
		wasters.add(student1);
		wasters.add(student2);
		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new student object list to the CSV file
			/*
			for (Waster student : wasters) {
				fileWriter.append(student.getName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getAmount());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getDate().getTime());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			*/

			
			
			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		}
	}
}