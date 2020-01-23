FROM openjdk:8
ADD target/boulder_bucket_list.jar boulder_bucket_list.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","boulder_bucket_list.jar"]
