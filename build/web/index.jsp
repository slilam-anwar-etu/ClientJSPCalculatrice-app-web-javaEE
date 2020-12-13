<%-- 
    Document   : index
    Created on : 28 nov. 2020, 12:03:10
    Author     : Pavilion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Anwar!</h1>
        
        <%-- start web service invocation --%><hr/>
        <%
        try {
            serviceclientjsp.CalculatriceWS_Service service = new serviceclientjsp.CalculatriceWS_Service();
            serviceclientjsp.CalculatriceWS port = service.getCalculatriceWSPort();
             // TODO initialize WS operation arguments here
            int i = 0;
            int j = 0;
            // TODO process result here
            int result = port.add(20, 30);
            out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
