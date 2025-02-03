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

Al momento de crear variables estas pueden empezar por letras, simbolos de dolas o guiones bajos
## nombre, _nombre, $nombre

>> BUENAS PRACTICAS
- Usar camelCase
- Ser descriptivos y poner para que sirve cada variable - usar el abecedario en ingles
- Usar prefijos. 
    # Por ejemplo, cuando se quiere ocupar un booleano se le puede poner "is" o "has". [ boolean isActivo = true; ]
- No abusar de abreviaturas. 

 >> TIPO VAR
Infiere el tipo de datos en variables locales. Nos permite crear una variable sin especificar explicitamente su tipo de dato. 
##### var nombre = "Ximena";
Este es exclusivo para definir variables LOCALES dentro de METODOS. Y se le debe dar un dato de entrada, sino no podra INFERIR que tipo de dato. 
## var numero; // INCORRECTO, no tiene dato para inferir.
Los datos tienen que ser inferibles
## var lista = null; // INCORRECTO

>> CONSTANTES
Es una variable cuyo valor NO se puede modificar una vez se haya incicializado 
    # final tipo DIAS_EN_SEMANA = valor;
    una buena practica es escribirlas en mayusculas y separarlas en _ 