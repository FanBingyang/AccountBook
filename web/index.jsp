<%--
  Created by IntelliJ IDEA.
  User: FBY
  Date: 2019/8/23
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>

  <body>
  <% String path = request.getContextPath();%>
  <%=path%>
  <a href="${pageContext.request.contextPath}/test.action" onclick="test()">跳转</a>
  </body>
</html>
