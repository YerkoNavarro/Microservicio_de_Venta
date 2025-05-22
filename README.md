# Microservicio_de_Venta

proyecto de Java String boot,microservicio con gestion de Ventas 

conexion a base de datos en una instancia aws con mysqlserver

#metodos utilizados

crearVenta: crea una venta en la base de datos

traerVenta: muestra una venta que se encuentra en la base de datos

eliminarVenta: elimina la venta de la base de datos, se debe proporcionar el id

Factura: se conecta con un microservicio externo de usuarios para traer los datos de usuario y mostrarlos en formato String


#base de datos

para hacer la conexion a la base de datos se debe crear un archivo .env en la raiz principal, con el formato:
ENV_USER=
ENV_PASS=
ENV_PASS= 
ENV_SERVER=
ENV_PORT=
ENV_DBNAME=

#formato de ingreso de datos

los parametros se ingresan en formato tipo json ejemplo:

POST
/api/v1/ventas/

{
  "idVenta": 0,
  "idUsuario": 0,
  "idProductos": [
    0
  ]
}





