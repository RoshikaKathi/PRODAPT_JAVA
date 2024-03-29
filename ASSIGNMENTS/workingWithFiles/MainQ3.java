package workingWithFiles;

import java.util.Map;

public class MainQ3 {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\roshika.k\\Desktop\\TRAINING\\JAVA\\PRODAPT_JAVA\\country.csv\\";
	    Map<String, String> countryCapitalMap = Q3.loadCsvFileToMap(filePath);
	    char startsWith = 'A'; // no country name start with s actually
	    String outputFile = "D:\\filtered_countries.txt" ;
	    Q3.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
	    System.out.println("Filtered countries have been written to the file.");
	}
	}