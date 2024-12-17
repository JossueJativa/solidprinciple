# Principio Open Closed #

El Open Closed Principle es un principio muy util y de suma importancia. En un inicio puede ser un tanto complicado comprender la diferencia entre poder modificar o extender una clase pero tras realizar un ejercicio practico simple se puede ver la gran utilidad que tiene este principio ya que nos permite garantizar que el código que ya ha sido escrito anteriormente funcione de manera correcta, por lo tanto esto permite optimizar y ahorrar futuro tiempo de trabajo por errores que se generen tras modificar código que ya estaba funcionando ya sea por implementar mejoras o cambios. 

Este proyecto implementa un sistema que envía diferentes tipos de notificaciones (Correo electrónico, SMS, Notificaciones Push). El código inicial violaba el Principio de Abierto/Cerrado (OCP) de SOLID al combinar la lógica de todos los tipos de notificaciones en una sola clase.

La refactorización aplica polimorfismo al separar las responsabilidades en clases individuales, permitiendo agregar nuevos tipos de notificaciones sin modificar el código existente.

## Estructura del proyecto ##

```
    notificationservice
    |
    |-- Main.java
    |-- Notification.java
    |-- NotificationService.java
    |-- NotificationEmail.java
    |-- NotificationPush.java
    |-- NotificationSMS.java
```
    
## Instruciones de ejecución ##

  1. Verificar la existencia de la clase main
  2. Dar click derecho a la clase main
  3. Dar click en la opcion "Run Code"
     
## Salida esperada ##

```
  Sending Email: Hello via Email!
  Sending SMS: Hello via SMS!
  Sending Push Notification: Hello via Push Notification!
  Sending Fax: Hello via Fax!
```
