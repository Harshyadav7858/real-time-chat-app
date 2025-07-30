package com.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
        
        System.out.println("🚀 Chat Application Started!");
        System.out.println("📱 Open your browser and go to: http://localhost:8080");
        System.out.println("💬 Start chatting with others!");
    }
} 