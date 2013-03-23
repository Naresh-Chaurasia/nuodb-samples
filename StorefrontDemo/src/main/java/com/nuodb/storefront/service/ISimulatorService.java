package com.nuodb.storefront.service;

import java.util.Collection;
import java.util.Map;

import com.nuodb.storefront.model.WorkloadStats;
import com.nuodb.storefront.model.WorkloadStep;
import com.nuodb.storefront.model.WorkloadType;

public interface ISimulatorService {
    public void addWorkload(WorkloadType workload, int numUsers, int entryDelayMs);
    
    public void downsizeWorkload(WorkloadType workload, int newLimit);
    
    public void removeAll();
    
    public Collection<WorkloadStats> getWorkloadStats();
    
    public Map<WorkloadStep, Integer> getExecutionCounts();
    
    /**
     * Blocking call to stop all simulator threads, running work, and queued work.
     * Once this method is called, you cannot add additional workloads.
     */
    public void shutdown();
}
