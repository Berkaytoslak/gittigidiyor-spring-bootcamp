#### Gittigidiyor Spring Bootcamp FullStack Project

* React App initialize;

`npx create-react-app@4.0.3 frontend`

* Ant Design install; (https://ant.design/)

`npm install --save antd@4.13.0`

* Our custom Dockerfile;
`FROM openjdk:8
  EXPOSE 8080
  ADD target/*.jar patika.jar
  ENTRYPOINT ["java","-jar","/patika.jar"]`
  
* To build Docker image via Dockerfile; `docker build -t <tag_name> .`
* To run builded Docker image; `docker run -p 8080:8080 <tag_name>`

* To build Docker image with JIB plugin; `mvn clean install jib:dockerBuild -Djib.to.image=fullstack:v1`
* To push Docker image to Docker hub via JIB plugin; `mvn clean install -P jib-push-to-dockerhub -Dapp.image.tag=v2`

## Postgres 
* To create network; 
  `docker network create db`
* Initialize a Postgres Docker ; 
  WINDOWS;
  `docker run --name db -p 5432:5432 --network=db -v "%cd%:/var/lib/postgresql/data" -e POSTGRES_PASSWORD=password -d postgres:alpine`
  MAC/LINUX;
  `docker run --name db -p 5432:5432 --network=db -v "%PWD%:/var/lib/postgresql/data" -e POSTGRES_PASSWORD=password -d postgres:alpine`

* To connect local Postgres Docker Container via psql; 
` docker run -it --rm --network=db postgres:alpine psql -h db -U postgres`
  
* To connect AWS RDS Postgres Docker Container via psql (change host(-h) name according to your RDS Postgres endpoint)
`docker run -it --rm postgres:alpine psql -h aan61u4bd2lolr.cxwdf9twl8id.eu-central-1.rds.amazonaws.com -U korayguney -d postgres`