package com.wisdge.redisson.configure.redisson;

import java.util.List;

public class ReplicatedServersConfig extends BaseMasterSlaveServersConfig {

	/**
     * Replication group node urls list
     */
    private List<String> nodeAddresses;

    /**
     * Replication group scan interval in milliseconds
     */
    private int scanInterval = 1000;

    /**
     * Database index used for Redis connection
     */
    private int database = 0;

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

	public int getDatabase() {
		return database;
	}

	public void setDatabase(int database) {
		this.database = database;
	}
    
}
