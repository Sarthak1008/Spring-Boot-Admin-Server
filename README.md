# Spring-Boot-Admin-Server

The purpose of these projects was to create a centralized administration system for managing different products through REST controllers. I'll provide you with a brief overview of each component.

Spring Boot Admin Server:
The Spring Boot Admin Server serves as the central administration console for monitoring and managing the various products in our system. It provides a user-friendly web interface that allows administrators to gain insights into the health, performance, and configuration of the products.

Key features of the Spring Boot Admin Server include:

Monitoring: The server collects and displays metrics such as CPU usage, memory consumption, request statistics, and other relevant information for each product.

Alerts and Notifications: It allows the configuration of alerts and notifications based on predefined thresholds or specific events, enabling administrators to take proactive actions.

Logging: The server collects and aggregates logs from the different products, providing a centralized view for easier troubleshooting and analysis.

Remote Management: Administrators can remotely manage the products by modifying their configurations, restarting instances, or shutting them down if required.

Admin Client Project:
The Admin Client project serves as an interface between the Spring Boot Admin Server and the individual products. It includes REST controllers that expose endpoints for managing and interacting with the different product resources.

In a 1st person view, the Admin Client project allows an administrator to perform the following tasks for each product:

CRUD Operations: The REST controllers enable the creation, retrieval, update, and deletion of product resources. This includes managing product details, attributes, and related data.

Authorization and Authentication: The Admin Client project integrates with an authentication system to ensure that only authorized administrators can access and modify the product resources.

Validation and Error Handling: It includes validation logic to ensure that the received data is accurate and adheres to the defined rules. Proper error handling is implemented to provide meaningful error messages to the client.
