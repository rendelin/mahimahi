package mahimahi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class TextFromJar {
	static.public List<String> readTextFromJar(String filename) {
		InputStream is = null;
		BufferedReader reader = null;
		String line;
		List<String> retList = new LinkedList<>();

		try {
			is = TextFromJar.class.getResourceAsStream(filename);
			reader = new BufferedReader(new InputStreamReader(is));
			while (null != (line = reader.readLine()))
				retList.add(line);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return retList;
	}
}
