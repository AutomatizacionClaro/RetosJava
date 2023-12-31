#language:es
Característica: Realizar registro en guru 99

  Yo como automatizador requiero ingresar a la pagina guru 99 y realizar tres registros.

  @guru
  Esquema del escenario: Generar registro
    Dado que ingreso en la pagina
    Y accedo a la opcion register
    Entonces diligencio el formulario
      | <nombre> | <apellido> | <telefono> | <correo> | <direccion> | <ciudad> | <provincia> | <codigoPosta> | <pais> | <usuario> | <contraseña> |

    Ejemplos:
      | nombre | apellido  | telefono   | correo                   | direccion          | ciudad       | provincia      | codigoPosta | pais      | usuario   | contraseña |
      | David  | Tabares   | 3155069955 | crisdavid.29@hotmail.com | Calle 138 # 113-60 | Buenos Aires | La plata       | 55          | ARGENTINA | judador   | 1234       |
      | Aura   | Rodriguez | 3155069966 | crisdavid.29@hotmail.com | Calle 138 # 113-60 | Madrid       | La prosperidad | 56          | COLOMBIA  | judadora  | 1235       |
      | Julio  | Berne     | 3155069955 | crisdavid.29@hotmail.com | Calle 138 # 113-60 | Harare       | perere         | 57          | ZIMBABWE  | judadores | 1236       |