# ExercisesCleanCodeAndDesignPatterns
I will add examples for solid patterns and other important patterns


## SOLID
**S:** Single responsability principle ... (SRP)

**O:** Open-Closed Principle ............... (OSP)  
 
**L:** Liskov Substitution Principle ...... (LSP)

**I:** Interface Segregation Principle .... (ISP)

**D:** Dependency Inversion Principle .... (DIP)

### Open Closed Principle (OSP)
`<< A module should be open for extension but closed for modification.>>`

In this example I will show a situation where the boss want differents search all the days.

Dominio: Productos con diferentes caracteristicas
Caso de Uso: Hacer busqueda de productos segun caracteristicas diferentes o combinandolas.
La solución mas sencilla es hacer un metodo por cada tipo de busqueda

**Problema:**

Cada vez que el equipo de producto quiera hacer un nuevo tipo de busqueda, tendré que modificar la clase y crear un metodo nuevo que cumpla con el nuevo filtro.
https://github.com/yaninagm/ExercisesCleanCodeAndDesignPatterns/blob/master/src/main/java/com/example/demo/openClosedPrinciple/problema/ProductFilter.java

**Solución:**

Abstraer los cambios en clases diferentes