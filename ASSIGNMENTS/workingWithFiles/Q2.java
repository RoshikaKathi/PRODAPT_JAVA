package workingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 
public class Q2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		System.out.println("C:\\Users\\roshika.k\\Desktop\\TRAINING\\JAVA\\PRODAPT_JAVA\\country.csv\\");
		//2
		Map<String,String> countryMap = new HashMap<String,String>();
		String country = null;
		String capital = null;
		File file = new File("C:\\Users\\roshika.k\\Desktop\\TRAINING\\JAVA\\PRODAPT_JAVA\\country.csv\\");
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine())!= null)
			{
				String[] countryCapValue = line.split(",");
				countryMap.put(countryCapValue[0], countryCapValue[1]);
			}
			System.out.println(countryMap);
			fr.close();
			br.close();

		       File newFile = new File("D:\\newcountry.csv");
			if(!newFile.exists())
			{
				boolean flag = newFile.createNewFile();
				if(flag) {
					System.out.println("New File Created");
				}
			}
			FileWriter fw = new FileWriter(newFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("country,capital\n");
			bw.write("Nepal,Kathmandu\n");
			bw.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
 
}