
Project Requirement
•	purpose of the project:

The Appartment booking system is a web-based application aimed at simplifying the process of finding an apartment to lent for clients and apartment owners/managers. Developed using Thymeleaf for the frontend and Spring Boot for the backend, the platform caters to the needs of admins, apartment managers, and clients.
•	Expected Outcomes:
o	Appartment availability: Managers can add apartments, view list of their appartments, view booked appartments.
o	Appartment booking: customers can search for specific city and see the available appartments in that city, be able to book one they want, and also provide their phone number for payment.
o	Secure Access: Login with protected routes ensures secure access for authorized users.
•	Specific Constraints or Limitations:
o	Time Constraints: The project was supposed to be completed within 3 weeks
o	Security constraints:
	File Upload Security: Need to Implement file scanning mechanisms to detect and prevent potential threats.
o	Scalability limitation: Handling an increased number of customers may pose challenges for apartment managers.

Project Plan

•	scope of the project:
o	The project encompasses the development of a web-based assignment submission platform using Thymeleaf and Spring Boot.
•	source code:
o	The source code for the project is hosted on GitHub:
	Backend: https://github.com/vumurerwa/AppartmentBookingSystem 
	Frontend: https://github.com/vumurerwa/AppartmentBookingSystem
	 Database schema
•	Table definitions
 
User Documentation
•	Appartment availability:
o	Managers can log in and add appartments, specifying details(available rooms,location),  view their appartments and view booked assignments.

•	Appartment booking:
o	Customers can search for a city and see all available appartments in that city and be able to book the one they one and provide their phone number for making the payment.
•	Login Credentials:
o	Admin:
- Username - vixya@gmail.com, - Password – 123456
Technical Documentation
•	Architecture
o	The application follows a client-server architecture, with Thymeleaf handling the frontend and Spring Boot serving as the backend.
•	Implementation Details:
o	Frontend:
	THYMELEAF
o	Backend:
	JAVASCRIPT 
	SPRING BOOT
o	Database:
	MYSQL 
o	Dependencies:
	Spring Boot Starter Web, Spring Boot Starter Data JPA,







# HotelBookingApp

`HotelBookingApp` is a minimalistic web application designed to simplify the hotel reservation process for both customers and hotel managers. It is crafted with Java and Spring Boot in backend, and Thymeleaf in frontend. The system adheres to the Model-View-Controller (MVC) architectural pattern.

## Features

- **User Registration & Management**: Users can register, login, and manage their profiles. Various data validations (e.g. strong password requirement) have been implemented.
- **Hotel Management**: Hotel managers can add/edit hotels, specifying details (e.g. name, address, room counts, prices) in a single interface.
- **Hotel Search**: Enables customers to search for available hotels based on location and check-in/check-out dates.
- **Hotel Listing**: Displays a list of available hotels with relevant details such as name, available room counts, and prices.
- **Hotel Details**: Provides in-depth information on hotels, including name, address, room availability, pricing, and an interactive map leveraging the Nominatim geocoding API and Leaflet library.
- **Room Booking**: Customers can select the desired number of rooms and get redirected to payment for finalizing the reservation.
- **Payment Processing**: Secure credit card payment with validations like Luhn checks and custom validators for expiry dates and CVV. (No third-party payment gateways are implemented.)
- **Booking Management**: Customers and hotel managers can view their bookings through the dashboard.
- **Admin Panel**: Allows administrators to manage users, hotels, rooms, and bookings.
- **Responsive Design**: The app is optimized for various devices including desktops, tablets, and smartphones.

## Technology Stack

- **Backend**:
  - Java 17
  - Spring Boot 3.1.1
  - MVC Architecture (Spring Web MVC 6.0.10)
- **Frontend**:
  - Thymeleaf 3.1.1
  - Bootstrap 5.3.0
  - Bootstrap Icons 1.10.5
  - jQuery 3.7.0
  - jQuery-UI 1.13.2
  - Leaflet 1.9.4 (interactive maps)
- **Database**:
  - MySQL
- **Security**:
  - Spring Security 6.1.1 (authentication and authorization)
- **Other Tools**:
  - Lombok (boilerplate code reduction)
  - Thymeleaf extras and layout dialect (enhanced UI functionality)

## Prerequisites

- Java JDK 17
- Maven
- MySQL

## Installation & Running

1. Clone the repository:
   ```sh
   git clone https://github.com/kayaalpkoker/HotelBookingApp.git
   ```
   
2. Navigate to the project directory::
   ```sh
   cd HotelBookingApp
   ```
   
3. Install the dependencies::
   ```sh
   mvn install
   ```
   
4. Update application.properties with your MySQL database configurations.
   
6. Run the application:
   ```sh
   mvn spring-boot:run
   ```
   
7. Access the application via your browser at http://localhost:8080/.

## Screenshots

tbd

## Contribution

Pull requests are welcome. For significant changes, kindly open an issue first to discuss the proposed modification.

## License

MIT License. Refer to `LICENSE` for more details.
