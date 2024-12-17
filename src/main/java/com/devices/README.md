# Principio Interface Segregation Principle #

  Al crear una interface que no se necesitan todos los métodos que se pusieron para todas las clases que se implementan esa interface, esto llega a ser un error de diseño, entonces se crean interfaces extras de funcionalidades que se requiere para clases en especifico, llegando a ser beneficioso para la mantenibilidad del código, las clases no deben verse obligadas a implementar interfaces que no necesitan.

## Estructura del proyecto ##

```
  devices/
  │-- Device.java
  │-- DeviceCharge.java
  │-- DisposableCamera.java
  │-- Main.java
  └-- Phone.java
```
    
## Instruciones de ejecución ##

  1. Verificar la existencia de la clase main
  2. Dar click derecho a la clase main
  3. Dar click en la opcion "Run Code"
     
## Salida esperada ##

```
Phone is turning on.
Phone is charging.
Disposable camera is turning on.

```
