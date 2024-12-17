
# Principios SOLID #

## Descripción ##

Los principios SOLID son un conjunto de buenas prácticas de programación orientada a objetos que permiten escribir código más limpio, escalable y fácil de mantener. Estos principios fueron introducidos por Robert C. Martin (Uncle Bob) y se consideran la base para el desarrollo de software de alta calidad.

El acrónimo SOLID representa los cinco principios fundamentales:

  S: Single Responsibility Principle (SRP)
  
  O: Open/Closed Principle (OCP)
  
  L: Liskov Substitution Principle (LSP)
  
  I: Interface Segregation Principle (ISP)
  
  D: Dependency Inversion Principle (DIP)

## Principios Explicados ##

### 1. Single Responsibility Principle (SRP)###

**Definición:**  Una clase debe tener una única responsabilidad y solo una razón para cambiar.

**Explicación:**  Cada clase debe encargarse de una sola función específica. Esto evita que una clase se vuelva demasiado compleja y difícil de mantener.

### 2. Open/Closed Principle (OCP) ###

**Definición:** El software debe estar abierto para extensión, pero cerrado para modificación.

**Explicación:** Puedes agregar nuevas funcionalidades sin modificar el código existente, usando interfaces o herencia.

### 3. Liskov Substitution Principle (LSP) ###

**Definición:** Los objetos de una clase base deben poder ser reemplazados por objetos de sus clases derivadas sin alterar el comportamiento del programa.

**Explicación:** Las clases derivadas deben extender el comportamiento de la clase base sin romper la funcionalidad existente.

### 4. Interface Segregation Principle (ISP) ###

**Definición:** Las clases no deben verse obligadas a implementar interfaces que no necesitan.

**Explicación:** Es mejor tener interfaces más pequeñas y específicas en lugar de una interfaz grande con métodos innecesarios.

### 5. Dependency Inversion Principle (DIP) ###

**Definición:** Las clases deben depender de abstracciones (interfaces) y no de implementaciones concretas.

**Explicación:** Promueve la inyección de dependencias para que las clases sean más flexibles y fáciles de testear.

## Beneficios de Aplicar SOLID ##

**- Mantenimiento:** El código es más fácil de entender, modificar y extender.
**- Reutilización:** Las clases y componentes pueden ser reutilizados en otros proyectos.
**- Escalabilidad:** Es más sencillo agregar nuevas funcionalidades sin afectar el código existente.
**- Pruebas:** Facilita la implementación de pruebas unitarias debido a la separación de responsabilidades.

Al aplicar los principios SOLID, logramos un código más limpio, robusto y flexible. Estos principios promueven el uso adecuado de abstracciones, interfaces y herencia, lo que reduce la complejidad y los errores en los proyectos de software.


## Autores ##
  
  Jossue Játiva, Enrique Merizalde, Julissa Ruales
