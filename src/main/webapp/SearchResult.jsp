<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="com.sankya.shop.dto.CategoryBean" %>
<%@page import="com.sankya.shop.dto.DetailsBean" %>
<%@page import="com.sankya.shop.dto.DetailsId" %>
<%@page import="com.sankya.shop.dto.PoductsBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>search result</title>
<jsp:include page="Index.jsp"></jsp:include>
</head>
<body>
<%List<PoductsBean> beans=(List<PoductsBean>)request.getAttribute("detaisl");%>
<%List<DetailsId> id=(List<DetailsId>)request.getAttribute("detaisl");%>
<%List<CategoryBean> cbean=(List<CategoryBean>)request.getAttribute("detaisl");%>
<%List<DetailsBean> dbean=(List<DetailsBean>)request.getAttribute("detaisl");%>
<table>
<tr>
<th>ProductId:</th>
<th>ProductName:</th>
<th>ProductPrice:</th>
<th>ProductDescription:</th>
</tr>
<%for(PoductsBean bean : beans){ %>
<tr>
<td><%=bean.getId() %></td>
<td><%=bean.getName() %></td>
<td><%=bean.getCatId() %></td>
</tr>
<%} %>
<%for(DetailsBean bean1 : dbean){ %>
<tr>
<td><%=bean1.getId() %></td>
<td><%=bean1.getPrice() %></td>
<td><%=bean1.getSpecification() %></td>
</tr>
<%} %>
</table>
</body>
</html>