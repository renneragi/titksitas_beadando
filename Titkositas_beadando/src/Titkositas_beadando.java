
import java.io.FileNotFoundException;
import java.io.IOException;

public class Titkositas_beadando {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	     	      
	      Encoder encoder = new Encoder("./target/input.txt");
	      encoder.readData();
	      encoder.encoeData();
	      
	      Decoder decoder = new Decoder("./target/encodedText.txt");
	      decoder.readData();
	      decoder.decoeData();
	        
}

}