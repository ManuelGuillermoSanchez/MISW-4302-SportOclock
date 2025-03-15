# Sport O'Clock - Gestión de Rutinas

# Aplicación Mobile

## Requisitos

Antes de comenzar, asegúrate de tener las siguientes herramientas instaladas en tu máquina:

- **Android Studio**  
  [Descargar Android Studio](https://developer.android.com/studio)  
  Android Studio es el IDE recomendado para desarrollar aplicaciones Android. Asegúrate de instalar la última versión estable.

- **JDK 8 o superior**  
  Android Studio necesita Java Development Kit (JDK) para funcionar. Si aún no lo tienes, puedes descargarlo desde [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html).

## Compatibilidad

La aplicación es compatible con dispositivos que ejecuten **Android 5.0 (Lollipop)** (API 21) o versiones superiores.

## Clonar el repositorio

Clona este repositorio en tu máquina local con el siguiente comando:
  ```bash
    git clone https://github.com/ManuelGuillermoSanchez/MISW-4302-SportOclock.git
  ```


## Abrir el proyecto en Android Studio

- **Abre Android Studio.**
- **Haz clic en Open an existing project.**
- **Selecciona el directorio donde clonaste el repositorio.**


## Instalar dependencias
Android Studio se encargará de descargar automáticamente todas las dependencias necesarias desde Gradle. Si las dependencias no se descargan automáticamente, puedes forzar la sincronización ejecutando:
- **En el menú superior de Android Studio, selecciona File > Sync Project with Gradle Files.**
- **Espera a que termine la sincronización.**

## Ejecuta el proyecto
Para ejecutar el proyecto en un dispositivo o emulador:
- **Conecta un dispositivo Android a tu computadora o inicia un emulador de Android.**
- **Haz clic en el botón de Run (el icono verde de "play") en la parte superior de Android Studio.**
- **Selecciona el dispositivo o emulador donde quieres ejecutar la aplicación.**

El proyecto debería compilarse y ejecutarse en el dispositivo seleccionado.



# Aplicación WEB

Este proyecto es una aplicación web para gestionar rutinas deportivas, donde puedes crear, editar, eliminar y visualizar rutinas diarias. Está desarrollado con **Angular** y usa **Material Design** para los componentes visuales.

## Requisitos

Antes de empezar, asegúrate de tener las siguientes herramientas instaladas en tu máquina:

- **Node.js** (versión 14 o superior)  
  [Descargar Node.js](https://nodejs.org/)

- **Angular CLI**  
  Si aún no lo tienes instalado, puedes instalar Angular CLI globalmente con el siguiente comando:
  ```bash
  npm install -g @angular/cli

## Clonar repositorio**
    ```bash
    git clone https://github.com/ManuelGuillermoSanchez/MISW-4302-SportOclock.git

- **Navega al directorio del proyecto**
Accede al directorio del proyecto clonado:
    ```bash 
    cd MISW-4302-SportOclock
    cd SportOclock-Web

- **Instalar dependencias**
Una vez que estés dentro del directorio del proyecto, instala las dependencias necesarias ejecutando:
    ```bash 
   npm install

- **Ejecutar el proyecto**
Para iniciar el servidor de desarrollo y ver la aplicación en tu navegador, ejecuta:
    ```bash 
   ng serve


