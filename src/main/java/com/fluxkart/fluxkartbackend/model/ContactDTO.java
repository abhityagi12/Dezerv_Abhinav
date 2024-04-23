package com.fluxkart.fluxkartbackend.model;

import java.util.List;

public class ContactDTO {
    private Long primaryContactId;
    private List<String> emails;
    private List<String> phoneNumbers;
    private List<Long> secondaryContactIds;
    
    
	public Long getPrimaryContactId() {
		return primaryContactId;
	}
	public List<String> getEmails() {
		return emails;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public List<Long> getSecondaryContactIds() {
		return secondaryContactIds;
	}
	public void setPrimaryContactId(Long primaryContactId) {
		this.primaryContactId = primaryContactId;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public void setSecondaryContactIds(List<Long> secondaryContactIds) {
		this.secondaryContactIds = secondaryContactIds;
	}

}
