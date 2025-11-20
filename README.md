Descripción del Proyecto

Este programa en Java simula el registro y funcionamiento de diferentes dispositivos electrónicos.
El proyecto implementa conceptos fundamentales de Programación Orientada a Objetos:

Encapsulamiento

Herencia

Polimorfismo

Sobrescritura de métodos

Manejo de listas (ArrayList)

Excepciones personalizadas

El sistema permite crear objetos de tipo Laptop y Teléfono, almacenarlos en una lista y mostrar su información

Clases Principales
1. Dispositivo (Clase Padre)

Atributos privados: marca, modelo, precio

Getters y setters validados

Método mostrarInfo() sobrescrito por clases hijas
 2. Laptop (Clase Hija)

Atributo adicional: ramGB

Sobrescribe método mostrarInfo()

3. Telefono (Clase Hija)

Atributo adicional: compania

Sobrescribe método mostrarInfo()

4. DatoInvalidoException

Excepción personalizada lanzada por:

Marca vacía

Precio negativo
5. Main

Crea un ArrayList<Dispositivo>

Registra objetos Laptop y Telefono

Maneja excepciones con try–catch

Muestra información con polimorfismo
