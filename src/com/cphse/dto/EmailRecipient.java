package com.cphse.dto;


public class EmailRecipient extends EmailAddress {
    private RecipientType type = RecipientType.TO;

    public EmailRecipient() {
        super();
    }

    public EmailRecipient(String email, String name) {
        this(email, name, RecipientType.TO);
    }
   
    public EmailRecipient(String email, String name, RecipientType type) {
        super(email, name);
        this.type = type;
    }

    public RecipientType getType() {
        return type;
    }

    public void setType(RecipientType type) {
        this.type = type;
    }
    
    public enum RecipientType {
        TO,CC,BCC
    }
}
