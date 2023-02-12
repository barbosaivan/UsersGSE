# Users GSE

_Aplicación desarrollada en java usando la arquitectura MVP, que presenta información obtenida mediante un consumo API REST._

_Se implementó la librería Retrofit en su versión 2.9.0 para realizar el consumo._

_La información se presenta en contenedores de tipo CardView, los cuales fueron inflados mediante un adaptador._

_Los datos presentados son, id, name, username, email, phone y website._

## Instrucciones de instalacion

_El proyecto se encuentra en la rama main._

_La clonacion del proyecto se realiza mediente la siguiente Url: https://github.com/barbosaivan/usersGSE.git_

_El nivel de API minimo requerido para la instalacion del la aplicacion es: 24_

_El android gradle plugin version usado es: 7.4.0_

## Funcionalidad
_La aplicación cuenta con una interfaz escroleable que muestra la información de cada uno de los "users"_

_Es posible realizar filtrado de información médiante la búsqueda por "Name"_

## Url API REST
_https://jsonplaceholder.typicode.com/users_

## Formato de la informacion recibida
_[
  {
    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "address": {
      "street": "Kulas Light",
      "suite": "Apt. 556",
      "city": "Gwenborough",
      "zipcode": "92998-3874",
      "geo": {
        "lat": "-37.3159",
        "lng": "81.1496"
      }
    },
    "phone": "1-770-736-8031 x56442",
    "website": "hildegard.org",
    "company": {
      "name": "Romaguera-Crona",
      "catchPhrase": "Multi-layered client-server neural-net",
      "bs": "harness real-time e-markets"
    }
  }
 ]_
 
 ## Herramientas
 * androidx
 
 * google material
 
 * retrofit2
 
 ## Autor
 _Ivan Barbosa Ortega_
 
 _Estudiante de Ingenieria de sistemas_
