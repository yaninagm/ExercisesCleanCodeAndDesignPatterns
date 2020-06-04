# Exercises Clean Code And Design Patterns
I will add examples for SOLID  and other important patterns

Los ejercicios estarán distribuidos por tipo de patron. Recomiendo tratar de resolverlo a partir del enunciado y luego 
revisar la resolución, entendiendo cual es la mejor forma de hacerlo.
 
## SOLID
**S:** Single responsability principle ... (SRP)

**O:** Open-Closed Principle ............... (OSP)  
 
**L:** Liskov Substitution Principle ...... (LSP)

**I:** Interface Segregation Principle .... (ISP)

**D:** Dependency Inversion Principle .... (DIP)

### Open Closed Principle (OSP)
_`<< A module should be open for extension but closed for modification.>>`_

**Ejercicio:** 
Tenemos un sistema de catálogo de productos, donde cada producto tiene diferentes caracteristicas, como color,
 tamaño, etc. 
 
 El jefe de producto de la empresa nos solicita que le permitamos filtrar los productos por un tamaño especificado.
 Mas tarde se acerca y nos pide que filtremos según un color especificado.
 Al dia siguiente quire poder filtrar los productos usando las dos condiciones.
 
 Implemente el código necesario para poder filtrar diferentes productos segun los requerimientos del jefe de producto, 
 teniendo en cuenta que solicita filtros nuevos continuamente.



**Solución 1 con malas prácticas:**

Se desarrollo un metodo por cada uno de los tipos de filtros que nos pide el jefe de producto.
Cada vez que el equipo de producto quiera hacer un nuevo tipo de busqueda, tendré que modificar la clase (rompe el principio de cerrado para su modificación) y crear un metodo nuevo que cumpla con el nuevo filtro.


[Codigo de ejemplo con malas prácticas](https://github.com/yaninagm/ExercisesCleanCodeAndDesignPatterns/blob/master/src/main/java/com/example/demo/openClosedPrinciple/wrongPractice)

**Solución2 usando el principio de OCP:**

Abstraer los cambios en clases diferentes, utilizando [ el patron Specificación](https://en.wikipedia.org/wiki/Specification_pattern)
La ventaja es que si alguien le solicita hacer un nuevo filtro, no tiene que modificar la clase, sino que crea una clase nueva, que herede de la ya existente

[Codigo de ejemplo con buenas prácticas](https://github.com/yaninagm/ExercisesCleanCodeAndDesignPatterns/blob/master/src/main/java/com/example/demo/openClosedPrinciple/goodPractice)

Se podría hacer algo sencillo usando objetos para cada tipo de filtro (codigo abajo), pero no podríamos hacer de una manera sencilla los AND, es por eso que este tipo de condición se la agrupa en un metodo.
`Filter conditionByColor = new FilterByColor(Color.GREEN);
 		Filter conditionBySize = new FilterBySize(Size.LARGE);
 		conditionByColor.filter(products).forEach(p -> System.out.println("producto: "+ p.getName()));
 		conditionBySize.filter(products).forEach(p -> System.out.println("producto: "+ p.getName()));`
 		
 *** Por que usar el parámetro T ? ***
 Nos permite poder adaptarnos a cualquier tipo de busqueda de cualquier elemento y de cualquier filtro