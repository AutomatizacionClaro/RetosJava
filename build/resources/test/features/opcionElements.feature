#language:es
Característica: Interactuar en la opcion menu elements
  Yo como automatizador requiero ingresar al menu elements e interactuar con sus diferentes funcionalidades.

  @elements
  Esquema del escenario: Ingresar a la opcion radio button
    Dado que envio la url
    Y accedo a la opcion elements
    Cuando le doy clic a la opcion radio button
    Y selecciono la opcion requerida
      | <opcion> |
#    Entonces el sistema muestra la opcion seleccionada

    Ejemplos:
      | opcion     |
      | Yes        |
      | Impressive |