Teste 1
Teste 1
Teste 1
Teste 1

# Spring Boot Demo Example [![Circle CI](https://circleci.com/gh/zpaulo19/spring-boot-demo/tree/master.svg?style=shield)](https://circleci.com/gh/zpaulo19/spring-boot-demo/tree/master)

## Building a application with Spring Boot, Spring Security, JWT, JPA, MySql, H2, Auditing, Circle CI, Log4J2

Learn how to use Spring Boot 2

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

## Steps to setup

**1. Clone the application**

```bash
git clone https://github.com/zpaulo19/spring-boot-demo.git
```
**. Run dev application**

2. **Run the app**

```bash
mvn spring-boot:run -Dspring.profiles.active=dev
```

dev is running on h2 database with default configuration

**. Run prod application**

2. **Create MySQL database**

```bash
create database spring-boot-demo
```
3. **Run the app**

```bash
mvn spring-boot:run -Dspring.profiles.active=prod -DDB_USERNAME=username -DDB_PASSWORD=password
```
replace username for your mysql user and replace password for yor mysql password

prod is running on mysql database with port=3306 and host=localhost

## 

The server will start on port localhost:8080.

Folder link shared with request example for api 

https://www.getpostman.com/collections/a0fcc6f15fd7b7567f2d
