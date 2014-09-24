<%-- 
    Document   : Calculadora
    Created on : 23-sep-2014, 22:32:28
    Author     : Ermis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang="es">
    <head>
        <title>Calculadora Web</title>
        <meta charset="UTF-8">
        <meta name="description" content="Proyecto N° 1 de Fundamentos de Programación Web" />
        <meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1"/>
        <link rel="shortcut icon" href="../CalculadoraWeb/images/favicon.ico"/>
        <link rel="stylesheet" href="CSS/normalize.css" />
	<link rel="stylesheet" href="CSS/estilos.css" />
        
   </head>
    <body>
        <header>
            <figure id = "logo">
		<img src = "images/logo.png" />
            </figure>
            <h1> Proyecto N°1 Calculadora Cientifica Uned</h1>
            <figure id = "avatar"></figure>
        </header>
        <nav>
            <ul>
                <li><a href="#">Calculadora</a></li>
		<li><a href="#">Manual de Usuario</a></li>
                <li><a href="#">Acerca de la App</a></li>
            </ul>
	</nav>
        <section id="contenido">
            <article class = "item">
                <div class = "titulo_item">
                    <form method= get action="" id="formulario" class="formulario">
                        <input type="text" placeholder="0" id="titulo" name="titulo" readonly="">
                        <!--<input type="text" placeholder="Link" id="link" name="link" >
                        <input type="submit" value="Agregar">-->
                    </form>
                </div>
            </article>
        </section>
        <script src="jquery-1.10.1.min.js" type="text/javascript"></script>
        <!--<script src = "http://code.jquery.com/jquery-1.10.1.min.js"></script>-->
        
        <script src = "CSS/prefixfree.js"></script>
        <script src="scriptAvatar.js" type="text/javascript"></script>
    </body>
    
</html>
