
<!DOCTYPE html>

<html>
<head>
<!--Titulo de la pagina-->
  <title>Servicios Ofrecidos</title>
   <!--Se enlaza a la hoja de estilos font-awesome para utilizar los iconos de las redes sociales-->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <!--Se enlaza a la hoja de estilos .css para generar diseños personalizados a la hoja-->
  <link rel="stylesheet" href="Ser.css">
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

  <!--   Tarjetas-->

<!-- contiene la clase title-card para su titulo original -->

<div class="title-cards">
    <h2>Servicios que Ofrecemos</h2>
  </div>

<!-- La clase container card contiene las tarjetas individuales de los servicios-->
<div class="container-card">

<!-- clase de las cartas individuales -->
<div class="card">

<!-- toda informacion lo que contiene la carta individual contenida en la etiqueta figure que genera un cuadro con la imagen -->
  <figure>
  <!-- enlace con la imagen-->
    <img src="https://i.postimg.cc/2j91Z2zF/encerado.png">
  </figure>

<!-- la clase contenido contiene la informacion siguiente en el cuadro con su titulo y su informacion con sus etiquetas-->
  <div class="contenido-card">
    <h3>Lavado y encerado</h3>
    <p>El lavado y encerado es un proceso de limpieza y protección del automóvil que remueve suciedad y aplicar cera para un brillo duradero.</p>

<!-- Se repite el mismo proceso con el resto de cards -->


  </div>
</div>
<div class="card">
  <figure>
    <img src="https://i.postimg.cc/SRPjbNZt/aspirado.jpg">
  </figure>
  <div class="contenido-card">
    <h3>Aspirado</h3>
    <p>Aspirado potente y eficiente que transforma la limpieza en una experiencia sin esfuerzo. Descubre el poder para mantener tu automovil impecable</p>

  </div>
</div>

<div class="card">
  <figure>
    <img src="https://i.postimg.cc/7hhbRTN2/Interiores.jpg">
  </figure>
  <div class="contenido-card">
    <h3>Detallado de interiores</h3>
    <p>Descubre un mundo de elegancia y comodidad con nuestros diseños de interiores excepcionales, donde cada espacio cobra vida con estilo y sofisticación. </p>

  </div>

</div>


<div class="card">
  <figure>
    <img src="https://i.postimg.cc/BZzv6bgm/restaurado.jpg">
  </figure>
  <div class="contenido-card">
    <h3>Detallado de partes negras</h3>
    <p>Descubre la elegancia y sofisticación en nuestra colección de partes negras, un toque distintivo para resaltar tu estilo único</p>

  </div>

</div>




</div>
<!--Fin   Tarjetas-->

    ';

    

  ?>
</body>
</html>