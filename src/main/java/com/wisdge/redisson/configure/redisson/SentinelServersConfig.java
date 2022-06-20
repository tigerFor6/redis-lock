package com.wisdge.redisson.configure.redisson;

import java.util.List;

public class SentinelServersConfig extends BaseMasterSlaveServersConfig {

	private List<String> sentinelAddresses;

    private String masterName;

    /**
     * Database index used for Redis connection
     */
    private int database = 0;

	public List<String> getSentinelAddresses() {
		return sentinelAddresses;
	}

	public void setSentinelAddresses(List<String> sentinelAddresses) {
		this.sentinelAddresses = sentinelAddresses;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public int getDatabase() {
		return database;
	}

	public void setDatabase(int database) {
		this.database = database;
	}
    
}
