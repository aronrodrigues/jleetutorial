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
* duplicate tomcat and change port to 9090 on prd.

# Jenkins Jobs
* Package: Runs "mvn package" and create artifact
* Deploy-Stage: Deploy artifact to stage container, triggered by Package
* Metrics: Runs "mvn checkstyle:checkstyle pmd:pmd findbugs:findbugs", triggered by Package
* Deploy-Production: Deploy artifact to production container, triggered by Deploy-Stage (manual step)
