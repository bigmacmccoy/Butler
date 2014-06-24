import java.util.ArrayList;

// A variable to measure the progress of individual tasks and the total progress of a sequence

public class ProgressMeasure {
	private boolean verboseMode = false;
	private String sequenceName;
	private int numberOfTasks;
	private ArrayList<BondedPair> taskList;
	private double sequenceCompletionPercentage;
	
	public ProgressMeasure(boolean verbose, String sequenceName){
		if(verbose){
			this.verboseMode = true;
		}
		this.sequenceName = sequenceName;
		this.sequenceCompletionPercentage = 0.0;
		this.numberOfTasks = 0;
		this.taskList = new ArrayList<BondedPair>();
	}
	public void addTask(String taskName){
		BondedPair newPair = new BondedPair(taskName, 0.0);
		this.taskList.add(newPair);
		this.numberOfTasks = this.taskList.size();
	}
	public void markTaskComplete(String taskName){
		for(BondedPair pair : this.taskList){
			if(pair.getString().equalsIgnoreCase(taskName)){
				pair.setNumber(100.0);
			}
		}
		if(this.verboseMode){
			this.calculateSequenceCompletionPercentage();
			//Report(this.sequenceCompletionPercentage);
			System.out.println(this.sequenceCompletionPercentage + "%");
		}
	}
	public double getCompletionPercentage(){
		this.calculateSequenceCompletionPercentage();
		if((this.verboseMode) && (this.sequenceCompletionPercentage == 100.0)){
			//Report(this.sequenceCompletionPercentage);
			System.out.println(this.sequenceName + " Sequence Completed.");
		}
		return this.sequenceCompletionPercentage;
	}
	private void calculateSequenceCompletionPercentage(){
		double total = 0;
		for(BondedPair pair : this.taskList){
			total += pair.getNumber();
		}
		if(total > 0){
			this.sequenceCompletionPercentage = total/this.numberOfTasks;
		}else{
			this.sequenceCompletionPercentage = 0;
		}
	}
}
