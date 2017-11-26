import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class CreatingNotePadFile {

	/// write to file
	@Test
	public void WritingNotePad() throws IOException {
		PrintWriter writer = new PrintWriter("C:\\Users\\Mohin\\Desktop\\JavaNotePad.txt", "UTF-8");
		writer.println("Suman");
		writer.println("Surela");
		writer.println("Spriha");
		writer.println("Shreya");
		writer.close();
		
	
		
		

}
	
	
	
	
	
	@Test
	public void ReadingText()
	{
		
	        try {
	            FileReader reader = new FileReader("C:\\Users\\Mohin\\Desktop\\JavaNotePad.txt");
	            BufferedReader bufferedReader = new BufferedReader(reader);
	 
	            String line;
	 
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	}

