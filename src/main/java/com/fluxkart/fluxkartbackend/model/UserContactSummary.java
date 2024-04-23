package com.fluxkart.fluxkartbackend.model;

import java.util.List;

public class UserContactSummary {
	
	private Long primaryContactId;
	private List<String> email;
	private List<String> phoneNumbers;
	private List<Long> secondaryContactIds;

	public Long getPrimaryContactId() {
		return primaryContactId;
	}

	public void setPrimaryContactId(Long primaryContactId) {
		this.primaryContactId = primaryContactId;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<Long> getSecondaryContactIds() {
		return secondaryContactIds;
	}

	public void setSecondaryContactIds(List<Long> secondaryContactIds) {
		this.secondaryContactIds = secondaryContactIds;
	}

	public UserContactSummary(Long primaryContactId, List<String> email, List<String> phoneNumbers,
							  List<Long> secondaryContactsId) {
		this.primaryContactId = primaryContactId;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.secondaryContactIds = secondaryContactsId;
	}
	
	public UserContactSummary() {
	}
	
	@Override
	public String toString() {
		return "UserContactSummary [primaryContactId=" + primaryContactId + ", email=" + email + ", phoneNumbers="
				+ phoneNumbers + ", secondaryContactIds=" + secondaryContactIds + "]";
	}
}
