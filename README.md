# **Дипломный проект по профессии «Тестировщик»**

## **Окружение**

* IntelliJ IDEA Community Edition 2022.1IntelliJ IDEA 2022.2.3 (Community Edition);   
* Java: OpenJDK 11;  
* Docker Desktop 4.14.1 (91661).   

## **Запуск приложений**

1. Запустить Docker Desktop;  
2. Запустить IntelliJ IDEA;  
3. Клонировать репозиторий с GitHub [`git clone`](https://github.com/Rigazavr/Diplom.git);  
4. Скачать и запустить в Docker контейнеры:  

* СУБД: MySQL, PostgreSQL; Node.js;  
* Команда для запуска контейнеров: `docker-compose up -d --force-recreate --build`.  

5. В новом терминале запустить приложение aqa-shop.jar командой: `java -jar .\artifacts\aqa-shop.jar`: 

* для подключения к БД MySQL: `java -jar artifacts/aqa-shop.jar --spring.datasource.url=jdbc:mysql://localhost:3306/base_mysql`;
* для подключения к БД PostgreSQL: `java -jar artifacts/aqa-shop.jar --spring.datasource.url=jdbc:postgresql://localhost:5432/base_postgresql`.

## **Запуск тестов**

* для MySQL: `.\gradlew clean test -D dbUrl=jdbc:mysql://localhost:3306/base_mysql -D dbUser=app -D dbPass=pass`;
* для Postgres: `.\gradlew clean test -D dbUrl=jdbc:postgresql://localhost:5432/base_postgresql -D dbUser=app -D dbPass=pass`.

## **Формирование отчета AllureReport**

* В новом терминале запустить: `./gradlew allureserve`.

## **Ссылки на документацию**

* [Дипломное задание](https://github.com/netology-code/qa-diploma/blob/master/README.md);
* [План автоматизации](./Diplom_marrakech/documentation/Plan.md)
* [Отчет по итогам тестирования](./Diplom_marrakech/documentation/Report.md)
* [Отчет о проведенной автоматизации](./Diplom_marrakech/documentation/Summary.md)