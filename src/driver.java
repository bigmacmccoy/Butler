import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.*;

public class driver {

	public static void main(String[] args) {
		/*
		 * Startup Sequence: - Load current dictionary - Check for new
		 * dictionary - Load voice recognition - Load text to speech - End
		 * startup sequence
		 */
		startupSequence startup = new startupSequence();
		startup.run();
	}
}