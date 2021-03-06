# Exercises Clean Code And Design Patterns
I will add examples for SOLID  and other important patterns

Los ejercicios estarán distribuidos por tipo de patron. Recomiendo tratar de resolverlo a partir del enunciado y luego 
revisar la resolución, entendiendo cual es la mejor forma de hacerlo.
 
# SOLID
**S:** Single responsability principle ... (SRP)

**O:** Open-Closed Principle ............... (OSP)  
 
**L:** Liskov Substitution Principle ...... (LSP)

**I:** Interface Segregation Principle .... (ISP)

**D:** Dependency Inversion Principle .... (DIP)

## Open Closed Principle (OSP)
_`<< A module should be open for extension but closed for modification.>>`_

Este es uno de los principios mas importantes.

El principio es: Deberiamos escribir nuestros modulos de tal manera que puedan ser extendidos y usados sin que sea necesario modificarlos. En otras palabras, debemos permitir los cambios sin tener que cambiar el código.

Las técnicas mas usadas están basadas en  el uso de la abstraccion.

Lo importante de este principio es que no debemos editar la funcionalidad que sabemos que esta lista y funcionando y que si deseamos una funcionalidad adicional hay que conectarla a lo ya existente sin modificar el código.

### Ejercicio OCP 
Tenemos un sistema de catálogo de productos, donde cada producto tiene diferentes caracteristicas, como color,
 tamaño, etc. 
 
 El jefe de producto de la empresa nos solicita que le permitamos filtrar los productos por un tamaño especificado.
 Mas tarde se acerca y nos pide que filtremos según un color especificado.
 Al dia siguiente quire poder filtrar los productos usando las dos condiciones.
 
 Implemente el código necesario para poder filtrar diferentes productos segun los requerimientos del jefe de producto, 
 teniendo en cuenta que solicita filtros nuevos continuamente.

[Aquí puede comenzar a desarrollar](https://github.com/yaninagm/ExercisesCleanCodeAndDesignPatterns/blob/master/src/main/java/com/example/demo/openClosedPrinciple/ownResolution)


#### Solución 1 con malas prácticas:

Se desarrollo un metodo por cada uno de los tipos de filtros que nos pide el jefe de producto.
Cada vez que el equipo de producto quiera hacer un nuevo tipo de busqueda, tendré que modificar la clase (rompe el principio de cerrado para su modificación) y crear un metodo nuevo que cumpla con el nuevo filtro.


[Codigo de ejemplo con malas prácticas](https://github.com/yaninagm/ExercisesCleanCodeAndDesignPatterns/blob/master/src/main/java/com/example/demo/openClosedPrinciple/wrongPractice)

#### Solución2 usando el principio de OCP:

Abstraer los cambios en clases diferentes, utilizando [ el patron Specificación](https://en.wikipedia.org/wiki/Specification_pattern)
La ventaja es que si alguien le solicita hacer un nuevo filtro, no tiene que modificar la clase, sino que crea una clase nueva, que herede de la ya existente

[Codigo de ejemplo con buenas prácticas](https://github.com/yaninagm/ExercisesCleanCodeAndDesignPatterns/blob/master/src/main/java/com/example/demo/openClosedPrinciple/goodPractice)

Se podría hacer algo sencillo usando objetos para cada tipo de filtro (codigo abajo), pero no podríamos hacer de una manera sencilla los AND, es por eso que este tipo de condición se la agrupa en un metodo.
`Filter conditionByColor = new FilterByColor(Color.GREEN);
 		Filter conditionBySize = new FilterBySize(Size.LARGE);
 		conditionByColor.filter(products).forEach(p -> System.out.println("producto: "+ p.getName()));
 		conditionBySize.filter(products).forEach(p -> System.out.println("producto: "+ p.getName()));`
 		
 ** Por que usar el parámetro T ? **
 
 Nos permite poder adaptarnos a cualquier tipo de busqueda de cualquier elemento y de cualquier filtro
 
 ## Liskov sustitution principle (LSP)
 
`"Subclases should be substitutable for their base classes"`
 
 La clase derivada debe poder sutituirse por su clase base. Esto quiere decir que un usuario de una clase base deberia 
 seguir funcionando si se le pasa una clasa derivada de la clase base.
 
 
 ### Ejercicio LSP
 
 Cree rectangulos y cuadrados, teniendo en cuenta que los cuadrados tienen sus lados iguales o su altura igual a su anchura.
 
 Luego demuestre que el calculo del area para cada objeto de cada tipo da el resultado esperado.
 
 Si violas este principio, da como resultado un codigo incorrecto en la herencia.
 
 #### Solución usando malas prácticas
 
El método getArea() funciona correctamente para los objetos rectangulos pero no para los cuadrados.

Eso es porque hay funciones que no se limitan a hacer lo que deberían hacer. Ej: getWeidth()  

[Codigo de ejemplo con buenas prácticas](https://github.com/yaninagm/ExercisesCleanCodeAndDesignPatterns/blob/master/src/main/java/com/example/demo/LiskovSustitutionPrinciple/goodPractice)
 

 #### Solución usando buenas prácticas
 
El primer punto a tner en cuenta es que no es necesario una clase cuadrado, solo deberías definir 
si un rectangular es un cuadrado  o no a través de un metodo que lo indique.

Para construir explicitamente un cuadrado o un rectangulo, usaremos el patrón fabrica

[Codigo de ejemplo con buenas prácticas](https://github.com/yaninagm/ExercisesCleanCodeAndDesignPatterns/blob/master/src/main/java/com/example/demo/LiskovSustitutionPrinciple/goodPractice)


## Interface Segregation  Principle (ISP)

`Los clientes no deben ser forzosamente dependiente de las interfaces que no utilizan`


### Ejercicios
En una empresa de impresoras multifucnionales ha desarrollado diferentes modelos de impresoras,
 para eso se dicidio definir en una única interface los metodos generales que podría tener toda impresora.

 La impresora Modelo1998 fue el primer modelo en basarse en esta interfaz; poco después se añadió un nuevo modelo, Modelo2000,
  que además de las funciones anteriores añadía la posibilidad de hacer fotocopias.

Posteriormente, surgió un nuevo modelo (Modelo2002) que se basaba en la misma clase abstracta ImpresoraMultifuncional e
 incorporaba el soporte para comunicaciones TCP/IP en lugar del servicio de fax;
  este modelo permitía enviar un documento directamente por correo electrónico, evitando así los altos costes de telefonía. 

Implemente estos tipos de impresoras.

