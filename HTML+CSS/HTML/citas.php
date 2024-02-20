
<html>

<head>
  <title>Insertar datos</title>
</head>

<body>

    <h1>Insertar datos a la base</h1>

  <form action="citasbases.php" method="post">

 <!-- Enunciado para guiar al usuario con la info-->
        Por favor,ingrese la fecha:
        <input type="date" name="Fecha">
        <br>
         <!-- text filed donde el usuario puede ingresar los datos-->
        Por favor,ingrese la hora de la cita:
        <input type="time" name="Hora">
        <br>
         <!-- text email donde el usuario puede ingresar su correo-->
        Por favor,ingrese su correo:
        <input type="email" name="Correo">
        <br>

         <!-- Boton que confirma y ejecuta el redireccionamiento a otra pagina-->
        <input type="submit" value="Confirmar">

  </form>

</body>

</html>

