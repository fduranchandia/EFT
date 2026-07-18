Este sistema busca desarrollar un sistema modular utilizando Java, aplicando los principios fundamentales de la Programación Orientada a Objetos. El objetivo de este proyecto es implementar un prototipo de software que represente y gestione entidades propias de un dominio específico, mediante una solución estructurada, reutilizable y extensible. Las principales problemáticas a resolver de la agencia de turismo Llanquihue Tour son las siguientes:

- Información duplicada y desorganizada
- Gestión manual de reservas
- Ausencia de categorización de personas
- Falta de trazabilidad de itinerarios y paquetes turísticos
- Poca reutilización de estructuras
- Dependencia de flujos lineales y poco escalables.

El proyecto está dividido en paquete model, que contiene las clases principales Persona, Empleado y Cliente, las cuales heredan de Persona. También se tiene la clase Dirección y Rut que componen la clase Persona. En data se tiene la clase GestorDatos que contiene los principales métodos mostrarPersonas(), mostrarClientes(), mostrarEmpleados() y cargarPersonas(txt).

Finalmente en Main, se crea el objeto gestor de clase GestorDatos al cual se le aplica el método cargarPersonas(personas.txt). Luego a gestor se le aplica el método gestor.mostrarEmpleados() y gestor.mostrarClientes. En consola se observan los empleados del .txt con sus respectivos sueldos y los clientes del .txt con sus respectivas categorías.
