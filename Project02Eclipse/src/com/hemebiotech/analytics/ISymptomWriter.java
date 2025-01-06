package com.hemebiotech.analytics;

import java.util.Map;

/* Interface that writes symptoms :
 * 
 * The implementation of this interface, write the symptoms of a data source and their frequency of occurrence
 * 
 */

public interface ISymptomWriter {

	/*
	 * @param symptoms : A Map with symptoms and their frequencies
	 * 
	 * The key represents the name of the symptom (in string form),
     * and the value represents the number of occurrences of this symptom.
	 */
	
	public void writeSymptoms(Map<String, Integer> symptoms);

}
