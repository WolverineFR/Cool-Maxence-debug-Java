package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String args[]) {

		String filepath = ("../Project02Eclipse/symptoms.txt");

		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile(filepath);
		WriteSymptomDataToFile writeSymptom = new WriteSymptomDataToFile();
		AnalyticsCounter counter = new AnalyticsCounter(readSymptom, writeSymptom);

		List<String> symptoms = readSymptom.GetSymptoms();

		Map<String, Integer> symptomCounts = counter.countSymptoms(symptoms);

		Map<String, Integer> sortedSymptoms = counter.sortSymptoms(symptomCounts);

		counter.writeSymptoms(sortedSymptoms);



	}

}
