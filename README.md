# ImsHomePhoneSubscriber
Coding Requirement

Tools for Development

1. Java Open JDK17
2. Maven 3.8.3
3. SpringBoot 3
4. API Documentation: OpenApi 3 and Swagger UI
5. PostgreSQL

Step 1: Import Application to Your IDE and run Springboot Application.
Step 2: Access API Documentation using SWAGGER UI URL = http://localhost:8080/swagger-ui

JSON format for Posting a new Subscriber

{

  "phoneNumber": "18675181023",

  "userName": "16045906321",

  "password": "p@ssw0rd!",

  "domain": "ims.mnc660.mcc302.6gppnetwork.org",

  "status": "ACTIVE",

  "features": {

    "callForwardNoReply": {

      "provisioned": true,

      "destination": "tel:+18675182822"

    }

  }

} 

Swagger UI Screenshot for all HTTP REQUEST:

PUT

![image](https://user-images.githubusercontent.com/104213389/225871621-ffda3905-4d02-49d5-9420-dc0bb215e6c8.png)

DELETE

![image](https://user-images.githubusercontent.com/104213389/225872411-26a0d8c5-a0f2-417e-b537-e99d9cc53605.png)

GET All Subscriber

![image](https://user-images.githubusercontent.com/104213389/225872730-37daa198-5a86-41e4-89aa-72a062376b8e.png)

POST New Subscriber

![image](https://user-images.githubusercontent.com/104213389/225875204-d8c5b091-9f5d-4981-80b6-1ecbe2a46be2.png)

GET Subscriber

![image](https://user-images.githubusercontent.com/104213389/225875427-d9ace2e9-0f3a-4503-82e7-125dbe878b09.png)



