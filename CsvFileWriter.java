import java.awt.Desktop;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class CsvFileWriter.
 *
 * @author ashraf & dcfox
 */
public class CsvFileWriter {
	
	//Delimiter used in CSV file
	/** The Constant COMMA_DELIMITER. */
	private static final String COMMA_DELIMITER = ",";
	
	/** The Constant NEW_LINE_SEPARATOR. */
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV file header
	/** The Constant FILE_HEADER. */
	private static final String FILE_HEADER = "Name,Food Waste (lbs),Time";

	/**
	 * Write csv file.
	 *
	 * @param fileName the file name
	 * @param students the students
	 */
	public static void writeCsvFile(String fileName, List<Waster> students) {
				
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new student object list to the CSV file
			
			for (Waster student : students) {
				fileWriter.append(student.getName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(Float.toString(student.getAmount()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getDate());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			

			
			
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