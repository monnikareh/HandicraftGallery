package com.handicraftgallery.handicraftgallery;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class PaymentInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String cardNumber;
	private java.lang.String expirationDate;
	private java.lang.String CVC;

	public PaymentInformation() {
	}

	public java.lang.String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(java.lang.String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public java.lang.String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(java.lang.String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public java.lang.String getCVC() {
		return this.CVC;
	}

	public void setCVC(java.lang.String CVC) {
		this.CVC = CVC;
	}

	public PaymentInformation(java.lang.String cardNumber,
			java.lang.String expirationDate, java.lang.String CVC) {
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.CVC = CVC;
	}

}