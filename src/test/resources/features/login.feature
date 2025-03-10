@tag
Feature: Login Feature
  Ich werde diese Beispiele Template benutzen für mein erste Code

  @tag1
  Scenario: Login con credenciales validas
    Given El usuario abre la pagina de login
    When El usuario ingresa su nombre y contraseña
    Then El usuario es redirigido al dashboards
    
  @tag2
  Scenario: Login con credenciales incorrectas
  	Given El usuario abre la pagina de login
  	When El usuario ingresa un nombre y contraseña inválidos
  	Then El sistema muestra mensaje de alerta
