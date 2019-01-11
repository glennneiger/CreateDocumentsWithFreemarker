package com.jitin.createdocswithfreemarker.model;

public class Address {
	private String street;
	private String city;
	private String state;
	private Integer housenumber;

	public Address() {

	}

	public Address(Integer housenumber, String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.housenumber = housenumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(Integer housenumber) {
		this.housenumber = housenumber;
	}

}
