
<!DOCTYPE html>

<html>
<head>
<!--Titulo de la pagina-->
  <title>Contactanos</title>
   <!--Se enlaza a la hoja de estilos font-awesome para utilizar los iconos de las redes sociales-->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <!--Se enlaza a la hoja de estilos .css para generar diseños personalizados a la hoja-->
  <link rel="stylesheet" href="Contacto.css">
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


    include 'footer.php';


    echo '



<div class="title-cards">
    <h2>Contactanos</h2>
  </div>

  <!-- La clase container card contiene las tarjetas individuales de los servicios-->
<div class="container-card">
  
  <!-- clase de las cartas individuales -->
<div class="card">

<!-- toda informacion lo que contiene la carta individual contenida en la etiqueta figure que genera un cuadro con la imagen -->
  <figure>
    <!-- enlace con la imagen-->
    <img src="https://i.postimg.cc/9zH7XJg8/contactanos.png">
  </figure>


<!-- la clase contenido contiene la informacion siguiente en el cuadro con su titulo y su informacion con sus etiquetas-->

  <div class="contenido-card">
    <h3>Información Adicional</h3>

    <!--I class llama a los logos de font asome para colocar su icono al rende de las letras, la i contiene la informacion referente como su titulo-->

    <p><i class="fa fa-user-circle"></i>Nombre </p><br>
      <p><i class="fa fa-address-book"></i> 8467-5587</p><br>
       <p><i class="fa fa-envelope-open-o"></i>reservaciones@lavacarblackandwhite.com</p><br>


  </div>
</div>


<!-- Se repite el mismo proceso con el resto de cards -->


<div class="card">

<!--Se llama a la referencia del mapa de google maps-->

  <figure>
    <img src="https://i.postimg.cc/qqfrWnSx/Mapa.jpg">
  </figure>
  <div class="contenido-card">
    <h3>Direccion exacta</h3>
<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d245.5855972998439!2d-84.1087447!3d9.9863006!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8fa0e5aac21e6375%3A0x92ed014eca9274fa!2sLavacar%20Black%20%26%20White!5e0!3m2!1ses!2scr!4v1691126860904!5m2!1ses!2scr" width="400" height="300" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>

  </div>
</div>
</div>


<!--Fin   Tarjetas-->
    ';

    

  ?>
</body>
</html>