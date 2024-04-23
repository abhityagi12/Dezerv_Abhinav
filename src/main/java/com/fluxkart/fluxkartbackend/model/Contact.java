package com.fluxkart.fluxkartbackend.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact implements Serializable {

	/**
	 * Unique identifier for serialization purposes.
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "linkedId")
    private Long linkedId;

    @Enumerated(EnumType.STRING)
    @Column(name = "linkPrecedence", nullable = false)
    private LinkPrecedence linkPrecedence;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatedAt")
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deletedAt")
    private Date deletedAt;

    /**
     * Enum to represent the precedence of a linked contact (primary or secondary).
     */
    public enum LinkPrecedence {
        PRIMARY,
        SECONDARY
    }

    // Default constructor (required by JPA)
    public Contact() {
    }

    // Parameterized constructor (if needed)
    public Contact(String phoneNumber, String email, Long linkedId, LinkPrecedence linkPrecedence, Date createdAt, Date updatedAt, Date deletedAt) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.linkedId = linkedId;
        this.linkPrecedence = linkPrecedence;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }


    // Getters and setters
	public Long getId() {
		return id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public Long getLinkedId() {
		return linkedId;
	}

	public LinkPrecedence getLinkPrecedence() {
		return linkPrecedence;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLinkedId(Long linkedId) {
		this.linkedId = linkedId;
	}

	public void setLinkPrecedence(LinkPrecedence linkPrecedence) {
		this.linkPrecedence = linkPrecedence;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", phoneNumber=" + phoneNumber + ", email=" + email + ", linkedId=" + linkedId
				+ ", linkPrecedence=" + linkPrecedence + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", deletedAt=" + deletedAt + "]";
	}

    
}