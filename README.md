# S301_Patterns_1

## 📄 Descripción
En esta práctica vas a identificar y montar programas usando patrones de diseño en Java. La idea es que tu código sea más extensible, reutilizable y mantenible aprovechando los patrones Singleton, Abstract Factory y Command.

## 🔽 Enunciados

<details>
<summary>  
🔹 Nivel 1 – Singleton  (clica para ver el enunciado completo)
</summary>

    Ejercicio – Undo Command  
    
    Recrea el comando `history`/`undo` de la consola: 
    - Crea una clase `Undo` que guarde las últimas órdenes introducidas por consola.
    - Debe permitir:
      - **Agregar** comandos.
      - **Eliminar** el último comando.
      - **Listar** el historial (igual que `history` en Linux).
    - `Undo` **debe** implementarse usando el patrón **Singleton**.
    - En el `Main`, muestra un menú:
      1. Añadir orden  
      2. Deshacer última orden  
      3. Ver todo el historial  
      4. Salir  
</details> <details> <summary> 🔹 Nivel 2 – Abstract Factory (clica para ver el enunciado completo) </summary> 

    Ejercicio – Agenda Internacional  
    
    Haz un gestor de contactos internacional con Abstract Factory:
    - La app debe permitir **añadir** contactos con:
      - Dirección (formato de cada país).
      - Teléfono (formato internacional).
    - Diseña una **Abstract Factory** que:
      - Genere familias de objetos (`Address`, `Phone`) según el país.
      - Cada implementación formatee dirección y teléfono adecuadamente.
    - En el `Main`, pide al usuario:
      1. Seleccionar país (ej. España, EEUU, Japón…).  
      2. Introducir datos de contacto.  
      3. Mostrar el contacto formateado.  
</details> <details> <summary> 🔹 Nivel 3 – Command (clica para ver el enunciado completo) </summary>

    Ejercicio – Parking de Vehículos  
    
    Crea un parking que gestione coche, bici, avión y barco usando **Command**:
    - Cada vehículo debe tener métodos:
      - `arrancar()`
      - `acelerar()`
      - `frenar()`
    - Define:
      - **Interface** `Command` con `execute()`.
      - **Comandos concretos** para cada acción/vehículo.
      - Un **invocador** (parking) que asigne y ejecute comandos.
    - En el `Main`, simula:
      1. Arrancar todos los vehículos.  
      2. Acelerar cada uno.  
      3. Frenar cada uno.  
      4. Mostrar el estado actual por consola.  
</details>

## 💻 Tecnologías Utilizadas
El proyecto ha sido desarrollado utilizando:

- Java 23.0.2  
- IntelliJ IDEA como entorno de desarrollo  
- Git y GitHub para control de versiones  

## 📋 Requisitos
Para ejecutar el proyecto es necesario contar con:

- JDK 23 instalado en el sistema  
- Git instalado y configurado  
- IntelliJ IDEA  
- Conexión a Internet para clonar el repositorio  

## 🛠️ Instalación

### Clonar el repositorio

- Opción 1: Desde GitHub (sin terminal)  
1. Ve al repositorio en GitHub:  

        https://github.com/Jusep1983/S301_Patterns_1.git


2. Haz clic en el botón verde **Code** (Código).  
3. Selecciona **Download ZIP**.  
4. Extrae el ZIP en la ubicación de tu preferencia.  

- Opción 2: Desde IntelliJ IDEA
1. Abre IntelliJ IDEA.  
2. En la pantalla de inicio, selecciona **Get from VCS** (Obtener desde VCS).  
3. Selecciona **Git** como sistema de control.  
4. Pega la URL del repositorio:  

       https://github.com/Jusep1983/S301_Patterns_1.git


5. Elige la carpeta de destino y haz clic en **Clone**.  
6. IntelliJ IDEA detectará e importará el proyecto como Java.  

- Opción 3: Desde la terminal (con Git instalado)
1. Abre la terminal.  
2. Navega hasta la carpeta donde quieres clonar:  

        cd /ruta/deseada

3. Clona el repo:


        git clone https://github.com/Jusep1983/S301_Patterns_1.git
4. Accede al proyecto:


        cd S301_Patterns_1
### Configurar el entorno en IntelliJ IDEA
- Abre IntelliJ IDEA y el proyecto si no está abierto.

- Ve a File → Project Structure → Project.

- Asegúrate de que el Project SDK está en JDK 23.

## ▶️ Ejecución
En IntelliJ IDEA:
- Abre la clase que contiene public static void main(String[] args).

- Haz clic en el botón Run (▶️) o presiona Shift + F10.

- Sigue el menú por consola para navegar entre los niveles de la práctica.


## 🌐 Despliegue
Proyecto diseñado para uso local de aprendizaje; no dispone de flujo de despliegue en producción.

## 🤝 Contribuciones
Si deseas contribuir al proyecto:

- Haz un fork del repositorio.

- Crea una rama con tus cambios.

- Envía una pull request detallando tus modificaciones.

¡Gracias por pasarte y a tope con los patrones! 🚀
