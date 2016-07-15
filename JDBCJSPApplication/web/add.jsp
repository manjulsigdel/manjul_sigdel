<%@include file="header.jsp" %>

<h1>Add Course</h1>

<form action="save.jsp" method="post">
    <div class="form-group">
        <label>Course Name</label>
        <input type="text" name="course_name" required="required" placeholder="Enter Course Name" class="form-control">
        
    </div>
    <div class="form-group">
        <label>Course Fees</label>
        <input type="number" name="fees" required="required" placeholder="Enter Course Fees" class="form-control">
    </div>
    <div class="checkbox">
    <label>
        <input type="checkbox" name="status"> Status
    </label>
  </div>
  <button type="submit" class="btn btn-success">Submit</button>
  <a href="index.jsp" class="btn btn-danger">Cancel</a>
</form>



<%@include file="footer.jsp" %>