# Cuestionario

### 1. ¿Qué diferencia existe entre git add y git commit?
git add añade los cambios que el usuario quiere guardar cuando haga el commit, y el commit se encarga de hacer una "captura" que subir a git usando el comando push.

### 2. ¿Qué hace git push? ¿Por qué puede ser rechazado?
git push sube los cambios realizados en el archivo local a github. Puede ser rechazado al realizar un commit que otro equipo aún no reconoce.

### 3. ¿En qué se diferencian git fetch y git pull?
git fetch actualiza descarga los cambios del repositorio en github pero no cambia el codigo local. git pull se encarga de fusionar los cambios con tu codigo local.

### 4. ¿Qué significa origin/main?
Es la rama principal de seguimiento de tu repositorio. 

### 5. ¿Qué muestra git status antes y después de git add?
Muestra los cambios que se han añadido o que aún no se han añadido al siguiente commit.

### 6. ¿Qué información muestra git diff --cached?
Muestra los cambios que creará hacer el siguiente commit.

### 7. ¿Para qué sirve git log --oneline HEAD..origin/main?
Te muestra los commits que aún no has ejecutado en tu repositorio local.

### 8. ¿Por qué conviene usar commits pequeños y descriptivos?
Para poder revertir pequeños cambios sin perder mucho progreso en caso de que salga algo mal, y al describirlos es más facil localizar la version a la que quieres regresar.

### 9. ¿Cómo has resuelto el push rechazado?
Usando fetch, pull y sincronizando ambos equipos.

### 10. ¿En qué carpeta y ventana de IntelliJ estabas cuando ocurrió el rechazo? Guarda y publica:
Estaba en la ventana del "Equipo2" de IntelliJ, y no recuerdo que carpeta en especifico tenía abierta.