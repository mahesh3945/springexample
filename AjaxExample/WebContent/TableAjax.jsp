<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src = "JQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function()
{
 $('#showbuton').click(function()
{
	 var empid =$('#empid').val();
	 $.ajax({url:"TableAjaxJdbc.jsp?empid="+empid,		
			
			success: function(result){
					/*alert(result);
				if(result.indexOf('success')!=-1)
					{
	                $("#userStatus").html("<font color=red>User not available</font>");
					}
				else
					{
					$("#userStatus").html("<font color=green>User available</font>");
					}*/
		  $('#empdata').html(result);			
					
	        }
	 
			}
			);
	 
}		 
);
}		
);


</script>
</head>
<body>
<input id =empid placeholder="Enter Emp Id" type="text"><input id = showbuton type="button" value="SHOW"><br>
<div id = empdata>

</div>
</body>
</html>