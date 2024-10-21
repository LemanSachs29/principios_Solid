<div align="center">
<h1>Principios Solid</h1>
</div>

_En este proyecto encontrarás 5 paquetes donde, mediante un ejemplo práctico se trata de aplicar un principio Solid concreto a un código sin refactorizar._
## S - Single Responsibility Principle (Principio de Responsabilidad Única): 
Este principio establece que cada clase debe tener una única responsabilidad o razón para cambiar. Es decir, una clase debe encargarse de realizar una tarea específica y no mezclar responsabilidades. Esto facilita la mantenibilidad del código, ya que si hay un cambio en una funcionalidad, solo una parte específica del código se verá afectada.

## O - Open/Closed Principle (Principio Abierto/Cerrado): 
Una entidad (como una clase o función) debe estar abierta para la extensión, pero cerrada para la modificación. Esto significa que puedes agregar nueva funcionalidad sin modificar el código existente, lo que evita introducir errores en un código ya probado.

## I - Interface Segregation Principle (Principio de Segregación de Interfaces): 
Los clientes no deberían verse obligados a depender de interfaces que no utilizan. En lugar de tener interfaces grandes y generales, es mejor crear interfaces más específicas y pequeñas que se ajusten a las necesidades de los clientes, evitando la dependencia innecesaria de métodos que no se necesitan.

## L - Liskov Substitution Principle (Principio de Sustitución de Liskov): 
Este principio establece que los objetos de una subclase deben poder sustituir a objetos de la clase base sin alterar el comportamiento del programa. Es decir, una clase derivada debe ser completamente compatible con la clase base en términos de funcionalidad, manteniendo las expectativas de comportamiento.

## D - Dependency Inversion Principle (Principio de Inversión de Dependencia): 
Los módulos de alto nivel no deberían depender de módulos de bajo nivel; ambos deben depender de abstracciones. Además, las abstracciones no deberían depender de los detalles, sino que los detalles deben depender de las abstracciones. Este principio fomenta la desacopladura entre las diferentes partes del sistema, mejorando la flexibilidad y escalabilidad.
