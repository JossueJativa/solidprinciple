# Principio Liskov Substitution #

En la parte de la herencia, al realizar funcionalidades y un hijo no debería tener la capacidad de realizar alguno de los métodos, se define como una clase padre mal hecha, entonces para eso se realiza las interfaces, para que cuando se llegue a realizar alguna funcionalidad que no debe llega a ser de gran utilidad para los hijos, es mejor la interfaz para mejorar la legibilidad y su único funcionamiento en clases especificas, mejorando asi el código a ejecutar
  
## Estructura del proyecto ##

```
|-- animals
    |-- Animal.java
    |-- Dog.java
    |-- Fish.java
    |-- WalkAnimal.java
    |-- Main.java
```  
    
## Instruciones de ejecución ##

  1. Verificar la existencia de la clase main
  2. Dar click derecho a la clase main
  3. Dar click en la opcion "Run Code"
     
## Salida esperada ##

```
Dog barks.
Dog walks.
Fish makes no sound.

```
