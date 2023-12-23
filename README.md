Journey Tracker
•	A Java Web Developement Project
________________________________________
About
"JourneyTracker" project introduces an innovative and user-friendly solution designed to empower college students in managing their academic journeys and preparing for the professional world.<br>
It's like a digital toolbox that simplifies the process of creating professional resumes while providing an efficient means of maintaining academic records.
 ![image](https://github.com/mustafamk8/JourneyTracker-/assets/85062314/b974d909-30d5-45d3-9412-5804bd89344f)

This Website is built for following purpose:-
•	For managing students professional data.
•	For making professional resume.
•	User Friendly.
•	For Implementation of Http Servlets in Java.
•	This is a Mini-project developed using Java, Jdbc, And Servlets.
Admin Have Following Access for this online store site:-
•	Access of students.
•	View Students.
•	Update and remove students.
•	Add Students.
•	Add teachers.
Students Have Following Access for this online store site:-
•	Update their Profile.
•	Login.
•	Add and update their skills.
•	Add and Project details.
•	Add and internship details.
•	Download resume
Technologies used:-
1.	Front-End Development:
•	HTML
•	CSS
•	Javascript
•	BootStrap
2.	Back-End Development:
•	Java [JDK 8+]
•	JDBC
•	Servlet
3.	Database:
•	MySql
================ Software And Tools Required ================
•	 : Java JDK 8+
•	: Eclipse EE (Enterprise Edition) [
•	: Apache Maven
•	: Tomcat v8.0+ 
•	: MySQL Server 
•	: MySQL Workbench (optional) 
================= Dummy Database Initialization =================
STEP 1: Open MySQL Command Prompt or MySQL Workbench
STEP 2: Login to the administrator user as : mysql -u <username> -p (Enter Password if asked)
STEP 3: Copy paste the following MySql Commands-
create database if not exists resume;

Then import the database which I have attached.

Steps to import : 

1)	Open workbench or any IDE.
2)	Click on server choose data import.
3)	Select the database location
4)	Click on start import.
========== Importing and Running The Project Through Eclipse EE ==========
Step 0: Open Eclipse Enterprise Edition. [Install, if not already installed.]
Step 1: Click On File > Open project from file system>Choose directory>Next>Finish
Step 2. a: Go inside src/main/resources > com.resume.model and update the value of database details as per your usage, like db.driver, db.host, db.username and db.password in all three model class according to your installed mysql/postgresql admin user credentials.
Step 2.b: Right Click On Project > Build Path > Configure Build Path > Libraries > Remove and Update Any Libraries if Red Mark Exists > Finish.
Step 3: [Only If Tomcat Server is not configured in Eclipse] : Right Click On Project > Run As > Run On Server > Select Tomcat V8.0 > (Select Tomcat V8.0 Installation Location If Asked) Next > Add resume generator > Finish.
Step 4: Right Click On Project > Run As > Run On Server > Select Tomcat v8.0 > Next > Add All> Done.
Step 6: Check Running The Site At http://localhost:8080/ResumeGenerator/
Step 7: Default Username And Password For Admin Is "admin" And "admin"
FAQ
Question:1 Unable to Connect to Database?
Answer: Please check you have installed the mysql correctly and have updated the correct db details in application.properties file. Also you can try doing maven clean install and force update the project and restart.
________________________________________
Note:- Considering this as a Sample Project, we have not much considered of web security.
Some Screenshots for the project:
 
 ![image](https://github.com/mustafamk8/JourneyTracker-/assets/85062314/cb653150-3940-4a49-8a6a-fb98592875cb)
 ![image](https://github.com/mustafamk8/JourneyTracker-/assets/85062314/b6010795-3a07-46df-bf91-5ad0bea9c9f5)
![image](https://github.com/mustafamk8/JourneyTracker-/assets/85062314/f5811f38-ebba-473e-a12a-90578fd67d76)
![image](https://github.com/mustafamk8/JourneyTracker-/assets/85062314/910f8d3e-fe03-4c00-8348-c32de349b088)


"Suggestions and project improvement ideas are welcomed!"
Thanks a lot,
Team Member :-
Mohd Mustafa
Nandini Mehta
Nirnay Agarwal
Palash Shah 


