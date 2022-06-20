package com.wisdge.redisson.configure.redisson;

public class ConfigFile {

	/** json格式配置文件*/
	private String json;
	
	/** yaml格式配置文件*/
	private String yaml;

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getYaml() {
		return yaml;
	}

	public void setYaml(String yaml) {
		this.yaml = yaml;
	}
}
