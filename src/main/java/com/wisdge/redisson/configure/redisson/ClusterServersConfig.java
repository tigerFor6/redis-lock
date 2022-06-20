package com.wisdge.redisson.configure.redisson;

import java.util.List;

public class ClusterServersConfig extends BaseMasterSlaveServersConfig {

	/**
     * Redis cluster node urls list
     */
    private List<String> nodeAddresses;

    /**
     * Redis cluster scan interval in milliseconds
     */
    private int scanInterval = 1000;

	public List<String> getNodeAddresses() {
		return nodeAddresses;
	}

	public void setNodeAddresses(List<String> nodeAddresses) {
		this.nodeAddresses = nodeAddresses;
	}

	public int getScanInterval() {
		return scanInterval;
	}

	public void setScanInterval(int scanInterval) {
		this.scanInterval = scanInterval;
	}
    
}
