Feature: Inicio de Sesión de Usuario

  Scenario: Inicio de sesión exitoso con credenciales validas
    Given el usuario "Edinson" esta en la pagina de inicio de sesion
    When "Edinson" ingresa credenciales validas
    And  "Edinson" hace clic en el boton Ingresar
    Then "Edinson" deberia ver un mensaje de bienvenida "Bienvenido Usuario Super Administrador"
    And "Edinson" cerrar sesion
    Then "Edinson" deberia ver un mensaje de despedida "Hasta luego Edinson"
