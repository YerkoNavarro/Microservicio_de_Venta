# Microservicio_de_Venta

Proyecto en Java Spring Boot. Microservicio para la gestión de ventas.

Conexión a base de datos en una instancia AWS con MySQL Server.

---

## Métodos utilizados

- **crearVenta**: Crea una venta en la base de datos.  
- **traerVenta**: Muestra una venta que se encuentra en la base de datos.  
- **eliminarVenta**: Elimina la venta de la base de datos, se debe proporcionar el ID.  
- **Factura**: Se conecta con un microservicio externo de usuarios para traer los datos de usuario y mostrarlos en formato `String`.

---

## Conexión a base de datos

Para hacer la conexión a la base de datos se debe crear un archivo `.env` en la raíz principal con el siguiente formato:

```env
ENV_USER=
ENV_PASS=
ENV_SERVER=
ENV_PORT=
ENV_DBNAME=





