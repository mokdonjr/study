package classtest.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileUtil {

	public static String readFile(String path) {
		StringBuilder sb = new StringBuilder();
		try{
            File file = new File(path);
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
            	sb.append(line);
            }
            bufReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return sb.toString();
	}
}
