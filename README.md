<html>
<body>
<h3>LoginApp</h3>

<h2><b>Expected Deliverable:</b></h2>

1.Application written in Spring Boot + JPA
2.12 factor API design,
3.User Login Module (API is fine)
4.If User login 3 times with wrong password, the user should be locked out.
5.Application Deployment steps.
6.Swagger Documentation,
7.Role base access control for application,

<h2><b>ABOUT API:</b></h2>

This LogIn application has been developped using spring boot and spring data JPA. 
This application contains 1 rest end point(/login). Swagger documentaion has been created.
In-memory database H2 db is used. And during application start, data.sql file containing default user details are inserted into db.These details can be used during login
Embaded tomcat server has been used for deployment purpose.
If user logs in 3 times with wrong password and using correct email, user will be locked.
Central place for handling all exceptions is implemented. Custom exception class and custom error response is created and providing response back to the users.
Public repository has been created in GIT HUB and code has been committed.(https://github.com/amitghosh1990/LoginApp.git )
Yet to add role based Authentication using spring security.

<h2><b>Deployment Steps:</b></h2>
1. cloan repository in local(repository url:https://github.com/amitghosh1990/LoginApp.git)
2. open eclipse or any suitable IDE and import Maven project from local repository that you have just cloned.
3. update project and perform maven build( build goal: clean package).
4.you can run this froject from IDE or can deploy in any cloud platform like AWS EC2 instance or PCF(Pivotal Cloud Foundry)
5.once deployed, open following url:
http://localhost:8080/swagger-ui.html
http://localhost:8080/h2-console

The above URL as per local system deployment.
</body>
</html>



