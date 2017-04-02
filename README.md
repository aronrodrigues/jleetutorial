# maven-project
Project source code for [https://www.udemy.com/the-complete-jenkins-course-for-developers-and-devops]
[https://www.udemy.com/the-complete-jenkins-course-for-developers-and-devops/]

# Jenkins plugins
* GitHub Plugin
* Maven Integration Plugin
* Deploy To Container Plugin
* Copy Artifact Plugin
* Build Pipelin Plugin
* Checkstyle Plugin (mvn checkstyle:checkstyle)
* Findbugs Plugin (mvn findbugs:findbugs)
* PMD Plugin (mvn pmd:pmd)

# Tomcat configuration
* conf/server.xml - Change port 8080 to 8090
* conf/tomcat-users - Roles manager-script and admin-gui, user tomcat/tomcat
* cd bin; sudo chmod +x *.sh