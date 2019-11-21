FROM tomcat:9.0.27-jdk11-openjdk
RUN rm -f /usr/local/tomcat/webapps/*
ADD ./build/libs/learningDevOps-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]