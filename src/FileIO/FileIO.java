package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class FileIO {

	public static void main(String[] args) {

		String[] names = { "Aa", "Bb", "Cc" };
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("1 - write to a file" + "\n");
			writer.write("2 - write to a file" + "\n");
			for (String s : names) {
				writer.write(s + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
