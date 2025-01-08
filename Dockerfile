FROM openjdk:17
# set working directory inside the container
WORKDIR /app
# copy jar file into the container
COPY ./target/google-jib-example-0.0.1-SNAPSHOT.jar /app
#expose the port the application will run on
EXPOSE 8080
#command to run the application
CMD ["java","-jar","google-jib-example-0.0.1-SNAPSHOT.jar"]