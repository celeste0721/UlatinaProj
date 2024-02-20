<!DOCTYPE html>
<html>
<head>
  <title>Bienvenidos</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="login.css">
</head>
<body>
  <?php
    echo '
    <ul>
      <li>
        <a href="#" target="_blank"><i class="fa fa-bars"></i></a>
        <ul class="dropdown">

          <li><a href="servicio.php">Servicio</a></li>
          <li><a href="Horario.php">Horarios</a></li>
          <li><a href="">Preguntas Frecuentes</a></li>
          <li><a href="#">Citas</a></li>
           <li><a href="paquete.php">Paquetes</a></li>

        </ul>
      </li>
      <li><a href="Inicio.php">Inicio</a></li>
      <li><a href="Contacto.php">Contacto</a></li>
      <li><a href="Filo.php">Sobre Nosotros</a></li>

    </ul>
    <a href="#" class="logo i">
        <img src="https://i.postimg.cc/br4YFVJ7/Proyecto.png" alt="Logo de la compañía">
    </a>
    ';

    include 'footer.php';


echo '
    <form action="Regis.php" method="POST">
        <h1><i class="fa fa-user-circle"></i> Login</h1><br>
        <input type="text" name="correo" placeholder="Correo Electronico">
        <input type="password" name="contrasena" placeholder="Contraseña">
        <button type="button" onclick="redireccionarRegistro()">Iniciar Sesión</button>
        <p>______________________________</p>
        <button type="submit" name="registrarse">Registrarse</button>
    </form>

    <script>
        function redireccionarRegistro() {
            window.location.href = "otro_formulario.php";
        }
    </script>
';

  ?>
</body>
</html>


