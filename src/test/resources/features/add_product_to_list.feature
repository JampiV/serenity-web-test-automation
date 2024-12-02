# Created by JAMPIER at 2/12/2024
Feature: Agregar producto al carrito de manera exitosa

  @AddToCar @HappyPath
  Scenario Outline: Agregar producto al carrito
    Given el usuario ha iniciado sesion usando su user "<user>" y clave "<password>"
    When selecciona el producto de nombre "<name_product>" para agregar al carrito
    Then el producto se agrega al carrito de manera exitosa

    Examples:
    | user          | password  | name_product      |
    | usuarioqwerq  | pass123   | Nokia lumia 1520  |
    | usuarioqwerq  | pass123   | Nexus 6           |