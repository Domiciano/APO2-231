## Libreta telefónica

### Formato de test
<a href="https://docs.google.com/document/d/1pmCE3p_sOByplPq3sx8I4OkXnmm1pZ-M/edit?usp=sharing&ouid=117897710133227559254&rtpof=true&sd=true">Formato de test 2023</a>


### Problema
Queremos hacer una lista de contactos. Liste requerimientos, haga un conjunto de pruebas iniciales, programe los test para pasarlos y finalmente refactorice el código. Vuelva a refinar los test en caso de que le haga falta probar otros posibles caminos

### Clase Contact
	1. Crear un objeto correctamente
	2. Los campos NO deben estar vacíos 
	3. Verificar que el número sí corresponda a números. (Se descartan los números tipo +5712123123)
	4. Verificar que el correo sí corresponda a un correo (Que tenga mínimo @ y .)

### Clase ContactList
	1. Agregar contactos a la lista
	2. Buscar un contacto por teléfono
	3. Buscar un contacto por email
	4. Si se agrega un contacto con el mismo número, lanzar excepción
	5. Eliminar contacto por número
	6. Imprimir lista de contactos
