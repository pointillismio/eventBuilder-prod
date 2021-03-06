package icecube.daq.eventBuilder.monitoring;

/**
 * Interface between backend and monitoring MBean.
 */
public interface BackEndMonitor
{
    /**
     * Get average millisecond time to dispatch event for this run.
     *
     * @return average dispatch time
     */
    long getAverageDispatchTime();

    /**
     * Get average number of readouts per event.
     *
     * @return readouts/event
     */
    long getAverageReadoutsPerEvent();

    /**
     * Get back-end state.
     *
     * @return state string
     */
    String getBackEndState();

    /**
     * Get back-end timing profile.
     *
     * @return back-end timing profile
     */
    String getBackEndTiming();

    /**
     * Get most recent millisecond time to dispatch event for this run.
     *
     * @return most recent dispatch time
     */
    long getCurrentDispatchTime();

    /**
     * Get the end time for the event being built.
     *
     * @return end time for the event being built
     */
    long getCurrentEventEndTime();

    /**
     * Get the start time for the event being built.
     *
     * @return start time for the event being built
     */
    long getCurrentEventStartTime();

    /**
     * Get most recent splicer.execute() list length for this run.
     *
     * @return most recent splicer.execute() list length
     */
    long getCurrentExecuteListLength();

    /**
     * Get current rate of events per second.
     *
     * @return events/second
     */
    double getEventsPerSecond();

    /**
     * Get maximum millisecond time to dispatch event for this run.
     *
     * @return maximum dispatch time
     */
    long getMaximumDispatchTime();

    /**
     * Get maximum splicer.execute() list length for this run.
     *
     * @return maximum splicer.execute() list length
     */
    long getMaximumExecuteListLength();

    /**
     * Get memory statistics.
     *
     * @return memory statistics
     */
    String getMemoryStatistics();

    /**
     * Get number of readouts which could not be loaded.
     *
     * @return number of bad readouts received since last reset
     */
    long getNumBadReadouts();

    /**
     * Number of trigger requests which could not be loaded.
     *
     * @return number of bad trigger requests since last reset
     */
    long getNumBadTriggerRequests();

    /**
     * Get the number of dispatch times accumulated for this run.
     *
     * @return number of dispatch times
     */
    long getNumDispatchTimes();

    /**
     * Get number of passes through the main loop without a trigger request.
     *
     * @return number of empty loops
     */
    long getNumEmptyLoops();

    /**
     * Get the number of events which could not be delivered for this run.
     *
     * @return number of events which could not be delivered for this run
     */
    long getNumEventsFailed();

    /**
     * Get number of empty events which were ignored.
     *
     * @return number of ignored events
     */
    long getNumEventsIgnored();

    /**
     * Get the number of events delivered to daq-dispatch for this run.
     *
     * @return number of events delivered to daq-dispatch for this run
     */
    long getNumEventsSent();

    /**
     * Get number of calls to SPDataAnalysis.execute().
     *
     * @return number of execute() calls
     */
    int getNumExecuteCalls();

    /**
     * Get the number of readouts to be included in the event being built.
     *
     * @return number of readouts to be included in the event being built
     */
    int getNumReadoutsCached();

    /**
     * Get the number of readouts not included in any event for this run.
     *
     * @return number of readouts not included in any event for this run
     */
    long getNumReadoutsDiscarded();

    /**
     * Get number of readouts queued for processing.
     *
     * @return number of readouts queued
     */
    int getNumReadoutsQueued();

    /**
     * Get the number of readouts received from the string processors
     * for this run.
     *
     * @return number of readouts received from the string processors
     * for this run
     */
    long getNumReadoutsReceived();

    /**
     * Get number of events which could not be created since last reset.
     *
     * @return number of null events since last reset.
     */
    long getNumNullEvents();

    /**
     * Get number of null readouts received since last reset.
     *
     * @return number of null readouts received since last reset.
     */
    long getNumNullReadouts();

    /**
     * Get number of recycled payloads.
     *
     * @return number of recycled payloads
     */
    long getNumRecycled();

    /**
     * Number of trigger requests dropped while stopping.
     *
     * @return number of trigger requests dropped
     */
    long getNumTriggerRequestsDropped();

    /**
     * Get number of trigger requests queued for the back end.
     *
     * @return number of trigger requests queued for the back end
     */
    int getNumTriggerRequestsQueued();

    /**
     * Get number of trigger requests received from the global trigger
     * for this run.
     *
     * @return number of trigger requests received for this run
     */
    long getNumTriggerRequestsReceived();

    /**
     * Get number of calls to SPDataAnalysis.truncate().
     *
     * @return number of truncate() calls
     */
    int getNumTruncateCalls();

    /**
     * Get number of readouts not used for an event since last reset.
     *
     * @return number of unused readouts since last reset.
     */
    long getNumUnusedReadouts();

    /**
     * Get the total number of events from the previous run.
     *
     * @return total number of events sent during the previous run
     */
    long getPreviousRunTotalEvents();

    /**
     * Get current rate of readouts per second.
     *
     * @return readouts/second
     */
    double getReadoutsPerSecond();

    /**
     * Get size of event at maximum millisecond time for this run.
     *
     * @return size of event at maximum dispatch time
     */
    long getSizeOfMaximumDispatchTime();

    /**
     * Get total number of readouts which could not be loaded since last reset.
     *
     * @return total number of bad readouts since last reset
     */
    long getTotalBadReadouts();

    /**
     * Get the total dispatch time accumulated for this run.
     *
     * @return total dispatch time
     */
    long getTotalDispatchTime();

    /**
     * Get the total number of events which could not be delivered
     * since the program began executing.
     *
     * @return total number of events which could not be delivered
     */
    long getTotalEventsFailed();

    /**
     * Total number of empty events which were ignored since last reset.
     *
     * @return total number of ignored events
     */
    long getTotalEventsIgnored();

    /**
     * Get the total number of events delivered to daq-dispatch
     * since the program began executing.
     *
     * @return total number of events delivered to daq-dispatch
     */
    long getTotalEventsSent();

    /**
     * Get the total number of readouts not included in any event
     * since the program began executing.
     *
     * @return total number of readouts not included in any event
     */
    long getTotalReadoutsDiscarded();

    /**
     * Get the total number of readouts received from the string processors
     * since the program began executing.
     *
     * @return total number of readouts received from the string processors
     */
    long getTotalReadoutsReceived();

    /**
     * Get total number of stop messages received from the splicer.
     *
     * @return total number of stop messages received from the splicer
     */
    long getTotalSplicerStopsReceived();

    /**
     * Get total number of trigger requests received from the global trigger
     * since the program began executing.
     *
     * @return total number of trigger requests received
     */
    long getTotalTriggerRequestsReceived();

    /**
     * Get total number of stop messages received from the global trigger
     * input engine.
     *
     * @return total number of stop messages received
     *         from the global trigger input engine
     */
    long getTotalTriggerStopsReceived();

    /**
     * Get total number of stop messages sent to the string processor cache
     * output engine.
     *
     * @return total number of stop messages sent
     *         to the string processor cache output engine
     */
    long getTotalStopsSent();

    /**
     * Get current rate of trigger requests per second.
     *
     * @return trigger requests/second
     */
    double getTriggerRequestsPerSecond();
}
