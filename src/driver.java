
public class driver {

	public static void main(String[] args) {
		/* Startup Sequence:
		 * 	- Load current dictionary
		 * 	- Check for new dictionary
		 *  - Load voice recognition
		 *  - Load text to speech
		 *  - End startup sequence
		 * 
		 * 
		 */
	}
	public ProgressMeasure startupSequence(){
		ProgressMeasure progress = new ProgressMeasure(true, "Startup");
		progress.addTask("Load local dictionary");
		progress.addTask("Load local variables");
		progress.addTask("Check for new dictionary");
		progress.addTask("Load voice recognition");
		progress.addTask("Load text to speech");
		progress.addTask("Initiate Greeting");
		
		// Use the JSON Tokener to parse the dictionary. Or should I do this on demand?
		
		return progress;
	}
}