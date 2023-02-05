# Testing con selenium utilizando el patron POM(Page Object Model)
# TABLA DE CONTENIDOS
- [Tecnologias](#tecnologias)
- [Dependencias](#dependencias)
- [Estrategias](#estrategias)
- [POM](#pom)
- [Test](#test)
  * [Happy_Path](#happy_path)
  * [Negative_Path](#negative_path)
- [Resultados](#resultados)  
 
  
    
   
 


# Descripcion

> Estos son unas pruebas automatizadas a un demo website para comprobar su correcto funcionamiento. 

>En este caso las pruebas estan orientadas al registro de un usuario los requerimentos especificos se encuentran en el siguiente link https://github.com/DMAlmeyda/Testing_SELENIUM_POM/blob/4385501b5db591dc440691e0c7d5309e60604374/src/test/resources/UserStoryLogin.docx.pdf.
 
>El sitio web que se utilizara para las pruebas es el siguiente https://magento.softwaretestingboard.com/

<!-- toc -->

## Tecnologias
* Selenium
* Surefire(para generar reportes html)
* IDE: Eclipse


## Dependencias
* Las dependencias utilizadas son varias e importantes tanto para la utilizacion de selenium y surefire(generador de reportes)

https://github.com/DMAlmeyda/Testing_SELENIUM_POM/blob/4385501b5db591dc440691e0c7d5309e60604374/pom.xml#L1-L56


## Estrategias

* En este caso se utilizara el patron POM para lograr un testing mas facil de mantener en el tiempo y mas legible, pero ademas se prestara atencion a los localizadores buscando cuidadosamente cual elegir para que los tests se mantenga en el tiempo.

* Abajo se ve una imagen de un arbol representando los localizadores mas importantes(los frutos bajos)

![selenium-locators-apple-tree-diagram-dashed-fixed](https://user-images.githubusercontent.com/108648799/216841593-d6a4b27b-1396-4d5a-a3eb-a7ea90e6d0ba.png)

> Para mas informacion visitar www.quality-stream.com/selenium-webdriver-localizadores-estrategias-de-localizacion/



## POM
* El POM esta dividido en dos clases, una es la base con todas las funciones mas recurrentes de selenium y la otra contendra todos los metodos y atributos del sitio web a testear

* La clase base
https://github.com/DMAlmeyda/Testing_SELENIUM_POM/blob/4385501b5db591dc440691e0c7d5309e60604374/src/test/java/com/project/pom/Base.java#L1-L59

* La clase SignUpPage que contiene los atributos y metodos que utilizaremos ademas de hederar los metodos y atributos de la clase base
https://github.com/DMAlmeyda/Testing_SELENIUM_POM/blob/4385501b5db591dc440691e0c7d5309e60604374/src/test/java/com/project/pom/SignUpPage.java#L1-L69

## Test

### Happy_Path

* Se testea el sitio web respetando los requerimentos especificados.

https://github.com/DMAlmeyda/Testing_SELENIUM_POM/blob/4385501b5db591dc440691e0c7d5309e60604374/src/test/java/test/SignUp_HappyPath.java#L1-L34

### Negative_Path

* Se testea el sitio web ahora intentando introducir la informacion de manera erronea, no respetando los campos, etc. Para comprobar el correcto funcionamiento y accionar en caso de que la informacion no este planteada como deberia

https://github.com/DMAlmeyda/Testing_SELENIUM_POM/blob/4385501b5db591dc440691e0c7d5309e60604374/src/test/java/test/SignUp_Negative.java#L1-L92

## Resultados

> Pasaron todas las pruebas de manera satisfactoria

> Link del reporte generado https://raw.githack.com/DMAlmeyda/Testing_SELENIUM_POM/master/target/site/surefire-report.html. Recuerden que el html se aloja en este repositorio en la seccion target/site/project-reports.html








