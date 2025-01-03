package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {

		try (FileWriter writer = new FileWriter("result.out")) {
			for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
				String symptom = entry.getKey();
				int count = entry.getValue();
				writer.write(symptom + ": " + count + "\n");
			}
			System.out.println("Symptômes écrits dans le fichier : ");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
