import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.*;


public class startupSequence implements Sequence {
	
	ProgressMeasure progress = new ProgressMeasure(true, "Startup");
	
	public startupSequence(){
		progress.addTask("Load local dictionary");
		progress.addTask("Load local variables");
		progress.addTask("Check for new dictionary");
		progress.addTask("Load voice recognition");
		progress.addTask("Load text to speech");
		progress.addTask("Initiate Greeting");
	}
	public ProgressMeasure run(){
		// Use the JSON Tokener to parse the dictionary. Or should I do this on demand?
		try {
			FileReader in = new FileReader("Local.JSON");
			BufferedReader reader = new BufferedReader(in);
			JSONTokener tokener = new JSONTokener(reader);
			JSONObject dictionary = new JSONObject(tokener);
			progress.markTaskComplete("Load local dictionary");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException je) {
			// TODO Auto-generated catch block
			je.printStackTrace();
		}
		
		return progress;
	}
	public ProgressMeasure checkProgress() {
		return null;
	}
	public ProgressMeasure pause() {
		return null;
	}
	public void stop() {
		
	}
}
