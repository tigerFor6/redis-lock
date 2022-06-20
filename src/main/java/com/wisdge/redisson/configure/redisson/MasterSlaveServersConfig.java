package com.wisdge.redisson.configure.redisson;

import java.util.Set;

public class MasterSlaveServersConfig extends BaseMasterSlaveServersConfig {

	/**
     * Redis slave servers addresses
     */
    private Set<String> slaveAddresses;

    /**
     * Redis master server address
     */
    private String masterAddress;

    /**
     * Database index used for Redis connection
     */
    private int database = 0;

	public Set<String> getSlaveAddresses() {
		return slaveAddresses;
	}

	public void setSlaveAddresses(Set<String> slaveAddresses) {
		this.slaveAddresses = slaveAddresses;
	}

	public String getMasterAddress() {
		return masterAddress;
	}

	public void setMasterAddress(String masterAddress) {
		this.masterAddress = masterAddress;
	}

	public int getDatabase() {
		return database;
	}

	public void setDatabase(int database) {
		this.database = database;
	}
    
}
