ZorkUcab
========

> Este *"juego"* o aventura es solo una muestra y combinacion de todos *(o casi todos)* los proyectos que realize durante el semestre.

-------------------------------------------

La actividad detras de *__ZorkUcab__* corre por el __Zengine__ (nombre no muy original), que se encarga de gestionar toda la maqueta de actividades que ocurren y que aspira a ser un *engine* reutilizable para otros proyectos del mismo estilo.

## El Zengine ##
```java
import zengine.Juego;
Juego j = new Juego();
```
El Zengine es el paquete que engloba todas las clases (de forma abstracta en su mayoria) para su implementacion en el motor, esto se decidio asi pues el comportamiento puede variar mucho dependiendo de cual es la intencion del programador, pero en general estaran presentes los mismos componentes.

-----------------------------------

### La Entidad ###
```java
import zengine.Entidad;
Entidad e = new Entidad();
```
Una entidad corresponde a un algo que existe dentro del entorno de juego, algo ademas con lo que el `Jugador` puede interactuar directamente por lo que por default tendra una cantidad de *hp*, *ataque* y *defensa*.

-------------------------------

## El Jugador ##
```java
import zengine.Jugador;
Jugador j = new Jugador();
```
La representacion actual del jugador en un escenario, extiende a una `Entidad` y posee una propiedad adicional que es el *nombre*

----------------------------------

## El Menu ##
Los menu forman parte de una estructura mas completa dento de un escenario de tipo texto por eso (y porque llevan componentes propios) estan hubicados en un paquete adicional, el `menuator`.
```java
import zengine.menu.Menu;
Menu m = new Menu();
```
Un menu completo se compone de 3 partes:

- Un __Titulo__:
Que representa al texto que se muestra por encima del menu, este texto siempre se repite en cada decision.

- Un __Subtitulo__:
Que a pesar de su nombre, representa el texto que se muestra __antes__ del texto/opcion que escribe el jugador.

- Una *lista* de __Opciones__:
Aquellas funciones que se ejecutan en cada decision marcada por el jugador.

-----------------------------------

## La Opcion ##
```java
import zengine.menu.Opcion;
Opcion o = new Opcion();
```
Las opciones presentan cada decision que pueda obtar el jugador, estas muestran 2 partes el *nombre* y la *accion*
```java
o = new Opcion("Nombre", () -> accion());
```