package org.wecancodeit.reviewssitefullstack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CSVReader {
	// This class was an attempt to import Amazon reviews into the project. That
	// endeavor has yet to be completed, but this does not affect the rest of the
	// project as is so it's been allowed to remain.

	private String filePath;

	public CSVReader(String filePath) {
		this.filePath = filePath;
	}

	public Collection<String> parse() {
		String line = "";
		List<String> result = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			while ((line = br.readLine()) != null) {
				result.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}