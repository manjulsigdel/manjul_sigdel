

<%@page import="com.leapfrog.jjapp.entity.Course"%>
<%@page import="com.leapfrog.jjapp.dao.CourseDAO"%>
<%@page import="com.leapfrog.jjapp.dao.impl.CourseDAOImpl"%>
<%@include file="header.jsp" %>



<h1>Courses</h1>
<div class="pull-right">
    <p>
        <a href="add.jsp" class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-plus"> ADD</span></a>
    </p>
</div>
<table class="table table-bordered table-hover table-striped">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Fees</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    <% CourseDAO courseDAO = new CourseDAOImpl();%>
    <% for(Course c:courseDAO.getAll()){%>
    <tr>
        <td><%=c.getId()%></td>
        <td><%=c.getName()%></td>
        <td><%=c.getFees()%></td>
        <td><%=c.isStatus()%></td>
        <td>
            <a href="edit.jsp?id=<%=c.getId()%>" class="btn btn-success btn-xs"><span class="glyphicon glyphicon-pencil"></span></a>
            <a href="" class="btn btn-danger btn-xs" onclick=""><span class="glyphicon glyphicon-trash"></span></a>
        </td>
    </tr>
    <%}%>
</table>

<%@include file="footer.jsp" %>
            
 