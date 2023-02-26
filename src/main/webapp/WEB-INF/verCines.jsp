<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<br/><h1>Nuestros Cines</h1><br/>
		<%
		String [][] iCines = (String [][]) session.getAttribute("mCines");
		for (String []sCine : iCines){ %>
				<div class="contenido-cine">
	        	    <img src="img/cine/<%= sCine[0] %>.1.jpg" width="227" height="170"/>
            	   	<div class="datos-cine">
       				   	<h4><%= sCine[1]%></h4><br/>
                		<span><%= sCine[4]%> - <%= sCine[6]%><br/><br/>Teléfono: <%= sCine[5]%></span>
                	</div>
                	<br/>
                	<a href="CineSVL?idCine=<%= sCine[0]%>">
                		<img src="img/varios/ico-info2.png" width="150" height="40"/>
                	</a>
				</div>
			<% }%>	
	</body>
</html>