<%@page import="com.leapfrog.jjapp.dao.impl.CourseDAOImpl"%>
<%@page import="com.leapfrog.jjapp.dao.CourseDAO"%>
<%@page import="com.leapfrog.jjapp.entity.Course"%>
<%@include file="header.jsp" %>
<%
    Course course= new Course();
    if(request.getParameter("id")==null || request.getParameter("id").isEmpty()){
        response.sendRedirect("index.jsp?error");
    }
    else{
        CourseDAO courseDAO = new CourseDAOImpl();
        
        try{
            int id=Integer.parseInt(request.getParameter("id")); 
        course=courseDAO.getById(id);
        if(course==null){
            course=new Course();
            response.sendRedirect("index.jsp?error");
            
        }
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
%>
<h1>Edit Course</h1>

<form action="saveupdate.jsp?id=<%=course.getId()%>" method="post">
    <div class="form-group">
        <label>Course Name</label>
        <input type="text" name="course_name" required="required" placeholder="Enter Course Name" class="form-control" value="<%=course.getName()%>">
        
    </div>
    <div class="form-group">
        <label>Course Fees</label>
        <input type="number" name="fees" required="required" placeholder="Enter Course Fees" class="form-control" value="<%=course.getFees()%>">
    </div>
    <div class="checkbox">
    <label>
        <input type="checkbox" name="status"> <% out.println((course.isStatus())?"checked":""); %>
        Status 
    </label>
  </div>
        <input type="hidden" value="<%=course.getId()%>">
  <button type="submit" class="btn btn-success">Submit</button>
  <a href="index.jsp" class="btn btn-danger">Cancel</a>
</form>



<%@include file="footer.jsp" %>