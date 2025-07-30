@echo off
echo ========================================
echo    Real-Time Chat Application
echo ========================================
echo.
echo Starting the chat application...
echo.
echo Make sure you have Java 8+ and Maven installed!
echo.
echo The application will be available at:
echo http://localhost:8080
echo.
echo Press Ctrl+C to stop the application
echo ========================================
echo.

mvn spring-boot:run

pause 