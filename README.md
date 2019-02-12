# kotlin-spring-boot-webflux-springfox-example

## Features

* kotlin v1.3
* Gradle v5
* Java v11
* Spring boot v2.1
* jOOQ (ORM)
* Liquibase
* thymeleaf v3
* MySQL v8
* Redis v5
* Docker
* MailCatcher (Virtual smtp and local webmailer)
* HikariCP (Fast and eco connection pooling)
* Lettuce redis client
* Swagger
* Swagger UI

### Api project features

* SpringFox for WebFlux
* Webflux
* Router function
* jOOQ ORM
* Repository cache for redis

## Requirement

* macOS
* IntelliJ IDEA

## Project

### Project structure

```
database
└── base
      └── api
```

### Project role

| project name | Executable jar | description |
|:----|:---|:---|
|database|☓|generate-jooq, migrate-liquibase, auto-generated jooq files|
|base|☓|share project|
|api|◯|api project|

## Setup

### Install sdkman

Install java by [sdkman](https://sdkman.io/install).

```bash
# check java versions
$ sdk list java | grep adpt
     13.ea.07-open   > * 8.0.202.hs-adpt
     11.0.2.j9-adpt      1.0.0-rc-12-grl
     11.0.2.hs-adpt      1.0.0-rc-11-grl
     8.0.202.j9-adpt
# install java11
sdk install java 11.0.2.hs-adpt
```

### Install Docker Desktop

https://docs.docker.com/docker-for-mac/install/

### Git clone project

```bash
# clone project
git clone https://github.com/treetips/kotlin-spring-boot-webflux-springfox-example.git
cd kotlin-spring-boot-webflux-springfox-example
```

### Install IntelliJ IDEA

Install community(or ultimate) edition.

https://www.jetbrains.com/idea/download/#section=mac

### Install IntelliJ IDEA plugin

* Start IntelliJ IDEA.
* `Welcome to IntelliJ IDEA` → `Configure` → `Plugins` → `Install JetBrains plugin` . Install `Editorconfig` .

### Import sample project

* Start IntelliJ IDEA.
* `Welcome to IntelliJ IDEA` → `Configure` → `Project Defaults` → `Project Structure` .
* `SDKs` → `+` → `JDK` -> `$HOME/.sdkman/candidates/java/11.0.2.hs-adpt` .
* `Welcome to IntelliJ IDEA` -> `Import Project` -> choose clone directory.
* `Import from external project model` → `Gradle` -> Next.
* Check to `Use auto-import` and `Use gradle 'wrapper' task configuration`. Choose `Gradle JVM` to `Use JAVA_HOME(sdkman)` . Choose `Project format` to `.idea (directory based)` .
* Startup IntelliJ IDEA, jar file downloading of gradle is automatically started. Wait for few minutes.

## Usage

### Start docker daemon

Require starting docker daemon.

### Start docker-compose

```bash
cd ${PROJECT_ROOT}
docker-compose up -d
```

Start to `MySQL-server` and `Redis-server` and `MailCatcher(Virtual SMTP)`.

### Start API

Right click on `com.example.api.ApiApplication.kt` -> Run.

Browse `http://localhost:8080/api/prefecture/`

Browse `http://localhost:8080/swagger-ui.html`

## Optional

### Open webmailer(MailCatcher)

`docker-compose up -d`, browse `http://localhost:1080` .

### Connect to local MySQL-server on docker

```bash
cd $PROJECT_ROOT
./connect-mysql.sh
```

### Connect to local Redis-server on docker

```bash
cd $PROJECT_ROOT
./connect-redis.sh
```
