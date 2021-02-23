import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;



public class Encoder {

	private String input;
	private String fileName;
	private char[] encodedData;
		
	
	public Encoder(String fileName) {
		super();
		this.fileName = fileName;
	}


	void readData() throws FileNotFoundException, IOException {      
          this.input = new String(Files.readAllBytes(Paths.get(this.fileName)), StandardCharsets.UTF_8);
	}
	
	void encoeData() {
		char[] dataToEncode = this.input.toCharArray();
		for (int i=0;i < dataToEncode.length; i++) {
			dataToEncode[i]++;
		}
		this.encodedData = dataToEncode;
		this.writeData();
	}
	
	void writeData(){      
        PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter("./target/encodedText.txt"));
			outFile.write(this.encodedData);
			outFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	}
	
}

