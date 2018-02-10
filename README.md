# Spring Boot + Angular 5

![spring-boot-angular4-boilerplate](https://raw.githubusercontent.com/Saka7/spring-boot-angular4-boilerplate/master/frontend/src/assets/images/favicon.png)

Está é uma simples aplicação rest api para fornecer serviços ao angular5.

## Getting Started

Estas instruções irão levá-lo a uma cópia do projeto em funcionamento em sua máquina local para fins de desenvolvimento e teste. Consulte os pré-requisitos para implantação do projeto.

### Pré-requisites

- Java8
- Spring Tools Suites (STS)
- Maven 3
- Postman
 
### Technologies

| Tech | Description |
| --- | --- |
| Java8 | [http://www.oracle.com/technetwork/pt/java/javase/downloads/jre8-downloads-2133155.html](http://www.oracle.com/technetwork/pt/java/javase/downloads/jre8-downloads-2133155.html) |
| Spring Boot | [https://projects.spring.io/spring-boot](https://projects.spring.io/spring-boot/)  |
| Spring Security | [https://spring.io/guides](https://spring.io/guides)  |
| JPA | [http://hibernate.org/orm/documentation/5.2/](http://hibernate.org/orm/documentation/5.2/) |
| FlyWay | [https://flywaydb.org/getstarted/](https://flywaydb.org/getstarted/) |
| MySql | [https://www.mysql.com/downloads/](https://www.mysql.com/downloads/) |
| JWT | [https://jwt.io/introduction/](https://jwt.io/introduction/) |
| OAuth2 | [https://oauth.net/2/](https://oauth.net/2/) |
| jackson 2 | [https://github.com/FasterXML/jackson-docs](https://github.com/FasterXML/jackson-docs) |



## Installing

### Steps to setup

**1. Clone the application**

```bash
git clone https://github.com/cassiolpaixao90/spring-boot-api-angular-5.git
```

**2. Build and run the app using maven**

```bash
cd account_payment
mvn package
java -jar target/account_payment-0.0.1-SNAPSHOT.jar
```

Você também pode executar o aplicativo sem empacotá-lo usando -

```bash
mvn spring-boot:run
```



## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
