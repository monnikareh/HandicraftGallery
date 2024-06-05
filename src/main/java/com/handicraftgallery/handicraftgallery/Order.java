package com.handicraftgallery.handicraftgallery;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.handicraftgallery.handicraftgallery.User user;
	private com.handicraftgallery.handicraftgallery.BillingInformation billingInformation;
	private com.handicraftgallery.handicraftgallery.PaymentInformation paymentInformation;
	private java.lang.String orderId;
	private java.lang.String date;
	private com.handicraftgallery.handicraftgallery.PaymentResponse paymentResponse;
	private java.lang.String discountCode;

	public Order() {
	}

	public com.handicraftgallery.handicraftgallery.User getUser() {
		return this.user;
	}

	public void setUser(com.handicraftgallery.handicraftgallery.User user) {
		this.user = user;
	}

	public com.handicraftgallery.handicraftgallery.BillingInformation getBillingInformation() {
		return this.billingInformation;
	}

	public void setBillingInformation(
			com.handicraftgallery.handicraftgallery.BillingInformation billingInformation) {
		this.billingInformation = billingInformation;
	}

	public com.handicraftgallery.handicraftgallery.PaymentInformation getPaymentInformation() {
		return this.paymentInformation;
	}

	public void setPaymentInformation(
			com.handicraftgallery.handicraftgallery.PaymentInformation paymentInformation) {
		this.paymentInformation = paymentInformation;
	}

	public java.lang.String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(java.lang.String orderId) {
		this.orderId = orderId;
	}

	public java.lang.String getDate() {
		return this.date;
	}

	public void setDate(java.lang.String date) {
		this.date = date;
	}

	public com.handicraftgallery.handicraftgallery.PaymentResponse getPaymentResponse() {
		return this.paymentResponse;
	}

	public void setPaymentResponse(
			com.handicraftgallery.handicraftgallery.PaymentResponse paymentResponse) {
		this.paymentResponse = paymentResponse;
	}

	public java.lang.String getDiscountCode() {
		return this.discountCode;
	}

	public void setDiscountCode(java.lang.String discountCode) {
		this.discountCode = discountCode;
	}

	public Order(
			com.handicraftgallery.handicraftgallery.User user,
			com.handicraftgallery.handicraftgallery.BillingInformation billingInformation,
			com.handicraftgallery.handicraftgallery.PaymentInformation paymentInformation,
			java.lang.String orderId,
			java.lang.String date,
			com.handicraftgallery.handicraftgallery.PaymentResponse paymentResponse,
			java.lang.String discountCode) {
		this.user = user;
		this.billingInformation = billingInformation;
		this.paymentInformation = paymentInformation;
		this.orderId = orderId;
		this.date = date;
		this.paymentResponse = paymentResponse;
		this.discountCode = discountCode;
	}

}