package com.cphse.dto;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class RawMail {
	private String serverId;
	private String body;
	private Map<String, String> headers;
	private String subject;
	private EmailAddress from;
	private Set<EmailRecipient> recipients;
	private Date sentDate;
	private Date recievedDate;
	private Date created;
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public EmailAddress getFrom() {
		return from;
	}
	public void setFrom(EmailAddress from) {
		this.from = from;
	}
	public Date getSentDate() {
		return sentDate;
	}
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
	public Date getRecievedDate() {
		return recievedDate;
	}
	public void setRecievedDate(Date recievedDate) {
		this.recievedDate = recievedDate;
	}
	public Set<EmailRecipient> getRecipients() {
		return recipients;
	}
	public void setRecipients(Set<EmailRecipient> recipients) {
		this.recipients = recipients;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * @return the serverId
	 */
	public String getServerId() {
		return serverId;
	}
	/**
	 * @param serverId the serverId to set
	 */
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	
}
