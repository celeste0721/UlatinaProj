  
<!DOCTYPE html>
<html>
<head>
  <title>Bienvenidos</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="Regis.css">
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
    <form action="login.php" method="POST">

        <h1><i class="fa fa-id-card-o"></i> Registro </h1><br>
         <input type="text" name="nombre" placeholder="Nombre completo">
        <input type="text" name="correo" placeholder="Correo Electronico">
        <input type="password" name="contrasena" placeholder="Contraseña">

        <button type="button" onclick="redireccionarRegistro()">Confirmar</button>
        <p>______________________________</p>
        <button type="submit" name="regresar">Regresar</button>
    </form>


    <script>
        function redireccionarRegistro() {
            window.location.href = ".ph.base ";
        }
    </script>
';


echo '


  //Se genera la conexion con la base
    $conexion = mysqli_connect("localhost", "root", "", "baseproyecto") or die("Problemas con la conexión");

    // Se llaman los datos ingresados por los usuarios, recuerdo que este escape string el profe lo comento con respecto a prevenir ataques de inyeccion en clase

    $Fecha= mysqli_real_escape_string($conexion, $_POST['Fecha']);
    $Hora = mysqli_real_escape_string($conexion, $_POST['Hora']);
    $Correo = mysqli_real_escape_string($conexion, $_POST['Correo']);

    //Se ejecuta la consulta para insertar los datos en la tabla nombre con las siguientes columnas, nombre,apellido,curso y si algo falla se coloca el die para no arruinar la conexion a la base

    mysqli_query($conexion, "INSERT INTO citas(Fecha,Hora, Correo) VALUES ('$Fecha','$Hora','$Correo')") or die("Problemas en el select" . mysqli_error($conexion));

    //Se cierra la conexion a la base

    mysqli_close($conexion);

    //Se muestra un mensaje al usuario para indicar que todo salio bien

    echo "La cita fue asignada correctamente";



';




  ?>
</body>
</html>



