<%@ page import="test.ssm.api.model.User" %>
<%@ page import="test.ssm.service.IUserServiceImpl" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%--
  Created by IntelliJ IDEA.
  User: sunjianchun
  Date: 17/2/16
  Time: 下午6:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm框架第一个接口测试</title>
</head>
<body>

    <%
        WebApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getSession().getServletContext());
        IUserServiceImpl iUserServiceImpl = (IUserServiceImpl) applicationContext.getBean("iUserServiceImpl");
        Integer id = Integer.parseInt(request.getParameter("id"));
        User user = iUserServiceImpl.getById(id);
        out.println(user.toString());
    %>

</body>
</html>
