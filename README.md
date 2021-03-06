<html>
<body>
<h3>LoginApp</h3>

<h2><b>Expected Deliverable:</b></h2>

1.Application written in Spring Boot + JPA<br>
2.12 factor API design<br>
3.User Login Module (API is fine)<br>
4.If User login 3 times with wrong password, the user should be locked out.<br>
5.Application Deployment steps.<br>
6.Swagger Documentation<br>
7.Role base access control for application<br>

<h2><b>ABOUT API:</b></h2>

This LogIn application has been developped using spring boot and spring data JPA.<br>
This application contains 1 rest end point(/login). Swagger documentaion has been created.<br>
In-memory database H2 db is used. And during application start, data.sql file containing default user details are inserted into db.These details can be used during login<br>
Embaded tomcat server has been used for deployment purpose.<br>
If user logs in 3 times with wrong password and using correct email, user will be locked.<br>
Central place for handling all exceptions is implemented. Custom exception class and custom error response is created and providing response back to the users.<br>
Public repository has been created in GIT HUB and code has been committed.(https://github.com/amitghosh1990/LoginApp.git )<br>
Implementation is in progress for role based Authentication using spring security. I will commit security changes as soon as it's done;<br>

<h2><b>Deployment in local:</b></h2>
1. cloan repository in local(repository url:https://github.com/amitghosh1990/LoginApp.git)<br>
2. open eclipse or any suitable IDE and import Maven project from local repository that you have just cloned.<br>
3. update project and perform maven build( build goal: clean package).<br>
4.you can run this project from either any suitable IDE or can deploy in any cloud platform like AWS EC2 instance or PCF(Pivotal Cloud Foundry)<br>
5.once deployed, open following url:<br>
http://localhost:8080/swagger-ui.html<br>
http://localhost:8080/h2-console<br>
**The above URL as per local system deployment.<br>

<h2><b>Deployment in cloud:</b></h2>

<b>PCF platform:</b> Use Manifest-<profile>.yml file for PCF deployment in respective environments.Rename only deployment specific file like rename menifest-dev.yml to menifest.yml. all profiles are available in git repository. This file contains rout url,application name, memory/space allocation to run application,java build packetc.<br>
<b>AWS platform:</b> For AWS deployment, upload your jar in S3 storage and then copy to your EC2 instance and run the jar file. change the packaging as needed, i am using war packaging.<br>

</body>
</html>



