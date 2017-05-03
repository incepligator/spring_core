package com.guffy.spring;

public abstract class AbstractService {

	public AbstractService() {

	}

	public AbstractService(final String manufacturer, final String version) {
		this.defaultVersion = version;
		this.manf = manufacturer;

	}

	public AbstractService(final String manufacturer, final String version, final ProductIdGenerator idGenerator) {
		this.defaultVersion = version;
		this.manf = manufacturer;
		this.idGenerator = idGenerator;
	}

	private String defaultVersion;
	private String manf;
	private ProductIdGenerator idGenerator;

	public String getDefaultVersion() {
		return defaultVersion;
	}

	public void setDefaultVersion(String defaultVersion) {
		this.defaultVersion = defaultVersion;
	}

	public String getManf() {
		return manf;
	}

	public void setManf(String manf) {
		this.manf = manf;
	}

	public ProductIdGenerator getIdGenerator() {
		return idGenerator;
	}

	public void setIdGenerator(ProductIdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

}
