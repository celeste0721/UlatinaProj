
<!DOCTYPE html>

<html>
<head>
<!--Titulo de la pagina-->
  <title>Horario</title>
   <!--Se enlaza a la hoja de estilos font-awesome para utilizar los iconos de las redes sociales-->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <!--Se enlaza a la hoja de estilos .css para generar diseños personalizados a la hoja-->
  <link rel="stylesheet" href="Horario.css">
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

/* El siguiente codigo contiene el encabezado de una tabla con su clase horario para generar estilos en el css
Se divide en 2 columnas *th* que contiene dia y horario
por otro lado estan sus filas con *tr* que muestra su informacion

*/


<div class="Horario">
    <h1>Nuestro Horario:</h1>
</div>

</div>

    <h2 class="Horario1">
        <table>
            <tr>
            <th>Día</th>
            <th>Horario</th>
            </tr>
            <tr>
            <td>Lunes</td>
            <td>9:00 - 18:00</td>
            </tr>
            <tr>
            <td>Martes</td>
            <td>9:00 - 18:00</td>
            </tr>
            <tr>
            <td>Miércoles</td>
            <td>9:00 - 18:00</td>
            </tr>
            <tr>
            <td>Jueves</td>
            <td>9:00 - 18:00</td>
            </tr>
            <tr>
            <td>Viernes</td>
            <td>9:00 - 18:00</td>
            </tr>
            <tr>
            <td>Sábado</td>
            <td>10:00 - 16:00</td>
            </tr>
            <tr>
            <td>Domingo</td>
            <td>Cerrado</td>
            </tr>
            </table>
  <!--cierre de etiquetas de la tabla-->

        </h2>
    </h2>

  <!--cierre de etiquetas de la clase tabla-->


</div>
 <!--cierre de etiquetas de la clase tabla-->

    ';

  ?>
</body>
</html>

  <!--Cierre de etiquetas del codigo -->