package com.handicraftgallery.handicraftgallery;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Address implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String street;
	private java.lang.String city;
	private java.lang.String state;
	private java.lang.String postalCode;

	public Address() {
	}

	public java.lang.String getStreet() {
		return this.street;
	}

	public void setStreet(java.lang.String street) {
		this.street = street;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(java.lang.String postalCode) {
		this.postalCode = postalCode;
	}

	public Address(java.lang.String street, java.lang.String city,
			java.lang.String state, java.lang.String postalCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

}