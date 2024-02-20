
<!DOCTYPE html>

<html>
<head>
<!--Titulo de la pagina-->
  <title>Paquetes</title>
   <!--Se enlaza a la hoja de estilos font-awesome para utilizar los iconos de las redes sociales-->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <!--Se enlaza a la hoja de estilos .css para generar diseños personalizados a la hoja-->
  <link rel="stylesheet" href="paquete.css">
</head>
<body>

    <!--Etiqueta php para imprimir el contenido de html generado por php-->
  <?php
    echo '

    <!-- Se crea un menu de navegacion *ul* en lista desordenada con 4 elementos de la lista *ul* -->
    <ul>
      <li>

         <!-- Su primer elemento en la lista es un icono de barras para desplegar el menu cuando se pasa encima de el con dropdown -->
        <a href="#" target="_blank"><i class="fa fa-bars"></i></a>
        <ul class="dropdown">

 <!-- Dentro del menu se generan elementos de la lista donde contienen enlaces que se dirigen  a las paginas correspondientes al hacer click-->
          <li><a href="servicio.php">Servicio</a></li>
          <li><a href="Horario.php">Horarios</a></li>
          <li><a href="">Preguntas Frecuentes</a></li>
          <li><a href="#">Citas</a></li>
           <li><a href="paquete.php">Paquetes</a></li>

        </ul>
      </li>


          <!-- Fuera del menu, al costado, se encuentran otros enlaces. -->
      <li><a href="Inicio.php">Inicio</a></li>
      <li><a href="Contacto.php">Contacto</a></li>
      <li><a href="Filo.php">Sobre Nosotros</a></li>

    </ul>


 <!-- a con la clase logo que contiene la imagen de la empresa y su src que es la url para la imagen -->

    <a href="#" class="logo">
        <img src="https://i.postimg.cc/br4YFVJ7/Proyecto.png" alt="Logo de la compañía">
    </a>
    ';


   //Incluye el archivo que muestra el pie de pagina
    include 'footer.php';

    echo '

    <h1>Paquetes</h1>
    <h1>Black & White Lavacar</h1>


    <div class="galeria">
    <h1>Básico</h1>
    <br><br>
    
        <p><i class="fa fa-check" style = "color: goldenrod"></i> Lavado de Carrocería</p><br>
        <p><i class="fa fa-check"></i> Aspirado de Asientos</p><br>
        <p><i class="fa fa-check"></i> Aspirado de Alfombras</p><br>
        <p><i class="fa fa-check"></i> Silicona a las Llantas</p><br>
    
    </div>

  <div class="galeria">
    <h1>Premium</h1>
    <br><br>
    <div class="pie">
        <p><i class="fa fa-check"></i> Aplicación de shampoo PH neutro Meguiar’s</p><br>
        <p><i class="fa fa-check"></i> Limpieza detallada de aros</p><br>
        <p><i class="fa fa-check"></i> Aplicación de cera Meguiar’s Hi-Tech a la carrocería</p><br>
        <p><i class="fa fa-check"></i> Aplicación de restaurador de partes negras externas</p><br>
        <p><i class="fa fa-check"></i> Detallado interno con productos Meguiar’s para Dash e hidratador de cueros</p><br>
        <p><i class="fa fa-check"></i> Limpieza de alfombras y un aspirado profundo</p><br>
  </div>
  </div>  

    ';

    

  ?>
</body>
</html>