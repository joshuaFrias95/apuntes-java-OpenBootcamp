# Refactoring

La refactorización o *refactoring* es la técnica de reestructuración 
de programa de software para agilizar y optimizar el flujo de trabajo 
al utilizar dicho programa y de esa manera *"limpiar el código"*.

Es importante mencionar que al refactorizar **no alteramos el funcionamiento 
del software**, mejoramos su estructura sin agregar funcionalidades 
o resolver conflictos. En caso de obtener algún error en este proceso 
está claro que existe un *bug* en el código fuente.

## Ejemplo de refactorización

-----------------------------------


##### Repetición de código
Es sumamente importante no ser repetitivos al programar, es decir, evitar
realizar declaraciones de código más de una vez. 

<br>

**Programa repetitivo (sin refactorizar)**
```
void int priceOff(valor) {

bool descuento;
    
    if (valor < 500) {
        descuento = true;
        system.out.println("Su compra ya fue realizada")
        
    } else if ( valor > 500) {
        descuento = true;
        system.out.println("Su compra ya fue realizada")
        
    } else if (valor es == 0) {
        descuento = false;
        system.out.println("Su compra ya fue realizada")
        
    } else if (valor < 20) {
        descuento = false;
        system.out.println("Su compra ya fue realizada");
        
    }
    
}
```

<br>

Si bien esta función puede ser funcional, nos resulta repetitivo y poco
escalable al momento de leerlo, para poder mejorar su lectura podemos
reestructurarlo de la siguiente manera:


**Programa refactorizado**
```
void int priceOff(valor) {

bool descuento;
    
    if (valor => 0 && valor < 20) {
        descuento = false;
        
    } else if ( valor >= 20) {
        descuento = true;
              
    } 
    
    system.out.println("Su compra ya fue realizada");
    
}
```

