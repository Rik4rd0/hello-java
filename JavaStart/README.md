# hello-java
---
[![Java](https://img.shields.io/badge/Java-JDK_21+-red?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)](https://www.oracle.com/es/java)

## Guia de aprendizaje de java 

### 1. Introducción a Java
Java es un lenguaje de programación de propósito general, orientado a objetos y concurrente. Fue desarrollado por Sun Microsystems (ahora parte de Oracle Corporation) y lanzado por primera vez en 1995. Java es conocido por su portabilidad, lo que significa que el código Java puede ejecutarse en diferentes plataformas sin necesidad de recompilación.

[Java](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) es un lenguaje de programación de propósito general, orientado a objetos y concurrente. Fue desarrollado por Sun Microsystems (ahora parte de Oracle Corporation) y lanzado por primera vez en 1995. Java es conocido por su portabilidad, lo que significa que el código Java puede ejecutarse en diferentes plataformas sin necesidad de recompilación.

### 2. Instalación de Java
Para instalar Java, sigue estos pasos:
1. **Descargar el JDK**: Ve al sitio web oficial de [Oracle](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) y descarga la versión más reciente del JDK (Java Development Kit).
2. **Instalar el JDK**: Ejecuta el instalador y sigue las instrucciones en pantalla. Asegúrate de seleccionar la opción para agregar Java al PATH del sistema.
3. **Verificar la instalación**: Abre una terminal o símbolo del sistema y ejecuta el siguiente comando:
   ```bash
   java -version
   ```
   Deberías ver la versión de Java instalada en tu sistema.
4. **Configurar variables de entorno**: Si es necesario, configura las variables de entorno `JAVA_HOME` y `PATH` para que apunten a la ubicación del JDK instalado. Esto es especialmente importante si estás utilizando un IDE como Eclipse o IntelliJ IDEA.
5. **Instalar un IDE**: Aunque puedes escribir código Java en cualquier editor de texto, se recomienda utilizar un entorno de desarrollo integrado (IDE) como [Eclipse](https://www.eclipse.org/) o [IntelliJ IDEA](https://www.jetbrains.com/idea/) para facilitar el desarrollo.
6. **Configurar el IDE**: Si utilizas un IDE, asegúrate de configurarlo para que utilice la versión correcta del JDK que has instalado. Esto suele hacerse automáticamente, pero es bueno verificarlo.
7. **Crear un proyecto Java**: Abre tu IDE y crea un nuevo proyecto Java. Esto te proporcionará una estructura de carpetas adecuada para tu código y recursos.
   8. **Escribir tu primer programa**: Crea un archivo Java con el siguiente código:
      ```java
      public class HelloWorld {
          public static void main(String[] args) {
              System.out.println("¡Hola, mundo!");
          }
      }
      ```   
9. **Compilar y ejecutar**: Compila y ejecuta tu programa desde el IDE o desde la línea de comandos. Si todo está configurado correctamente, deberías ver "¡Hola, mundo!" en la salida.
   10. **Explorar más**: A partir de aquí, puedes comenzar a explorar más características de Java, como clases, objetos, herencia, interfaces y bibliotecas estándar. Hay muchos recursos en línea y libros disponibles para aprender Java en profundidad.
