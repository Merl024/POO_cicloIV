El JDK es Java Development Kit. Javac es lo que convirte a java en codigo bytecode. 
 ## .java -> compilador -> .class
El JDK(javac) incluye el JRE (.clas), el cual es el ambiente de ejecucion de java. 
Dentro del jdk tambien incluye el JVM maquina virtual de java, el cual es un interprete

Hay varios tipos de datos: 
1. primitivos: datos sinples
    - enteros: byte, short, int, long. 
La diferencia entre cada uno es la cant de digitos que puede almacenar.
    - punto flotante: float y double.
    - caracter: char
    - boolean

2. Objetos: almacenan referncias a objetos
    - cadenas (strings)
    - arreglos 
    - objeos de clases

Cada que creamos una variable se guarda en la RAM del dispositivo. Estas variables se borran al terminar la ejecucion. Cada espacio de memoria se le asigna un valor hexadecimal esta es la direccion de referencia de memoria. 
Cuando trabajamos con cadenas, primero se crea el objeto en cierta posición de la memoria (HEAP). Por eso cuando recuperamos el valor del objeto accedemos a la posición de memoria (STACK). 

No se modifica el conjunto de cadenas, sino que se crea un nuevo objeto que se almacena en la memoria. y sobreescribe sobre la posicion de la memoria. 