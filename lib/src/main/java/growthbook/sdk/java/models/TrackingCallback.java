package growthbook.sdk.java.models;

/**
 * This callback is called with the {@link Experiment} and {@link ExperimentResult} when an experiment is evaluated.
 */
public interface TrackingCallback {
    /**
     * This callback is called with the {@link Experiment} and {@link ExperimentResult} when an experiment is evaluated.
     * @param experiment the {@link Experiment}
     * @param experimentResult the {@link ExperimentResult}
     * @param <ValueType> the value type for the experiment
     */
    <ValueType> void onTrack(Experiment<ValueType> experiment, ExperimentResult<ValueType> experimentResult);
}
