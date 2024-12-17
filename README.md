
# Principio de single responsibility #

  El principio de single responsibility nos permite tener un código más modularizado el cual aumenta la mantenibilidad y legibilidad del código. Por un lado este principio puede ser tanto confuso ya que aveces   existen clases que parecen ser tan simples que dudas si hacer una clase para ello, pero este principio pide eso, haciendo que cada clase tenga una única razón por la cual cambiar, lo que hace mucho mas fácil hacer cambio y mejoras en el sistema a futuro.
  
  Para este proyecto se urilizó el principio de single responsibility con la finalidad de que la clase UserManager no tenga demasiadas responsabilidades, dado que eso provoca una dificultas eb el mantenimiento del código. 
  Ahora, con la separación en clases específicas, se puede decir que el proyecto tiene nuevas caracteristicas como:
    1.	Mantenibilidad: Cada clase tiene un propósito claro, facilitando la modificación de una funcionalidad sin afectar otras.
    2.	Escalabilidad: Es más sencillo agregar nuevas funcionalidades, como cambiar el sistema de notificación (por ejemplo, de correos a SMS) o modificar la forma de almacenar datos.
    3.	Pruebas Unitarias: Las clases independientes permiten probar cada parte del sistema de manera aislada.

## Estructura del proyecto ##

|-- usermanager
   
    |-- database
    
        |-- ManagerDatabase.java
        
    |-- helpers
    
        |-- Notification.java
        
        |-- Validators.java
        
    |-- Main.java
    
    |-- UserManager.java
    
## Instruciones de ejecución ##

  1. Verificar la existencia de la clase main
  2. Dar click derecho a la clase main
  3. Dar click en la opcion "Run Code"
     
## Salida esperada ##

  Saving user to the database...
  
  Email: example@domain.com
  
  Password: password123
  
  Sending welcome email to example@domain.com
  
  Invalid email or password. User not added.

  ## Autores ##
  
  Jossue Játiva, Enrique Merizalde, Julissa Ruales
