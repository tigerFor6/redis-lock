package com.wisdge.redisson.configure;

import com.wisdge.redisson.configure.redisson.Config;
import com.wisdge.redisson.configure.redisson.ConfigFile;
import org.redisson.spring.cache.CacheConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "spring.redisson")
public class RedissonProperties {

	/** 属性的配置方式 */
	private Config config;

	/** 文件的配置方式 */
	private ConfigFile configFile = new ConfigFile();

	/** 方法注解缓存的配置 */
	private Map<String, CacheConfig> caches;

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public ConfigFile getConfigFile() {
		return configFile;
	}

	public void setConfigFile(ConfigFile configFile) {
		this.configFile = configFile;
	}

	public Map<String, CacheConfig> getCaches() {
		return caches;
	}

	public void setCaches(Map<String, CacheConfig> caches) {
		this.caches = caches;
	}

}
