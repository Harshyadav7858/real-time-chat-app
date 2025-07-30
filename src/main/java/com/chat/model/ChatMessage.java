package com.chat.model;

import java.time.LocalDateTime;

public class ChatMessage {
    
    private String sender;
    private String content;
    private String timestamp;
    private MessageType type;
    
    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
    
    public ChatMessage() {
        this.timestamp = LocalDateTime.now().toString();
    }
    
    public ChatMessage(String sender, String content, MessageType type) {
        this.sender = sender;
        this.content = content;
        this.type = type;
        this.timestamp = LocalDateTime.now().toString();
    }
    
    public String getSender() {
        return sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    public MessageType getType() {
        return type;
    }
    
    public void setType(MessageType type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "ChatMessage{" +
                "sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", type=" + type +
                '}';
    }
} 