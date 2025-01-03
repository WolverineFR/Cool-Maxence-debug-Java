package com.hemebiotech.analytics;

import java.util.List;

//import com.hemebiotech.analytics.*;

public class Main {

	public static void main(String args[]) {

		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("../Project02Eclipse/symptoms.txt");
		//WriteSymptomDataToFile writeSymptom = new WriteSymptomDataToFile();
		
		List<String>symptoms = readSymptom.GetSymptoms();
		if (symptoms != null) {
			System.out.println(symptoms);
		}
		
	}
	
}
