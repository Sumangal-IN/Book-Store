package com.kingfisher.bookStore.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "datasource")
public class DBConfig {

	private String pg_host;
	private String pg_port;
	private String pg_username;
	private String pg_password;
	private String pg_db;

	public DBConfig() {
	}

	public String getPg_host() {
		return pg_host;
	}

	public void setPg_host(String pg_host) {
		this.pg_host = pg_host;
	}

	public String getPg_port() {
		return pg_port;
	}

	public void setPg_port(String pg_port) {
		this.pg_port = pg_port;
	}

	public String getPg_username() {
		return pg_username;
	}

	public void setPg_username(String pg_username) {
		this.pg_username = pg_username;
	}

	public String getPg_password() {
		return pg_password;
	}

	public void setPg_password(String pg_password) {
		this.pg_password = pg_password;
	}

	public String getPg_db() {
		return pg_db;
	}

	public void setPg_db(String pg_db) {
		this.pg_db = pg_db;
	}

}