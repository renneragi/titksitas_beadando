import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Decoder {
	private String input;
	private String fileName;
	private char[] decodedData;


	public Decoder(String fileName) {
		super();
		this.fileName = fileName;
	}


	void readData() throws FileNotFoundException, IOException {
          this.input = new String(Files.readAllBytes(Paths.get(this.fileName)), StandardCharsets.UTF_8);
	}

	void decoeData() {
		char[] dataToEncode = this.input.toCharArray();
		for (int i=0;i < dataToEncode.length; i++) {
            if(dataToEncode[i] != ' '){
                dataToEncode[i]--;
            }
					}
		this.decodedData = dataToEncode;
		this.writeData();
	}

	void writeData(){
        PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter("./target/decodedText.txt"));
			outFile.write("dekódólt szöveg: ");
			outFile.write(this.decodedData);
			outFile.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
