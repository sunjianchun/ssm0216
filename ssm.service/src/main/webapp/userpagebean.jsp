<%@ page import="test.ssm.api.model.PageBean" %>
<%@ page import="test.ssm.api.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="test.ssm.service.IUserServiceImpl" %>
<%@ page import="test.ssm.data.service.UserData" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%--
  Created by IntelliJ IDEA.
  User: sunjianchun
  Date: 17/2/21
  Time: 下午5:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>分页功能页面</title>
</head>
        <%
            WebApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getSession().getServletContext());
            IUserServiceImpl iUserServiceImpl = (IUserServiceImpl) applicationContext.getBean("iUserServiceImpl");
            Integer pageNum = Integer.parseInt(request.getParameter("pageNum"));
            Integer length = Integer.parseInt(request.getParameter("length"));

            PageBean<User> pageBean = iUserServiceImpl.getList(pageNum, length);

            List<User> list = pageBean.getData();
        %>
        <%= pageBean %>
<body>

</body>
</html>
