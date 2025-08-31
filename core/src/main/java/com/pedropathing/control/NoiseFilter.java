package com.pedropathing.control;

public interface NoiseFilter {
    /**
     * Gets the current state of the filter.
     * @return the current state of the filter
     */
    double getState();

    /**
     * Updates the filter with new data.
     * @param updateData the new data to update the filter with
     * @param updateProjection the projection of the new data
     */
    void update(double updateData, double updateProjection);

    /**
     * Resets the filter to its initial state.
     */
    default void reset() {
        reset(0, 1, 1);
    };

    /**
     * Resets the filter to a specified state.
     * @param startState the state to reset the filter to
     * @param startVariance the variance to reset the filter to
     * @param startGain the gain to reset the filter to
     */
    void reset(double startState, double startVariance, double startGain);
}
