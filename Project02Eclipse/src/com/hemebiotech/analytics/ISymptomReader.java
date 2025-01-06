package com.hemebiotech.analytics;

import java.util.List;

/* Interface that reads symptoms :
 * 
 * The implementation of this interface, reads the symptoms of a data source and returns them as a list of character strings
 */

public interface ISymptomReader {
	
	/* 
	 * @return a string list containing the symptoms
	 */

	List<String> GetSymptoms();
}
