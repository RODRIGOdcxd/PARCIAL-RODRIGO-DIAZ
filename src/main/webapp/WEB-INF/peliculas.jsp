<%@page import="bean.Pelicula"%>
<%@page import="java.util.List"%>
<%@ page pageEncoding="UTF-8"%>
<%	String[][] peliculas = (String[][]) session.getAttribute("data");
	for(String[] pelicula:peliculas){
%>2


<div class="contenido-pelicula">
	<div class="datos-pelicula">
		<h2><%=pelicula[1] %></h2><br/>
		<p><%=pelicula[2]%></p>
		<br/>
	       	<div class="boton-pelicula"> 
	       		<a href="PeliculaSVL?id=<%=pelicula[0]%>" >
	       			<img src="img/varios/btn-mas-info.jpg" width="120" height="30" alt="Ver info"/>
	       		</a>
			</div>
			<div class="boton-pelicula"> 
				<a href="http://www.cinestar.com.pe/popups/trailer/<%=pelicula[3]%>" onclick="return hs.htmlExpand(this, { objectType: 'iframe' } )" >
					<img src="img/varios/btn-trailer.jpg" width="120" height="30" alt="Ver trailer"/>
				</a>
	        </div> 
	</div>
	<img src="img/pelicula/<%=pelicula[0]%>.jpg" width="160" height="226"/><br/><br/>
</div>
<% }%>