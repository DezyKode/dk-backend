package com.DezyKode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table

public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 30)
	private String firstName;
	@Column(length = 30)
	private String lastName;
	@Column(length = 20)
	private String phoneNumber;
	@Column(length = 50)
	private String emailAddress;
	@Column(length = 20)
	private String gender;
	@Column(length = 30)
	private String city;
	@Column(length = 150)
	private String address;
	@Column(length = 30)
	private String state;
	@Column(length = 30)
	private String interestedFor;
	@Column(length = 30)
	private String educationLevel;
	@Column(length = 100)
	private String reference;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInterestedFor() {
		return interestedFor;
	}
	public void setInterestedFor(String interestedFor) {
		this.interestedFor = interestedFor;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Enquiry(Long id, String firstName, String lastName, String phoneNumber, String emailAddress, String gender,
			String city, String address, String state, String interestedFor, String educationLevel, String reference) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.gender = gender;
		this.city = city;
		this.address = address;
		this.state = state;
		this.interestedFor = interestedFor;
		this.educationLevel = educationLevel;
		this.reference = reference;
	}
	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", emailAddress=" + emailAddress + ", gender=" + gender + ", city=" + city
				+ ", address=" + address + ", state=" + state + ", interestedFor=" + interestedFor + ", educationLevel="
				+ educationLevel + ", reference=" + reference + "]";
	}
	

}
