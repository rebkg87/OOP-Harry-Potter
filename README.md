# Proyecto de Programación Orientada a Objetos (POO) - Harry Potter

¡Bienvenidos a mi proyecto de POO inspirado en el mundo de **Harry Potter**! Este proyecto fue desarrollado como parte de un taller de introducción a POO, donde se aplican los conceptos básicos de la programación orientada a objetos como abstracción, encapsulación, herencia, polimorfismo, e interfaces.

## Descripción

Este proyecto recrea un sistema de personajes del universo de **Harry Potter**, permitiendo que los personajes utilicen magia para lanzar hechizos y combatir entre sí. Los hechizos son seleccionados de forma aleatoria, y los personajes tienen diferentes características que determinan su comportamiento durante la pelea.

### Funcionalidades principales:
- **Clases y objetos** que representan personajes del mundo de Harry Potter, como magos y brujas.
- **Encapsulación** de los atributos y métodos para mantener un buen diseño de software.
- **Herencia** para reutilizar código y crear personajes que comparten características comunes.
- **Polimorfismo** que permite que los personajes puedan realizar distintas acciones como lanzar hechizos, defenderse, etc.
- **Interfaces** implementadas para que algunos personajes puedan realizar acciones especiales.
- Una **pelea mágica** donde dos personajes se enfrentan utilizando hechizos seleccionados aleatoriamente.

## Características técnicas

1. **Clases y Objetos**: 
   - Se definen clases como `Character`, `House`, `Spell`, entre otras, para representar las entidades del mundo de Harry Potter.
   
2. **Herencia**: 
   - La clase `Character` es la clase base, y `Professor` es una subclase que hereda de `Character`, entre otras subclases que comparten propiedades.

3. **Polimorfismo**: 
   - Los personajes pueden utilizar distintos tipos de hechizos, y estos hechizos se comportan de manera diferente dependiendo del personaje que los lanza.

4. **Interfaces**: 
   - Se implementan interfaces para que ciertos personajes puedan ejecutar acciones especiales, como hechizos de defensa avanzada o técnicas de combate únicas.

5. **Pelea de magia**: 
   - Dos personajes se enfrentan en un duelo de magia. Los hechizos se seleccionan aleatoriamente y los personajes utilizan diferentes estrategias de ataque y defensa.

## Instrucciones para correr el proyecto

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/rebkg87/OOP-Harry-Potter.git
   ```
   
2. **Abrir el proyecto** en tu editor de código favorito.

3. **Ejecutar el proyecto**:
   Asegúrate de tener el entorno de desarrollo configurado correctamente.
   
   - **Java**:
     ```bash
     javac Main.java
     java Main
     ```

## Ejemplos de uso

Una vez que ejecutes el proyecto, podrás ver cómo dos personajes se enfrentan utilizando hechizos aleatorios. Cada hechizo tiene efectos diferentes, y los personajes tienen diferentes estadísticas que afectan el resultado del combate.

**Ejemplo de salida:**
```
¡Harry Potter lanza Avada Kedavra!
¡Voldemort responde con Expelliarmus!
...
¡Harry Potter gana la pelea!
```

## Conceptos de POO aplicados

- **Abstracción**: Se simplifican los personajes y hechizos al enfocarse en las características relevantes para el combate.
- **Encapsulación**: Los atributos de los personajes y los hechizos están protegidos y se acceden a través de métodos.
- **Herencia**: Clases como `Character`, `Professor`, y otros tipos de personajes heredan propiedades y métodos comunes.
- **Polimorfismo**: Los personajes y hechizos tienen comportamientos diferentes dependiendo del contexto en el que se utilizan.
- **Interfaces**: Se aplican para permitir que ciertos personajes realicen acciones específicas, como lanzar hechizos avanzados.

## Próximos pasos

- Implementar más hechizos y estrategias de combate.
- Agregar más personajes del universo de Harry Potter.
- Mejorar la inteligencia de los personajes para que puedan tomar decisiones más estratégicas durante los combates.

## Contribuciones

Si deseas contribuir a este proyecto, ¡siéntete libre de hacer un fork y enviar tus pull requests!

## Contacto

Si tienes preguntas o sugerencias, puedes contactarme a través de [rebe.ga87@gmail.com].
