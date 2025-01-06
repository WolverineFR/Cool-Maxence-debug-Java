package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Implementation of the {@link ISymptomReader} interface to read symptom data from a file.
 * 
 * This class reads a text file line by line, where each line represents a symptom, and returns the list of symptoms.
 */

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/*
	 * Constructor of the ReadSymptomDataFromFile class.
	 * 
	 * @param filepath : The path of the file to be read. Each line of the file must
	 * represent a symptom.
	 */

	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/*
	 * Reads symptoms from the specified file and returns them as a list. 
	 * If the file path is null or an error occurs during reading, an empty list is returned.
	 * 
	 * @return A list of strings representing the symptoms read from the file.
	 */

	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
