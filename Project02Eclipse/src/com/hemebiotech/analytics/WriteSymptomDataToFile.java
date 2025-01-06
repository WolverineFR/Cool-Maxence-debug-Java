package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/*
 * Implementation of the {@link ISymptomWriter} interface for writing symptom data and their frequency to a file.
 * 
 * This class writes each symptom and its number of occurrences to an output file named "result.out", located in the parent directory.
 */

public class WriteSymptomDataToFile implements ISymptomWriter {
	
	/*
	 * Write the symptoms and their frequency in the "result.out" file.
	 * 
	 * Each line of the file contains a symptom and its number of occurrences, in the following format: "symptom: frequency". Example: (dry mouth: 3).
	 * 
	 * @param symptoms: A map containing the symptoms as keys and their frequency as values.
	 * 
	 * @throws IOException If a write error occurs in the file.
	 */

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		try (FileWriter writer = new FileWriter("../Project02Eclipse/result.out")) {
			for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
				String symptom = entry.getKey();
				int count = entry.getValue();
				writer.write(symptom + ": " + count + "\n");
			}
			System.out.println("Symptoms written successfully to result.out");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
