package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/*
 * Main class for running the symptom analysis application.
 *
 * This class reads the symptom data, counts it, sorts it and writes the results to a file.
 */

public class Main {

	public static void main(String args[]) {

		// Path to symptom file
		String filepath = ("../Project02Eclipse/symptoms.txt");

		// Constructor of the necessary components
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile(filepath);
		WriteSymptomDataToFile writeSymptom = new WriteSymptomDataToFile();
		AnalyticsCounter counter = new AnalyticsCounter(readSymptom, writeSymptom);

		// Step 1: Reading symptoms from the file
		List<String> symptoms = readSymptom.GetSymptoms();

		// Step 2: Count the number of occurrences of each symptom
		Map<String, Integer> symptomCounts = counter.countSymptoms(symptoms);

		// Step 3: Sort symptoms alphabetically
		Map<String, Integer> sortedSymptoms = counter.sortSymptoms(symptomCounts);

		// Step 4: Writing results to file
		counter.writeSymptoms(sortedSymptoms);

	}

}
