# AREP-Lab01 (Introducción mvn - git - heroku)

Para la realización de este laboratorio usamos las siguientes tecnologías:

- Java
- Spark
- Maven
- Git
- Html
- JavaScript
- Heroku

---

## ¿Cómo funciona el front?

El [frontend](https://lab01-front.herokuapp.com/public/index.html) proporciona una UI sencilla para realizar de manera sencilla el cambio entre grados celsius a grados fahrenheit y viceversa.
Utilizando un espacio input en el que se coloca la cantidad deseada a convertir. Inmediatamente después encontrará una lista para elegir entre celsius y fahrenheit, este indica a cuál pertenece el valor introducido en el campo de la izquierda, es decir, si se selecciona celsius quiere decir que se quiere convertir a fahrenheit.
Finalmente, un botón que ejecutará la conversión realizada y otorgará el resultado en forma de alerta en el navegador del usuario.

---

## ¿Cómo funciona el backend?

El [backend](https://lab01-back.herokuapp.com) del proyecto es un API con dos principales endpoint:

1. ```/celsius/:temp``` → retorna un json con su equivalente en grados fahrenheit.

2. ```/fahrenheit/:temp``` → retorna un json con su equivalente en grados celsius.

---

## ¿Cómo utilizar el repositorio?

Existen dos principales formas de hacer uso de este repositorio:

1. Hacer uso de los despliegues en Heroku, tanto del [Backend](https://lab01-back.herokuapp.com) como del [Frontend](https://lab01-front.herokuapp.com/public/index.html).
2. Clonar el repositorio y hacer uso de cada uno de los elementos de manera independiente a los despliegues realizados en Heroku.

### ¿Cómo realizar esta segunda forma de manera efectiva?

1. Clonar el repositorio con el comando ``` git clone  https://github.com/Ersocaut/AREP-Lab01 ```. Esto descargará todos los archivos del repositorio.
2. Por medio de ``` cd ``` decidir si se va a usar el front o el back del proyecto.
3. En caso de querer aprovechar el back, la clase SparkWebApp es la principal encargada de manejar el API. *Es importante* no eliminar las lineas que permiten el Access-Control-Allow, pues el hacerlo puede limitar el uso del API.
4. En caso de querer aprovechar el front, el archivo ```index.html``` es la página que se muestra al momento de iniciar el servicio, por su parte```index.js``` permite muchas de las funcionalidades de este.

---

## ¿Cómo poder ampliar el alcance del proyecto?

El uso e implementación del proyecto es principalmente el convertir de celsius a fahrenheit, sin embargo, no se limita a este y puede permitirse expandirse para permitir más conversiones, a Kelvin por ejemplo, con muy pocas líneas de código adicionales y modificaciones a lo que ya se tiene establecido.

---

## Autor

- [Leonardo Galeano](https://github.com/Ersocaut)

---
