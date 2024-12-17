# Principio de Inversión de Dependencias #

El Principio de Inversión de Dependencias establece que los módulos de alto nivel no deben depender de módulos de bajo nivel, sino que ambos deben depender de abstracciones. De igual manera, las abstracciones no deben depender de los detalles, sino que los detalles deben depender de las abstracciones. Este principio fomenta un diseño flexible y desacoplado, permitiendo que los componentes sean más fáciles de mantener, extender y probar. Al aplicar DIP, se introduce una capa de abstracción (por ejemplo, interfaces o clases abstractas) que actúa como intermediaria, logrando que los módulos concreten su funcionalidad sin estar directamente vinculados a implementaciones específicas.

## Estructura del proyecto ##

```
  creditcardpaiment/
  │-- CreditCardPayment.java
  │-- CryptoPayment.java
  │-- Main.java
  │-- PayPalPayment.java
  │-- Payment.java
  └-- PaymentProcessor.java

```  
    
## Instruciones de ejecución ##

  1. Verificar la existencia de la clase main
  2. Dar click derecho a la clase main
  3. Dar click en la opcion "Run Code"
     
## Salida esperada ##

```
Processing credit card payment of $100.0
Processing Paypal payment of $200.0
Processing crypto payment of $300.0

```
