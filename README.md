# Real-Time Chat Application

A simple real-time chat application built with Spring Boot and JavaScript WebSockets.

## Features
- Real-time messaging
- User names
- Simple and clean UI
- Easy to understand and modify

## Project Structure
```
real-time-chat-app/
├── src/
│   ├── main/
│   │   ├── java/com/chat/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   └── config/
│   │   └── resources/
│   │       ├── static/
│   │       └── templates/
├── pom.xml
└── README.md
```

## How to Run

1. **Prerequisites**: Java 8+ and Maven
2. **Run the application**: `mvn spring-boot:run`
3. **Access the chat**: Open `http://localhost:8080` in your browser

## Key Components

### Backend (Spring Boot)
- **WebSocket Configuration**: Enables real-time communication
- **Message Controller**: Handles WebSocket connections and message routing
- **Message Model**: Simple data structure for chat messages

### Frontend (JavaScript)
- **WebSocket Client**: Connects to the backend
- **UI Components**: Simple HTML with JavaScript for real-time updates
- **Message Handling**: Sends and receives messages in real-time

## Learning Points
- WebSocket communication
- Spring Boot configuration
- Real-time data flow
- Simple frontend-backend integration

## Customization
- Modify `ChatMessage.java` to add more message fields
- Update `index.html` to change the UI
- Add features like user authentication, message history, etc.