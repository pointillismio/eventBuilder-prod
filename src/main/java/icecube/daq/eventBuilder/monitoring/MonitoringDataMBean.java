package icecube.daq.eventBuilder.monitoring;

/**
 * MBean interface for monitored back-end data.
 */
public interface MonitoringDataMBean
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
     * @return average readouts per event
     */
    long getAverageReadoutsPerEvent();

    /**
     * Get back-end state.
     *
     * @return back end state
     */
    String getBackEndState();

    /**
     * Get back-end timing profile.
     *
     * @return back end timing
     */
    String getBackEndTiming();

    /**
     * Get most recent millisecond time to dispatch event for this run.
     *
     * @return current dispatch time
     */
    long getCurrentDispatchTime();

    /**
     * Get the end time for the event being built.
     *
     * @return current event end time
     */
    long getCurrentEventEndTime();

    /**
     * Get the start time for the event being built.
     *
     * @return current event start time
     */
    long getCurrentEventStartTime();

    /**
     * Get most recent splicer.execute() list length for this run.
     *
     * @return current execute list length
     */
    long getCurrentExecuteListLength();

    /**
     * Get current rate of events per second.
     *
     * @return events per second
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
     * @return maximum execute list length
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
     * @return num bad readouts
     */
    long getNumBadReadouts();

    /**
     * Number of trigger requests which could not be loaded.
     *
     * @return num bad trigger requests
     */
    long getNumBadTriggerRequests();

    /**
     * Get the number of dispatch times accumulated for this run.
     *
     * @return num dispatch times
     */
    long getNumDispatchTimes();

    /**
     * Get number of passes through the main loop without a trigger request.
     *
     * @return num empty loops
     */
    long getNumEmptyLoops();

    /**
     * Get the number of events which could not be delivered for this run.
     *
     * @return num events failed
     */
    long getNumEventsFailed();

    /**
     * Get number of empty events which were ignored.
     *
     * @return num events ignored
     */
    long getNumEventsIgnored();

    /**
     * Get the number of events delivered to daq-dispatch for this run.
     *
     * @return num events sent
     */
    long getNumEventsSent();

    /**
     * Get number of calls to SPDataAnalysis.execute().
     *
     * @return num execute calls
     */
    int getNumExecuteCalls();

    /**
     * Get number of events which could not be created since last reset.
     *
     * @return num null events
     */
    long getNumNullEvents();

    /**
     * Get number of null readouts received since last reset.
     *
     * @return num null readouts
     */
    long getNumNullReadouts();

    /**
     * Get the number of readouts to be included in the event being built.
     *
     * @return num readouts cached
     */
    int getNumReadoutsCached();

    /**
     * Get the number of readouts not included in any event for this run.
     *
     * @return num readouts discarded
     */
    long getNumReadoutsDiscarded();

    /**
     * Get number of readouts queued for processing.
     *
     * @return num readouts queued
     */
    int getNumReadoutsQueued();

    /**
     * Get the number of readouts received from the string processors for this
     * run.
     *
     * @return num readouts received
     */
    long getNumReadoutsReceived();

    /**
     * Get number of recycled payloads.
     *
     * @return num recycled
     */
    long getNumRecycled();

    /**
     * Number of trigger requests dropped while stopping.
     *
     * @return num trigger requests dropped
     */
    long getNumTriggerRequestsDropped();

    /**
     * Get number of trigger requests queued for the back end.
     *
     * @return num trigger requests queued
     */
    int getNumTriggerRequestsQueued();

    /**
     * Get number of trigger requests received from the global trigger for this
     * run.
     *
     * @return num trigger requests received
     */
    long getNumTriggerRequestsReceived();

    /**
     * Get number of calls to SPDataAnalysis.truncate().
     *
     * @return num truncate calls
     */
    int getNumTruncateCalls();

    /**
     * Get number of readouts not used for an event since last reset.
     *
     * @return num unused readouts
     */
    long getNumUnusedReadouts();

    /**
     * Get the total number of events from the previous run.
     *
     * @return previous run total events
     */
    long getPreviousRunTotalEvents();

    /**
     * Get current rate of readouts per second.
     *
     * @return readouts per second
     */
    double getReadoutsPerSecond();

    /**
     * Get size of event at maximum millisecond time for this run.
     *
     * @return size of maximum dispatch time
     */
    long getSizeOfMaximumDispatchTime();

    /**
     * Get total number of readouts which could not be loaded since last reset.
     *
     * @return total bad readouts
     */
    long getTotalBadReadouts();

    /**
     * Get the total dispatch time accumulated for this run.
     *
     * @return total dispatch time
     */
    long getTotalDispatchTime();

    /**
     * Get the total number of events which could not be delivered since the
     * program began executing.
     *
     * @return total events failed
     */
    long getTotalEventsFailed();

    /**
     * Total number of empty events which were ignored since last reset.
     *
     * @return total events ignored
     */
    long getTotalEventsIgnored();

    /**
     * Get the total number of events delivered to daq-dispatch since the
     * program began executing.
     *
     * @return total events sent
     */
    long getTotalEventsSent();

    /**
     * Get total number of stop messages received from the global trigger.
     *
     * @return total global trig stops received
     */
    long getTotalGlobalTrigStopsReceived();

    /**
     * Get the total number of readouts not included in any event since the
     * program began executing.
     *
     * @return total readouts discarded
     */
    long getTotalReadoutsDiscarded();

    /**
     * Get the total number of readouts received from the string processors
     * since the program began executing.
     *
     * @return total readouts received
     */
    long getTotalReadoutsReceived();

    /**
     * Get total number of stop messages received from the splicer.
     *
     * @return total splicer stops received
     */
    long getTotalSplicerStopsReceived();

    /**
     * Get total number of stop messages sent to the string processor cache
     * output engine.
     *
     * @return total stops sent
     */
    long getTotalStopsSent();

    /**
     * Get total number of trigger requests received from the global trigger
     * since the program began executing.
     *
     * @return total trigger requests received
     */
    long getTotalTriggerRequestsReceived();

    /**
     * Get total number of stop messages received from the global trigger input
     * engine.
     *
     * @return total trigger stops received
     */
    long getTotalTriggerStopsReceived();

    /**
     * Get current rate of trigger requests per second.
     *
     * @return trigger requests per second
     */
    double getTriggerRequestsPerSecond();
}
