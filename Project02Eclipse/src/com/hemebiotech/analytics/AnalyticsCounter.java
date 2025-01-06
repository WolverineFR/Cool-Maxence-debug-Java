package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Class responsible for reading, counting, sorting and writing symptoms.
 * 
 *  This class uses a symptom reader ({@link ISymptomReader}) to get a list of symptoms, counts their frequency,
 *  sorts them, and writes them to a file via a symptom writer ({@link ISymptomWriter}).
 */

public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;

	/*
	 * AnalyticsCounter class constructor.
	 * 
	 * @param reader: An object implementing {@link ISymptomReader} to read
	 * symptoms.
	 * 
	 * @param writer: An object implementing {@link ISymptomWriter} to write
	 * symptoms.
	 */

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	/*
	 * Retrieves the list of symptoms from the symptom reader.
	 * 
	 * @return: A list of strings representing the symptoms read.
	 */

	public List<String> getSymptoms() {
		return reader.GetSymptoms();
	}

	/*
	 * Counts the number of occurrences of each symptom in a list.
	 * 
	 * @param: symptoms: A list of strings containing symptoms.
	 * 
	 * @return: A map where the keys are the symptoms and the values are their
	 * frequencies.
	 */

	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> symptomCounts = new HashMap<>();

		for (String symptom : symptoms) {
			symptomCounts.put(symptom, symptomCounts.getOrDefault(symptom, 0) + 1);
		}

		return symptomCounts;

	}

	/*
	 * Sort symptoms alphabetically.
	 * 
	 * @param symptoms: A map containing symptoms and their frequencies.
	 * 
	 * @return: A new map sorted alphabetically by key (symptoms).
	 */

	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		return new TreeMap<>(symptoms);
	}

	/*
	 * Writes symptoms and their frequencies in a source specified by the writer.
	 * 
	 * @param symptoms: A map containing the symptoms as keys and their frequencies
	 * as values.
	 */

	public void writeSymptoms(Map<String, Integer> symptoms) {
		writer.writeSymptoms(symptoms);
	}

}
