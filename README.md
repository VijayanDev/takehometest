Please refer the UserPrivilege.xlss file for technical details.

For running the project in your local machine, follow the steps:

1. Check Java version (java -version in command prompt). It should be 17.0 or later. If not, please download and install the latest Java version.
   After installing, set PATH in command prompt to add the installed java path (like C:/ProgramFiles/Java/JDK-17/bin)
	ex.  set PATH=C:\Program Files\Java\jdk-17\bin;%PATH%;

2. Check Maven is installed (mvn command in command prompt). If not exists, please download apache maven latest version. Once downloaded and unarchived, 
   set PATH in command prompt to add the maven directory path (like C:/apache-maven-3.8.x/bin)
	ex.  set PATH=C:\Program Files\Maven\apache-maven-3.8.2\bin;%PATH%;

3. Then go to the project root folder path in command prompt (ie. C:\...\UserPrivilegesService) where pom.xml file presents.

4. Run maven goal, "mvn clean package".

5. Once get the BUILD SUCCESS" message, navigate to the target folder inside rootfolder and check if it has generated jar file(UserPrivilegesService-0.0.1-SNAPSHOT.jar)

6. If the jar exists in the path, in command prompt cd to target folder.

7. Run the following command "java -jar UserPrivilegesService-0.0.1-SNAPSHOT.jar" to run the java application.

8. Once the application is started, check the following urls from browser/postman client for the API calls

	http://localhost:8080/users/10001/privileges
	http://localhost:8080/users/10001/roles



H2 Console: For in memory DB view
-----------------------------------
https://localhost:8080/h2-console


