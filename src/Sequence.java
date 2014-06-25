
public interface Sequence {
	ProgressMeasure run();
	ProgressMeasure checkProgress();
	ProgressMeasure pause();
	void stop();
}
