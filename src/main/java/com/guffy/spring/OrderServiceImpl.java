package com.guffy.spring;

import com.guffy.vo.ProductVO;

public class OrderServiceImpl extends AbstractService implements OrderService {

	private NotifyService ns;

	public NotifyService getNs() {
		return ns;
	}

	public void setNs(NotifyService ns) {
		this.ns = ns;
	}

	public OrderServiceImpl() {

	}

	public OrderServiceImpl(final String manufacturer, final String version) {
		super(manufacturer, version);
		System.out.println("iNSIDE cONSTRUCTOR wITH NO TYPE ");
	}

	public OrderServiceImpl(final String manufacturer, final String version, int type) {
		super(manufacturer, version);
		System.out.println("iNSIDE cONSTRUCTOR wITH integer TYPE ");
	}

	public OrderServiceImpl(final String manufacturer, final String version, String dummy) {
		super(manufacturer, version);
		System.out.println("iNSIDE cONSTRUCTOR wITH string TYPE ");
	}

	public OrderServiceImpl(final String manufacturer, final String version, final ProductIdGenerator idGenerator) {
		super(manufacturer, version, idGenerator);
	}

	public void initialize() {

		System.out.println("inside init");
		this.setDefaultVersion("1.0");

	}

	public void cleanUp() {

		System.out.println("inside cleanup()");
		this.setDefaultVersion(null);

	}

	public ProductVO createOrder(ProductVO vo) {

		vo.setVersion(getDefaultVersion());
		vo.setManufacturer(this.getManf());
		vo.setId(super.getIdGenerator().generateId());
		ns.notifyService();
		return vo;
	}

}
