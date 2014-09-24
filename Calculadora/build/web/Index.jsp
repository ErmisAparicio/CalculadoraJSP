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
                        <!--<input type="text" placeholder="Link" id="link" name="link" >-->
                        <div class="botonesMemoria">
                            <input type="submit" value="Deg">
                            <input type="submit" value="(">
                            <input type="submit" value=")">
                            <input type="submit" value="%">
                            <input type="submit" value="MC">
                            <input type="submit" value="M+">
                            <input type="submit" value="M-">
                            <input type="submit" value="MR">
                        </div>
                        <div class="botonesMemoria">
                            <input type="submit" value="1/X">
                            <input type="submit" value="χ2">
                            <input type="submit" value="χ3">
                            <input type="submit" value="Y^X">
                            <input type="submit" value="C">
                            <input type="submit" value="+/-">
                            <input type="submit" value="÷">
                            <input type="submit" value="x">
                        </div>
                         <div class="botonesMemoria">
                            <input type="submit" value="X!">
                            <input type="submit" value="√">
                            <button title="y-th Root of Number x, sqrt(x, y)" ><i>y</i><b>√</b>x</button>
                            <input type="submit" value="log">
                            <input type="submit" value="7">
                            <input type="button" value="8">
                            <input type="submit" value="9">
                            <input type="submit" value="-">
                        </div>
                        <div class="botonesMemoria">
                            <input type="submit" value="sin">
                            <input type="submit" value="cos">
                            <input type="submit" value="tan">
                            <input type="submit" value="In">
                            <input type="submit" value="4">
                            <input type="submit" value="5">
                            <input type="submit" value="6">
                            <input type="submit" value="+">
                        </div>
                        <div class="botonesMemoria">
                            <input type="submit" value="sinh">
                            <input type="submit" value="cosh">
                            <input type="submit" value="tanh">
                            <input type="submit" value="eX">
                            <input type="submit" value="1">
                            <input type="submit" value="2">
                            <input type="submit" value="3">
                           <!-- <input type="submit" class="btnIgual" value="=">-->
                        </div>
                        <div class="botonesMemoria">
                            <input type="submit" value="2nd">
                            <input type="submit" value="π">
                            <input type="submit" value="EE">
                            <input type="submit" value="rnd">
                            <input type="submit" class="btnCero" value="0">
                            <input type="submit" value=".">
                        </div>
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
