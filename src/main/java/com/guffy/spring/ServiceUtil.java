package com.guffy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.guffy.rest.ProductUtil;

@Component
public class ServiceUtil {

	@Autowired
	@Qualifier("smsService")
	private NotifyService smsService;

	@Autowired
	@Qualifier("mailService")
	private NotifyService mailService;

	@Autowired
	private ProductUtil productUtil;

	@Autowired
	private ProductIdGenerator idGenerator;

	public NotifyService getSmsService() {
		return smsService;
	}

	public void setSmsService(NotifyService smsService) {
		this.smsService = smsService;
	}

	public NotifyService getMailService() {
		return mailService;
	}

	public void setMailService(NotifyService mailService) {
		this.mailService = mailService;
	}

	public ProductUtil getProductUtil() {
		return productUtil;
	}

	public void setProductUtil(ProductUtil productUtil) {
		this.productUtil = productUtil;
	}

	public ProductIdGenerator getIdGenerator() {
		return idGenerator;
	}

	public void setIdGenerator(ProductIdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	public String toString() {
		return "ServiceUtil [smsService=" + smsService + ", mailService=" + mailService + ", productUtil=" + productUtil
				+ ", idGenerator=" + idGenerator + "]";
	}

}
