
<%@page import="com.leapfrog.jjapp.entity.Course"%>
<%@page import="com.leapfrog.jjapp.dao.CourseDAO"%>
<%@page import="com.leapfrog.jjapp.dao.impl.CourseDAOImpl"%>
<%
    if(request.getMethod().equalsIgnoreCase("post")){
        CourseDAO courseDAO = new CourseDAOImpl();
        Course c=new Course();
        
        c.setId(Integer.parseInt(request.getParameter("id")));
            
        
        c.setName(request.getParameter("course_name"));
        c.setFees(Double.parseDouble(request.getParameter("fees")));
        c.setStatus((request.getParameter("status"))!=null);
        
        try{
            if(courseDAO.update(c)>0){
                response.sendRedirect("index.jsp?success");
            }else{
                response.sendRedirect("add.jsp?error");
            }
                
        }catch(Exception e){
            out.println(e.getMessage());
        }
    }
    
    else{
        out.println("<h1>SORRY!</h1>");
    }
    
%>