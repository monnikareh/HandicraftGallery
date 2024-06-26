package com.handicraftgallery.handicraftgallery;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class PaymentResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String status;
	private String amount;
	private java.lang.String currency;
	private java.lang.String message;
	private java.lang.String transactionId;

	private java.lang.String transactionTime;

	private java.lang.String receiptUrl;

	public PaymentResponse() {
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getCurrency() {
		return this.currency;
	}

	public void setCurrency(java.lang.String currency) {
		this.currency = currency;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.lang.String getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.String amount) {
		this.amount = amount;
	}

	public java.lang.String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(java.lang.String transactionId) {
		this.transactionId = transactionId;
	}

	public java.lang.String getTransactionTime() {
		return this.transactionTime;
	}

	public void setTransactionTime(java.lang.String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public java.lang.String getReceiptUrl() {
		return this.receiptUrl;
	}

	public void setReceiptUrl(java.lang.String receiptUrl) {
		this.receiptUrl = receiptUrl;
	}

	public PaymentResponse(java.lang.String status, java.lang.String amount,
			java.lang.String currency, java.lang.String message,
			java.lang.String transactionId, java.lang.String transactionTime,
			java.lang.String receiptUrl) {
		this.status = status;
		this.amount = amount;
		this.currency = currency;
		this.message = message;
		this.transactionId = transactionId;
		this.transactionTime = transactionTime;
		this.receiptUrl = receiptUrl;
	}

}